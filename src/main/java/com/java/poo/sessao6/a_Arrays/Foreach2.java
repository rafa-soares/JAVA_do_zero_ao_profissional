package com.java.poo.sessao6.a_Arrays;

import java.util.Arrays;

public class Foreach2 {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println("As notas iniciais são: " + Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 9.75;
        notasAlunoA[1] = 5.50;
        notasAlunoA[2] = 10.00;
        notasAlunoA[3] = 7.65;

        System.out.println("As notas depois das provas são: " + Arrays.toString(notasAlunoA));

        double soma = 0;
        for(double total1_AlunoA: notasAlunoA) {
            soma += total1_AlunoA;
            System.out.println("A média total das notas do aluno A é igual a: " + soma / 4);
        }
    }

}
