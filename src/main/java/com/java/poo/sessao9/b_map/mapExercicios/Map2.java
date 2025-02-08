package com.java.poo.sessao9.b_map.mapExercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Map2 {
    public static void main(String[] args) {

        System.out.println("1- MAP utilizando composição: ");

        UnaryOperator<String> maiuscula = marca -> marca.toUpperCase();
        UnaryOperator<String> primeiraLetra = marca -> marca.charAt(0) + "";

        List<String> marcas = Arrays.asList("Chanel", "MAC", "Dior");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .forEach(marca -> System.out.println(marca));


        System.out.println("\n1- INTERFACES FUNCIONAIS utilizando composição: ");

        System.out.println(maiuscula.andThen(primeiraLetra).apply("Dior"));
    }
}
