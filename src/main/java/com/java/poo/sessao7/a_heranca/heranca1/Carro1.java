package com.java.poo.sessao7.a_heranca.heranca1;

public class Carro1 extends Veiculo1 {

    public Carro1() {
        super();
        this.aceleracao = 5;
        this.freagem = 5;
    }

    public Carro1(int aceleracao, int freagem) {
        super(aceleracao, freagem);
    }

    @Override
    public int acelerar(int velocidadeTotal) {
        velocidadeTotal = this.velocidade + this.aceleracao;

        if (velocidadeTotal >= 280) {
            System.out.println("Velocidade máxima do carro 280 Km/h!");
        } else {
            System.out.printf("\nVelocidade atual: %s Km/h", velocidadeTotal);
        }
        return velocidadeTotal;
    }

    @Override
    public int frear(int velocidadeTotal) {
        velocidadeTotal = this.velocidade - this.freagem;

        if (velocidadeTotal <= 0) {
            System.out.println("O carro parou!");
        } else {
            System.out.printf("\nVelocidade atual: %s Km/h", velocidadeTotal);
        }
        return velocidadeTotal;
    }
}
