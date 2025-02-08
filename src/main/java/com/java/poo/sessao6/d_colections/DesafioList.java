package com.java.poo.sessao6.d_colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioList {
    public static void main(String[] args) {
        Integer ordemNotas = 0;
        Double notasAluno = 0.0;
        Double somaNotas = 0.0;
        Double mediaNotas = 0.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas o aluno possui? ");
        Integer quantidadeNotas = ler.nextInt();

        Map<Integer, Double> ordemValorNotas = new HashMap<>();

        for (int i = 0; i < quantidadeNotas; i++) {
            ordemNotas += 1;

            System.out.println("Digite a " + ordemNotas + "ª nota: ");
            notasAluno = ler.nextDouble();

            ordemValorNotas.put(ordemNotas, notasAluno);
        }
        System.out.println("\nAs notas do aluno são: " + ordemValorNotas.entrySet());

        for (Map.Entry<Integer, Double> n : ordemValorNotas.entrySet()) {
            somaNotas += n.getValue();
        }

        mediaNotas = somaNotas / quantidadeNotas;

        System.out.printf("A média das notas do aluno é igual a: %.2f%n",  mediaNotas);
    }
}
