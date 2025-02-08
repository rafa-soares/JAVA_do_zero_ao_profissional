package com.java.poo.sessao8.b_interfacesFuncionais.function;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10.0);

        calcularaQuadrado(calculadora.numero);
    }

    public static Double calcularaQuadrado(Double numero) {
        Double resultado = numero * numero;

        System.out.println(resultado);

        return resultado;
    }
}
