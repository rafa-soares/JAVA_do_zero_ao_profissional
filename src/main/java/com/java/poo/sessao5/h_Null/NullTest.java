package com.java.poo.sessao5.h_Null;

import com.java.poo.sessao5.g_This.Data;

public class NullTest {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("Valor Vazio"));

        Data d1 = null;
//        d1.mes = 3; Não é possível acessar, através de atributos ou métodos, valores NULL. Dará o erro: Null Pointer Exceptional

        // Em casos de valores nulos é preciso checar se a variavel é NULL ou não
        // Pois não é possível acessar, através de atributos ou métodos, valores NULL
        // Caso contrário dará o erro: Null Pointer Exceptional
        Data d2 = Math.random() > 0.5 ? new Data() : null;

        if (d2 != null) {
            d2.mes = 03;
            System.out.println(d2.obterDataFormatada2());
        }

    }
}
