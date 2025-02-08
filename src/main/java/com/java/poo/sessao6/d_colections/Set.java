package com.java.poo.sessao6.d_colections;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        // Lista ordenada do tipo String
        // Dados homogênios
        SortedSet<String> listaAprovsdos = new TreeSet<>();
        listaAprovsdos.add("Cleo");
        listaAprovsdos.add("Ísis");
        listaAprovsdos.add("Isaac");

        for(String candidatos: listaAprovsdos) {
            System.out.println(candidatos);
        }

        // Lista não ordenada do tipo Integer
        HashSet<Integer> listaNums = new HashSet<>();
        listaNums.add(1);
        listaNums.add(13);
        listaNums.add(24);

        for(Integer nums: listaNums) {
            System.out.println(nums);
        }
    }
}
