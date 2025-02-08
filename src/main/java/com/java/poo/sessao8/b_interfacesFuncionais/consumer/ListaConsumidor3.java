package com.java.poo.sessao8.b_interfacesFuncionais.consumer;

import java.util.Arrays;
import java.util.List;

public class ListaConsumidor3 {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Lápis");
        Produto p3 = new Produto("Caderno");

        List<Produto> produtos = Arrays.asList(p1, p2, p3);
        produtos.forEach(System.out::println);
    }
}
