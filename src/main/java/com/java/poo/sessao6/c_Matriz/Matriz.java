package com.java.poo.sessao6.c_Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int quantidadeAlunos = 0;
        int quantidadeNotas = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma? ");
        quantidadeAlunos = ler.nextInt();

        System.out.println("Quantas notas cada aluno possui? ");
        quantidadeNotas = ler.nextInt();

        double[][] arrayAlunoNota = new double[quantidadeAlunos][quantidadeNotas];

        double totalNotas = 0;
        double mediaNotas = 0;

        for (int a = 0; a < arrayAlunoNota.length; a++) {
            for (int n = 0; n < arrayAlunoNota[a].length; n++) {
                System.out.println("Digite a " + (n + 1) + "ª nota do " + (a + 1) + "º aluno: ");
                arrayAlunoNota[a][n] = ler.nextDouble();

                totalNotas += arrayAlunoNota[a][n];

                mediaNotas = totalNotas / (arrayAlunoNota.length * arrayAlunoNota[a].length);
            }
        }
        System.out.println("\nNotas do(s) aluno(s): " + Arrays.deepToString(arrayAlunoNota));

        System.out.println("\nA média total da turma é: " + mediaNotas);
    }
}
