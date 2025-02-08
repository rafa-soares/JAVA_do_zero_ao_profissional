package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse4;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }
    double precoComDesconto() {
        double precoFinal = preco * (1 - desconto);
        return precoFinal;
    }
}
