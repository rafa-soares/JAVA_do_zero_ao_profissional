package com.java.poo.sessao7.a_heranca.heranca2;

public class Carro2 extends Veiculo2 {

    public Carro2() {
        super();
    }

    public Carro2(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public void acelerar() {
        System.out.println("Deseja acelerar?");
        String sim = ler.next();

        while (sim.equals("S")) {
            this.velocidadeAtual += 10;

            if (this.velocidadeAtual >= 280) {
                System.out.println("Velocidade máxima de 280 Km/h!");
                break;
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", this.velocidadeAtual);
            }

            System.out.println("\nDeseja acelerar?");
            sim = ler.next();
        }
    }

    @Override
    public void frear() {
        System.out.println("\nDeseja frear?");
        String sim = ler.next();

        while (sim.equals("S")) {
            this.velocidadeAtual -= 10;

            if (this.velocidadeAtual <= 0) {
                System.out.println("O veículo parou!");
                break;
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", this.velocidadeAtual);
            }

            System.out.println("Deseja frear?");
            sim = ler.next();
        }
    }
}
