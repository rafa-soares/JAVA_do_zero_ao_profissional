package com.java.poo.sessao8.b_interfacesFuncionais.consumer;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirProduto = p -> System.out.println(p.nome);

        Produto produto = new Produto("Caneta");
        imprimirProduto.accept(produto);
    }
}
