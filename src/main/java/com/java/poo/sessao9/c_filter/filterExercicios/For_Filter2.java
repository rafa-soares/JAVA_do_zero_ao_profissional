package com.java.poo.sessao9.c_filter.filterExercicios;

import java.util.ArrayList;
import java.util.List;

public class For_Filter2 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Rafa", 10.0);
        Aluno aluno2 = new Aluno("Ísis", 4.78);
        Aluno aluno3 = new Aluno("Tor", 7.8);
        Aluno aluno4 = new Aluno("Isac", 9.8);
        Aluno aluno5 = new Aluno("Nero", 2.1);
        Aluno aluno6 = new Aluno("Odin", 9.99);

        List<Aluno> aprovados = new ArrayList<>();

        if (aluno1.nota > 7) {
            aprovados.add(aluno1);
        }

        if (aluno2.nota > 7) {
            aprovados.add(aluno2);
        }

        if (aluno3.nota > 7) {
            aprovados.add(aluno3);
        }

        if (aluno4.nota > 7) {
            aprovados.add(aluno4);
        }

        if (aluno5.nota > 7) {
            aprovados.add(aluno5);
        }

        if (aluno6.nota > 7) {
            aprovados.add(aluno6);
        }

        for (Aluno aprovado : aprovados) {

            System.out.println(aprovado.nota);
        }
    }
}
