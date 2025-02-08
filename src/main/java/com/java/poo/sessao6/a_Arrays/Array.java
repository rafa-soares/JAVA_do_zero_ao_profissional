package com.java.poo.sessao6.a_Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println("As notas iniciais são: " + Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 9.75;
        notasAlunoA[1] = 5.50;
        notasAlunoA[2] = 10.00;
        notasAlunoA[3] = 7.65;

        System.out.println("As notas depois das provas são: " + Arrays.toString(notasAlunoA)); // Classe Arrays possui métodos estáticos específicos para array

        // For é utilizado para percorrer o array
        // i = 0 -> representa a posição que irá entrar no laço de repetição
        // i < 3 -> representa a posição que irá sair do laço de repetição, nesse caso será a posição do total de notas
        // De forma que o intervalo entre i = 0 e i < 3 é o que vai se repetir dentro do for
        // i ++ -> incremento
        double total1_AlunoA = 0;
        for (int i = 0; i < 3; i++) {
            total1_AlunoA += notasAlunoA[i];
        }

        System.out.println("A média das notas das três primeiras notas é igual a: " + total1_AlunoA / 3);

        // Não é correto utilizar o limite do array de forma fixa
        // O correto é utilizar o atributo do array para fazer referência ao total de notas (length)
        // length calcula a quantidade total de elementos no array
        double total2_AlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total2_AlunoA += notasAlunoA[i];
        }

        System.out.println("A média total das notas do aluno A é igual a: " + total2_AlunoA / notasAlunoA.length);

        final double notaArmazenada = 6.7;
        double[] notasAlunoB = {7.8, notaArmazenada, 9.6, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println("A média total das notas do aluno B é igual a: " + totalAlunoB / notasAlunoB.length);

    }

}
