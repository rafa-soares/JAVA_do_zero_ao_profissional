package com.java.poo.sessao6.a_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        int quantidadeNotas = 0;
        double somaNotas = 0;
        int posicaoNota = 0;
        double notasAluno = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas o aluno possui? ");
        quantidadeNotas = ler.nextInt();

        double[] notasArray = new double[quantidadeNotas];

        for (int i = 0; i < notasArray.length; i++) {
            posicaoNota += 1;
            System.out.println("Digite a " + posicaoNota + "ª nota: ");
            notasAluno = ler.nextDouble();

            notasArray[i] = notasAluno;
        }

        for (double totalNotas : notasArray) {
            somaNotas += totalNotas;
        }

        System.out.println("\nNotas do aluno: " + Arrays.toString(notasArray));

        double mediaNotas = somaNotas / quantidadeNotas;
        System.out.println("\nA média das notas do aluno é igual a: " + mediaNotas);
    }
}
