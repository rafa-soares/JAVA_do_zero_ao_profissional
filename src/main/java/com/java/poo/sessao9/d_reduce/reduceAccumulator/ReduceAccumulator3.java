package com.java.poo.sessao9.d_reduce.reduceAccumulator;

import java.util.Arrays;
import java.util.List;

public class ReduceAccumulator3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//      Evitar o uso direto de métod get
//      O métod get deve ser usado com cuidado, pois lançará uma exceção se o Optional estiver vazio
        System.out.println("Exemplo 1 - Utilizando método get com reduce");
        Integer total1 = numeros.stream().reduce((a, b) -> a + b).get();
        System.out.println(total1);
    }
}
