package com.java.poo.sessao5.i_DesafioModulo;

public class Comida {

    private String nomeComida;

    private double pesoComida;

    Comida(String nomeComida, double pesoComida) {
        this.nomeComida = nomeComida;
        this.pesoComida = pesoComida;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        this.nomeComida = nomeComida;
    }

    public double getPesoComida() {
        return pesoComida;
    }

    public void setPesoComida(double pesoComida) {
        this.pesoComida = pesoComida;
    }
}
