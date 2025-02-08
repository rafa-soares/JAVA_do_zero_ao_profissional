package com.java.poo.sessao5.a_Classe.desafioClasse2;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();
        data1.dia = 5;
        data1.mes = 7;
        data1.ano = 2023;

        Data data2 = new Data();
        data2.dia = 8;
        data2.mes = 7;
        data2.ano = 2023;

        String compromisso1 = data1.dia + "/" + data1.mes + "/" + data1.ano;
        System.out.println(compromisso1 + " - Nutricionista");

        System.out.printf("%d/%d/%d - Samba de Gafieira", data2.dia, data2.mes, data2.ano);

    }
}
