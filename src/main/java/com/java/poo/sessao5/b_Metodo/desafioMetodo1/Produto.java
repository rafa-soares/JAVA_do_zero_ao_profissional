package com.java.poo.sessao5.b_Metodo.desafioMetodo1;

public class Produto {
    String nome;
    double preco;
    double desconto;
    double precoComDesconto() {
        double precoFinal = preco * (1 - desconto);
        return precoFinal;
    }

    double precoComDescontoAdicional(double descontoGerente) {
        double precoFinal = preco * (1 - (desconto + descontoGerente));
        return precoFinal;
    }
}
