package com.java.poo.sessao5.c_Construtor.desafioConstrutor;

public class DataTeste {

    public static void main(String[] args) {
        Data data1 = new Data();

        Data data2 = new Data(15, 12, 2023);

        System.out.println(data1.obterDataFormatada2() + " - Vizita ao Cristo Redentor");
        System.out.println(data2.obterDataFormatada2() + " - Samba de Gafieira");
    }
}
