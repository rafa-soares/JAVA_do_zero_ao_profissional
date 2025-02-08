package com.java.poo.sessao10.excessoesPersonalizas.tryCachFinally;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Tentando dividir por zero...");

            int resultado = 10 / 0; // Isso lançará uma exceção ArithmeticException

            System.out.println("\nIsso não será impresso.");
        } catch (ArithmeticException e) {
            System.out.println("\nOcorreu um erro: " + e.getMessage());
        } finally {
            System.out.println("\nEste bloco sempre será executado, independentemente de erro.");
        }

        System.out.println("\nPrograma continua normalmente...");
    }
}
