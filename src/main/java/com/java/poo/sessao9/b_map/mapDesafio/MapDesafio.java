package com.java.poo.sessao9.b_map.mapDesafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapDesafio {
    public static void main(String[] args) {
        System.out.println("NÚMEROS: ");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numeros.forEach(numero -> System.out.println(numero));

//      NÚMERO PARA STRING BINÁRIA
        Function<Integer, String> toBinaryString = string -> Integer.toBinaryString(string);

//      INVERTER STRING BINÁRIA
        UnaryOperator<String> inverterString = string -> new StringBuilder(string).reverse().toString();

//      CONVERTER STRING BINÁRIA PARA INTEIRO
        Function<String, Integer> stringToInteger = binaryString -> Integer.parseInt(binaryString, 2);

//      NÚMEROS CONVERTIDOS
        numeros.stream()
                .map(toBinaryString)
                .map(inverterString)
                .map(stringToInteger)
                .forEach(print -> System.out.println(print));
    }
}
