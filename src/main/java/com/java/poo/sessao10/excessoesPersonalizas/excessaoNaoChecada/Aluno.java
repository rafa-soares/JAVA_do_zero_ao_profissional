package com.java.poo.sessao10.excessoesPersonalizas.excessaoNaoChecada;

public class Aluno {
    public String nome;
    public Double nota;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public static void validarNota(Aluno aluno) {
        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NotaInvalidaException("Nota do aluno %s está inválida!", aluno.nome);
        }
    }
}
