package com.java.poo.sessao7.d_interface.interface1;

public class Carro3 extends Veiculo3 implements Esportivo {

    public Carro3(int aceleracao, int freagem) {
        super(aceleracao, freagem);
    }

    @Override
    public void ligarTurbo() {
        System.out.println("Deseja ligar Turbo?");
        String sim = ler.next();

        if (sim.equals("S")) {
            velocidadeAtual += 30;

            if (velocidadeAtual >= 280) {
                System.out.printf("Velocidade máxima de %s Km/h!", velocidadeAtual);
                desligarTurbo();

            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", velocidadeAtual);
                desligarTurbo();
            }
        } else {
            System.out.printf("\nVelocidade atual: %s Km/h\n", velocidadeAtual);
        }
    }

    @Override
    public void desligarTurbo() {
        System.out.println("Deseja desligar Turbo?");
        String sim = ler.next();

        if (sim.equals("S")) {
            velocidadeAtual -= 30;

            if (velocidadeAtual >= 280) {
                System.out.printf("Velocidade máxima de %s Km/h!", velocidadeAtual);
            } else {
                System.out.printf("\nVelocidade atual: %s Km/h\n", velocidadeAtual);
            }
        } else {
            System.out.printf("\nVelocidade atual: %s Km/h\n", velocidadeAtual);
        }
    }
}
