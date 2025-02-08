package com.java.poo.sessao5.b_Metodo.desafioMetodo2;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 12;
        data1.mes = 12;
        data1.ano = 2023;

        Data data2 = new Data();
        data2.dia = 15;
        data2.mes = 12;
        data2.ano = 2023;

        System.out.println(data1.obterDataFormatada2() + " - Vizita ao Cristo Redentor");
        System.out.println(data2.obterDataFormatada2() + " - Samba de Gafieira");
    }
}
