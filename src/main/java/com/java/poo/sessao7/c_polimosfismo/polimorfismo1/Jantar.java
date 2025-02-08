package com.java.poo.sessao7.c_polimosfismo.polimorfismo1;

public class Jantar {
    public static void main(String[] args) {
        Lazanha lazanha = new Lazanha(0.8);

        Feijoada feijoada = new Feijoada(0.5);

        Sorvete sorvete = new Sorvete(0.3);

        Pessoa pessoa1 = new Pessoa("João", 78);
        pessoa1.comer(lazanha);
        pessoa1.comer(sorvete);

        System.out.printf("%s está com %s", pessoa1.getNome(), pessoa1.getPeso());

        Pessoa pessoa2 = new Pessoa("Maria", 97);
        pessoa2.comer(feijoada);
        pessoa2.comer(sorvete);

        System.out.printf("\n%s está com %s", pessoa2.getNome(), pessoa2.getPeso());
    }
}
