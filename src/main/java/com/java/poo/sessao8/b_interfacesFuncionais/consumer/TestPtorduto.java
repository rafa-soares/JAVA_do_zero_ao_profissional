package com.java.poo.sessao8.b_interfacesFuncionais.consumer;

public class TestPtorduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta");
        printProduto(produto);
    }

    public static void printProduto(Produto produto) {
        System.out.println(produto.nome);
    }
}
