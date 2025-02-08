package com.java.poo.sessao8.a_lambda.lambdaDesafio;

public class Produto {
    String nome;

    Double preco;

    Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        return this.nome;
    }
}
