package com.java.poo.sessao7.b_encapsulamento.encapsulamento2;

public class Pessoa {

    private String nome;
    private double peso;

    public Pessoa(String nome, double peso){
        setNome(nome);
        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
