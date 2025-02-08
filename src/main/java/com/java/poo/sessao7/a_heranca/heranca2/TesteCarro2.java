package com.java.poo.sessao7.a_heranca.heranca2;

public class TesteCarro2 {
    public static void main(String[] args) {
        Veiculo2 carro = new Carro2();
        carro.print();

        carro.acelerar();

        carro.frear();

        Moto2 moto = new Moto2(34);
        moto.acelerar();

        moto.frear();
    }
}
