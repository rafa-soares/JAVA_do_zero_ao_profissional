package com.java.poo.sessao9.c_filter.filterDesafio;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterDesafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Número de candidatos instritos no evento");
        Integer totalInscritos = ler.nextInt();

        // Criar lista de inscrições
        List<Integer> listaInscritos = IntStream.rangeClosed(1, totalInscritos)
                .boxed()
                .collect(Collectors.toList());

        // Criar uma lista de respostas para presenças
        List<String> respostas = listaInscritos.stream()
                .map(numero -> {
                    System.out.printf("\nO candidato %d participou do evento? (sim/não):\n", numero);
                    return numero + "-" + ler.next();
                })
                .collect(Collectors.toList());

        // Filtrar presenças
        List<String> listaPresenca = respostas.stream()
                .filter(resposta -> resposta.split("-")[1].equalsIgnoreCase("sim"))
                .map(resposta -> "Candidato " + resposta.split("-")[0] + " presente")
                .collect(Collectors.toList());

        // Filtrar ausências
        List<String> listaAusencia = respostas.stream()
                .filter(resposta -> resposta.split("-")[1].equalsIgnoreCase("nao"))
                .map(resposta -> "Candidato " + resposta.split("-")[0] + " ausente")
                .collect(Collectors.toList());

        // Imprimir resultados
        System.out.println("\nPresenças:");
        listaPresenca.forEach(presenca -> System.out.println(presenca));

        System.out.println("\nAusências:");
        listaAusencia.forEach(ausencia -> System.out.println(ausencia));
    }
}
