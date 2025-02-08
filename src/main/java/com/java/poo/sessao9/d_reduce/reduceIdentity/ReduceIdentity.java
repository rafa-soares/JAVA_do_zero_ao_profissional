package com.java.poo.sessao9.d_reduce.reduceIdentity;

import java.util.Arrays;
import java.util.List;

public class ReduceIdentity {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("\nExemplo 1 - Utilizando método reduce com identity em stream comum");
        Integer total1 = numeros.stream()
                .reduce(100, (a, b) -> a + b);

        System.out.println(total1);

        System.out.println("\nExemplo 2 - Utilizando método reduce com identity em parallel stream");
        Integer total2 = numeros.parallelStream()
                .reduce(100, (a, b) -> a + b);

        System.out.println(total2);
    }
}
