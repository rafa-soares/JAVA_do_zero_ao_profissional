package com.java.poo.sessao7.d_interface.interface1;

public class TesteCarro3 {
    public static void main(String[] args) {
        Carro3 carro = new Carro3(10, 12);
        carro.print();

        carro.acelerar();

        carro.ligarTurbo();

        carro.frear();

        Veiculo3 moto = new Moto3(8, 10);
        moto.print();

        moto.acelerar();

        moto.frear();
    }
}
