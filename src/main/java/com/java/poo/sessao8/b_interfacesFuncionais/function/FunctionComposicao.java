package com.java.poo.sessao8.b_interfacesFuncionais.function;

import java.util.function.Function;

public class FunctionComposicao {
    public static void main(String[] args) {
        Function<Integer, String> parImpar =
                numero -> numero % 2 == 0 ? "PAR!" : "IMPAR!";

        System.out.println(parImpar.apply(57));

        Function<String, String> print = mensagem -> "O resultado é " + mensagem;

        String resultado = parImpar
                .andThen(print)
                .apply(42);

        System.out.println(resultado);
    }
}
