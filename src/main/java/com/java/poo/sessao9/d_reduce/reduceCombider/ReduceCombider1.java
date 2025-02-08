package com.java.poo.sessao9.d_reduce.reduceCombider;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceCombider1 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafa", 10.0);
        Aluno aluno2 = new Aluno("Ísis", 4.78);
        Aluno aluno3 = new Aluno("Tor", 7.8);
        Aluno aluno4 = new Aluno("Isaac", 9.8);
        Aluno aluno5 = new Aluno("Nero", 2.1);
        Aluno aluno6 = new Aluno("Odin", 9.99);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        BiFunction<Media, Double, Media> calcularMediaAprovados =
                (media, nota) -> media.somaNotasIndividuais(nota);

        BinaryOperator<Media> combinarMediaAprovados =
                (media1, media2) -> Media.combinerMediaAprovados(media1, media2);

        Media mediaAprovados = alunos.parallelStream()
                .filter(aluno -> aluno.nota >= 7)
                .map(aluno -> aluno.nota)
                .reduce(new Media(), calcularMediaAprovados, combinarMediaAprovados);

        System.out.println(mediaAprovados.calculoMedia());
    }
}
