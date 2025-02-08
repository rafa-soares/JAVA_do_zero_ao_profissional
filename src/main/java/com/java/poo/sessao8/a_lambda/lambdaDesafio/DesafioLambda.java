package com.java.poo.sessao8.a_lambda.lambdaDesafio;

import java.util.function.Function;

public class DesafioLambda {
    public static void main(String[] args) {
        // Função para calcular o imposto
        Function<Produto, Double> valorImposto = produto -> {
            Double imposto = (produto.preco * 0.85);
            return produto.preco > 2500.0 ? imposto : 0.0;
        };

        // Função para calcular o frete
        Function<Produto, Double> valorFrete =
                produto -> produto.preco > 3000.0 ? 0.0 : 50.0;

        // Função para calcular o desconto
        Function<Produto, Double> valorDesconto = produto -> {
            Double desconto = (produto.preco * 0.13);
            return desconto;
        };

        // Função que calcula o valor total a pagar
        Function<Produto, Double> valorPagar = produto -> {
            Double imposto = valorImposto.apply(produto);
            Double frete = valorFrete.apply(produto);
            Double desconto = valorDesconto.apply(produto);
            Double resultado = (produto.preco + imposto + frete) - desconto;

            return resultado;
        };

        Produto p1 = new Produto("Kindle", 3235.89, 0.13);
        Produto p2 = new Produto("Planner", 199.99, 0.13);

        // Resultado final
        System.out.printf("O preço final do %s é %.2f", p1.nome,  valorPagar.apply(p1));
        System.out.printf("\nO preço final do %s é %.2f", p2.nome, valorPagar.apply(p2));
        /*
         * imposto = valor bruto * 8,5%
         * frete = valor bruto + 50
         * desconto = valor bruto * desconto
         * TOTAL = (valor bruto + imposto + frete) - desconto
         */
    }
}
