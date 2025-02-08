package com.java.poo.sessao6.a_Arrays;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = { 9.4, 7.2, 6.7, 8.1 };

        double nota1 = 0;
        for(int i = 0; i < notas.length; i++) {
            nota1 = notas[i];
            System.out.print(nota1 + " ");
        }

        System.out.println();

        // foreach é utilizado para percorrer todas as notas, sem pular nenhuma
        for(double nota2: notas) {
            System.out.print(nota2 + " ");
        }
    }
}
