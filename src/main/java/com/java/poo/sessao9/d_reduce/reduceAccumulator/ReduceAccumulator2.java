package com.java.poo.sessao9.d_reduce.reduceAccumulator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceAccumulator2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//      Retornará um Optional.empty() caso o stream esteja vazio ou a operação não possa ser concluída
//      Evita NullPointerException
        System.out.println("Exemplo 1 - Utilizando variação simple do reduce, apenas com accumulator, em parallel stream");
        BinaryOperator<Integer> soma = (a, b) -> a + b; // combider implícito

        Optional<Integer> somaParallelStream = numeros.stream()
                .reduce(soma); // Optional<T> reduce(BinaryOperator<T> accumulator)

        somaParallelStream.ifPresent(print -> System.out.println(print)); // se não utilizar .ifPresent() não será printado

        System.out.println("\nExemplo 2 - Variação do Exemplo 1");
        numeros.parallelStream()
                .filter(n -> n > 5)
                .reduce((a, b) -> a + b) // Optional<T> reduce(BinaryOperator<T> accumulator)
                .ifPresent(print -> System.out.println(print));
    }
}
