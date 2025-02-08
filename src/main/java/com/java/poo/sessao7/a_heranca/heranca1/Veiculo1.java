package com.java.poo.sessao7.a_heranca.heranca1;

import java.util.Scanner;

public class Veiculo1 {
    int aceleracao;
    int freagem;
    int velocidade;

    public Veiculo1() {
        this.aceleracao = 2;
        this.freagem = 2;
    }

    public Veiculo1(int aceleracao, int freagem) {
        this.aceleracao = aceleracao;
        this.freagem = freagem;
    }

    Scanner ler = new Scanner(System.in);

    public void mover() {
        System.out.println("Qual a velocidade média do veículo em Km/h?");
        this.velocidade = ler.nextInt();

        System.out.println("Deseja acelerar?");
        String sim = ler.next();

        while (sim.equals("S")) {
            acelerar(this.velocidade);

            this.velocidade += this.aceleracao;

            System.out.println("\nDeseja acelerar?");
            sim = ler.next();
        }
    }

    public void parar() {
        System.out.println("Qual a velocidade média do veículo?");
        this.velocidade = ler.nextInt();

        System.out.println("Deseja frear?");
        String sim = ler.next();

        while (sim.equals("S")) {
            frear(this.velocidade);

            this.velocidade -= this.freagem;

            System.out.println("\nDeseja frear?");
            sim = ler.next();
        }
    }

    public int acelerar(int velocidadeTotal) {
        velocidadeTotal = this.velocidade + this.aceleracao;

        if (velocidadeTotal >= 280) {
            System.out.println("Velocidade máxima de 280 Km/h!");
        } else {
            System.out.printf("\nVelocidade atual: %s Km/h", velocidadeTotal);
        }
        return velocidadeTotal;
    }

    public int frear(int velocidadeTotal) {
        velocidadeTotal = this.velocidade - this.freagem;

        if (velocidadeTotal <= 0) {
            System.out.println("O veículo parou!");
        } else {
            System.out.printf("\nVelocidade atual: %s Km/h", velocidadeTotal);
        }
        return velocidadeTotal;
    }
}
