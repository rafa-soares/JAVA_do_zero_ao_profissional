package com.java.poo.sessao7.b_encapsulamento.encapsulamento1;

import com.java.poo.sessao7.b_encapsulamento.encapsulamento1.teste.Carro3;
import com.java.poo.sessao7.b_encapsulamento.encapsulamento1.teste.Moto3;

public class TesteCarro3 {
    public static void main(String[] args) {
        Carro3 carro = new Carro3(10, 12);
        carro.teste();

        Moto3 moto = new Moto3(8, 10);
        moto.teste();
    }
}
