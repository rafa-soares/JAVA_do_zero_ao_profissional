package com.java.poo.sessao5.b_Metodo.desafioMetodo2;

public class Data {
    int dia;
    int mes;
    int ano;

    // Primeira tentativa de obter data
    public String obterDataFormatada1() {
        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }

    // Segunda tentativa de obter data
    public String obterDataFormatada2() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
