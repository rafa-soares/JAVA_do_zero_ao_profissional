package com.java.poo.sessao9.c_filter.filterDesafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio2 {
    public static void main(String[] args) {
        ProdutosPromocao promocao1 = new ProdutosPromocao("Protetor", 30, "Pago");
        ProdutosPromocao promocao2 = new ProdutosPromocao("Hidratante", 35, "Grátis");
        ProdutosPromocao promocao3 = new ProdutosPromocao("Serum", 35, "Pago");
        ProdutosPromocao promocao4 = new ProdutosPromocao("Shampoo", 47, "Grátis");

        List<ProdutosPromocao> listaProdutos = Arrays.asList(promocao1, promocao2, promocao3, promocao4);

        Predicate<ProdutosPromocao> desconto = descontos -> descontos.getDesconto() >= 35;

        Function<ProdutosPromocao, String> superPromocao = produto ->
                produto.getDesconto() >= 35 && produto.getFrete().equalsIgnoreCase("Grátis") ? "Super Promoção " + produto.getProduto() : "";

        Predicate<ProdutosPromocao> frete = fretes -> fretes.getFrete().equalsIgnoreCase("Grátis");

        listaProdutos.stream()
                .filter(desconto)
                .filter(frete)
                .map(superPromocao)
                .forEach(produto -> System.out.println(produto));
    }
}