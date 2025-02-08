package com.java.poo.sessao5.c_Construtor.desafioConstrutor;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    public Data(int diaData, int mesData, int anoData) {
        dia = diaData;
        mes = mesData;
        ano = anoData;
    }
    public String obterDataFormatada2() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
