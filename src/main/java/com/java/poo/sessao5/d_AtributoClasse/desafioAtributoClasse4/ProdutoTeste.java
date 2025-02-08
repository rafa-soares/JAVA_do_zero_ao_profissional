package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse4;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Planner", 132.89);
        Produto.desconto = 0.35;

        Produto p2 = new Produto("Fichário Inteligente", 179.99);
        Produto.desconto = 0.25;

        System.out.printf(p1.nome + " - R$ %.2f.", p1.precoComDesconto());
        System.out.printf("\n" + p2.nome + " - R$ %.2f.", p2.precoComDesconto());

        double precoCarrinho = p1.precoComDesconto() + p2.precoComDesconto();

        System.out.printf("\nPreço total do carrinho: R$ %.2f.", precoCarrinho);
    }
}
