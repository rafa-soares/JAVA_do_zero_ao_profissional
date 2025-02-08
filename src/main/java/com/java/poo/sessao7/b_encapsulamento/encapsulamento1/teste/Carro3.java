package com.java.poo.sessao7.b_encapsulamento.encapsulamento1.teste;

public class Carro3 extends Veiculo3 {

    public Carro3(int aceleracao, int freagem) {
        super(aceleracao, freagem);
    }

    public void teste() {
        this.print();
        this.acelerar();
        this.frear();
    }
}
