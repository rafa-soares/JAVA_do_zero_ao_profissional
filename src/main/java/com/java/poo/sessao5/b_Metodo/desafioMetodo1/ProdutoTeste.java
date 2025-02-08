package com.java.poo.sessao5.b_Metodo.desafioMetodo1;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Planner";
        p1.preco = 132.89;
        p1.desconto = 0.07;

        Produto p2 = new Produto();
        p2.nome = "Fichário Inteligente";
        p2.preco = 179.99;
        p2.desconto = 0.12;

        System.out.printf(p1.nome + " - R$ %.2f.", p1.precoComDesconto());
        System.out.printf("\n" + p2.nome + " - R$ %.2f.", p2.precoComDescontoAdicional(0.15));

        double precoCarrinho = p1.precoComDesconto() + p2.precoComDescontoAdicional(0.15);

        System.out.printf("\nPreço total do carrinho: R$ %.2f.", precoCarrinho);
    }
}
