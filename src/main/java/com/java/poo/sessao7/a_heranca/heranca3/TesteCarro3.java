package com.java.poo.sessao7.a_heranca.heranca3;

public class TesteCarro3 {
    public static void main(String[] args) {
        Veiculo3 carro = new Carro3(10, 12);
        carro.print();

        carro.acelerar();

        carro.frear();

        Moto3 moto = new Moto3(8, 10);
        moto.print();

        moto.acelerar();

        moto.frear();
    }
}
