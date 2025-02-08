package com.java.poo.sessao9.c_filter.filterExercicios;

import java.util.Arrays;
import java.util.List;

public class Filter2 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Rafa", 10.0);
        Aluno aluno2 = new Aluno("Ísis", 4.78);
        Aluno aluno3 = new Aluno("Tor", 7.8);
        Aluno aluno4 = new Aluno("Isac", 9.8);
        Aluno aluno5 = new Aluno("Nero", 2.1);
        Aluno aluno6 = new Aluno("Odin", 9.99);

        List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        listaAlunos.stream()
                .filter(aluno -> aluno.nota >= 7)
                .map(aluno -> aluno.nota)
                .forEach(aluno -> System.out.println(aluno));
    }
}
