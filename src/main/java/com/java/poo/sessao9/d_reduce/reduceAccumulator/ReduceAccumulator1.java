package com.java.poo.sessao9.d_reduce.reduceAccumulator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceAccumulator1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//      Retornará um Optional.empty() caso o stream esteja vazio ou a operação não possa ser concluída
//      Evita NullPointerException
        System.out.println("Exemplo 1 - Utilizando variação simple do reduce, apenas com accumulator, em stream comum");
        Optional<Integer> somaStream = numeros.stream()
                .reduce((a, b) -> a + b); // Optional<T> reduce(BinaryOperator<T> accumulator)

        somaStream.ifPresent(print -> System.out.println(print)); // se não utilizar .ifPresent() não será printado

        System.out.println("\nExemplo 2 - Variação do Exemplo 1");
        numeros.stream()
                .filter(n -> n > 5)
                .reduce((a, b) -> a + b)
                .ifPresent(print -> System.out.println(print));
    }
}
