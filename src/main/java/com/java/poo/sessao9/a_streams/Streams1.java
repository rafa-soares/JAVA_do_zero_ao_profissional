package com.java.poo.sessao9.a_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams1 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Lápis");
        Produto p3 = new Produto("Caderno");

        System.out.println("1- Sem STREAM: ");
        List<String> produtos = Arrays.asList(p1.nome, p2.nome, p3.nome);
        produtos.forEach(p -> System.out.println(p));

        System.out.println("\n2- Com STREAM: ");
        Stream<String> stream = produtos.stream();
        stream.forEach(p -> System.out.println(p));

        Consumer<String> oi = System.out::print;
    }
}