package com.java.poo.sessao5.i_DesafioModulo;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Panqueca Fitness", 0.200);

        Comida c2 = new Comida("Purê de mandioquinha", 0.100);

        Pessoa p1 =  new Pessoa("Rafaela", 60.0);

        double pesoTotal = p1.comer(c1) + c2.getPesoComida();

        System.out.println("Peso antes de comer: " + p1.getPesoPessoa());

        System.out.println("Peso depois de comer: " +  pesoTotal);
    }
}
