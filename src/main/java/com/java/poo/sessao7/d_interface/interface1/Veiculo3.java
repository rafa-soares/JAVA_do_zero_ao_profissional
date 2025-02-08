package com.java.poo.sessao7.d_interface.interface1;

import java.util.Scanner;

public class Veiculo3 {
    int velocidadeAtual;
    int aceleracao;
    int freagem;

    public Veiculo3(int aceleracao, int freagem) {
        this.aceleracao = aceleracao;
        this.freagem = freagem;
    }

    Scanner ler = new Scanner(System.in);

    public void print() {
        System.out.println("Qual a velocidade média do veículo em Km/h?");
        velocidadeAtual = ler.nextInt();
    }

    public void acelerar() {
        System.out.println("Deseja acelerar?");
        String sim = ler.next();

        while (sim.equals("S")) {
            velocidadeAtual += aceleracao;

            if (velocidadeAtual >= 280) {
                System.out.printf("Velocidade máxima de %s Km/h!", velocidadeAtual);
                break;
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", velocidadeAtual);
            }

            System.out.println("\nDeseja acelerar?");
            sim = ler.next();
        }
    }

    public void frear() {
        System.out.println("\nDeseja frear?");
        String sim = ler.next();

        while (sim.equals("S")) {
            velocidadeAtual -= freagem;

            if (velocidadeAtual <= 0) {
                System.out.println("O veículo parou!");
                break;
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", velocidadeAtual);
            }

            System.out.println("Deseja frear?");
            sim = ler.next();
        }
    }
}
