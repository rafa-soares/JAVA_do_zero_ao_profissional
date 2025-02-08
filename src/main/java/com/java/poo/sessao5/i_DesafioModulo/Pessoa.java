package com.java.poo.sessao5.i_DesafioModulo;

public class Pessoa {

    private String nomePessoa;

    private double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }
    public double comer(Comida comida){
        double pesoTotal = comida.getPesoComida() + pesoPessoa;
        return pesoTotal;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getPesoPessoa() {
        return pesoPessoa;
    }

    public void setPesoPessoa(double pesoPessoa) {
        this.pesoPessoa = pesoPessoa;
    }
}
