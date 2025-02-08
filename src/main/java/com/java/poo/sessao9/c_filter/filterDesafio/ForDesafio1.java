package com.java.poo.sessao9.c_filter.filterDesafio;

import java.util.ArrayList;
import java.util.Scanner;

public class ForDesafio1 {
    public static void main(String[] args) {
        int numInscricaoParticipante;

        Scanner ler = new Scanner(System.in);

        System.out.println("Número de candidatos instritos no evento");
        Integer totalInscritos = ler.nextInt();

        ArrayList<Integer> listaInscritos = new ArrayList<>();

        ArrayList<String> listaPresenca = new ArrayList<>();
        ArrayList<String> listaAusencia = new ArrayList<>();

        while (listaInscritos.size() < totalInscritos) {
            numInscricaoParticipante = listaInscritos.size() + 1;
            listaInscritos.add(numInscricaoParticipante);

            System.out.printf("\nO candidato %s participou do evento?\n", numInscricaoParticipante);
            String sim_nao = ler.next();

            if (sim_nao.equalsIgnoreCase("sim")) {
                listaPresenca.add(sim_nao);
            } else {
                listaAusencia.add(sim_nao);
            }
        }

        System.out.println(listaPresenca);
        System.out.println(listaAusencia);
    }
}
