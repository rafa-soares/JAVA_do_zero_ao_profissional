package com.java.poo.sessao8.b_interfacesFuncionais.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListaConsumidor1 {
    public static void main(String[] args) {
        Consumer<Produto> imprimirProduto = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Lápis");
        Produto p3 = new Produto("Caderno");

        List<Produto> produtos = Arrays.asList(p1, p2, p3);
        produtos.forEach(imprimirProduto);
    }
}
