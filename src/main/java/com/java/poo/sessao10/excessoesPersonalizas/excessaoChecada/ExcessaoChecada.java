package com.java.poo.sessao10.excessoesPersonalizas.excessaoChecada;

import com.java.poo.sessao10.excessoesPersonalizas.excessaoNaoChecada.Aluno;
import com.java.poo.sessao10.excessoesPersonalizas.excessaoNaoChecada.NotaInvalidaException;

public class ExcessaoChecada {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Andy", 11.00);
            Aluno.validarNota(aluno);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("FIM!");
    }
}
