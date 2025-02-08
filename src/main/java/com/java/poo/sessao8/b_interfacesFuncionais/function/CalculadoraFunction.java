package com.java.poo.sessao8.b_interfacesFuncionais.function;

import java.util.function.Function;

public class CalculadoraFunction {
    public static void main(String[] args) {
        // TRÊS OPÇÕES DIFERENTES PARA PRINTAR FUNCTION

        // OPÇÃO 1:
        Function<Double, Double> calculadoraQuadratica =
                numero -> numero * numero;

        System.out.println(calculadoraQuadratica.apply(10.0));

        // OPÇÃO 2:
        Calculadora calculadora = new Calculadora(5.0);

        Double resultado = calculadoraQuadratica.apply(calculadora.numero);

        System.out.println(resultado);
    }
}
