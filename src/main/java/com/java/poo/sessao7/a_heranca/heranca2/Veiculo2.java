package com.java.poo.sessao7.a_heranca.heranca2;

import java.util.Scanner;

public class Veiculo2 {
    int velocidadeAtual;

    public Veiculo2() {
    }

    public Veiculo2(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    Scanner ler = new Scanner(System.in);

    public void print() {
        System.out.println("Qual a velocidade média do veículo em Km/h?");
        this.velocidadeAtual = ler.nextInt();
    }

    public void acelerar() {
        System.out.println("Deseja acelerar?");
        String sim = ler.next();

        while (sim.equals("S")) {
            this.velocidadeAtual += 5;

            if (this.velocidadeAtual >= 280) {
                System.out.println("Velocidade máxima de 280 Km/h!");
                break;
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", this.velocidadeAtual);
            }

            System.out.println("\nDeseja acelerar?");
            sim = ler.next();
        }
    }

    public void frear() {
        System.out.println("\nDeseja frear?");
        String sim = ler.next();

        while (sim.equals("S")) {
            this.velocidadeAtual -= 5;

            if (this.velocidadeAtual <= 0) {
                System.out.println("O veículo parou!");
                break;
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", this.velocidadeAtual);
            }

            System.out.println("Deseja frear?");
            sim = ler.next();
        }
    }
}
