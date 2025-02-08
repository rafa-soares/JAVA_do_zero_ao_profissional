package com.java.poo.sessao7.d_interface.interface2;

import java.util.Scanner;

public class ContaCorrente extends Conta{
    double taxaPagamento;
    double pagamentoTotal;

    public ContaCorrente() {
        super();
        this.taxaPagamento = 0.002;
    }

    @Override
    public double pagamento() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a conta do destinatário");
        int contaDestinatario = ler.nextInt();

        System.out.println("Qual o valor do pagamento?");
        valorPagamento = ler.nextDouble();

        taxaPagamento *= valorPagamento ;

        pagamentoTotal = valorPagamento + taxaPagamento;

        return pagamentoTotal;
    }

    @Override
    public double saldo() {
        saldo = valorDeposito - pagamentoTotal;

        return saldo;
    }

    @Override
    public void extrato() {
        System.out.println("\n");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|                       EXTRATO                      |");
        System.out.println("+----------------------------------------------------+");
        System.out.printf(
                "|  CÓDIGO  |    VALOR      \n" +
                        "|    DEPÓSITO      |   R$ %s     \n" +
                        "|    PAGAMENTO     |   R$ %s     \n" +
                        "|    TAXA          |   R$ %s     \n" +
                        "|    SALDO         |   %s        \n", valorDeposito, valorPagamento, taxaPagamento, saldo()
        );
        System.out.println("+----------------------------------------------------+");
    }
}
