package com.java.poo.sessao10.excessoesPersonalizas.excessaoNaoChecada;

public class ExcessaoNaoChecada {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Alex", -3.00);
            Aluno.validarNota(aluno);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("FIM!");
    }
}
