package com.java.poo.sessao7.d_interface.interface2;

import java.util.Scanner;

public class Conta implements Pagamento {
    double valorDeposito;
    double valorPagamento;
    double saldo;
    int sim;

    public void print() {
        do {
            Scanner ler = new Scanner(System.in);

            System.out.println("\n");
            System.out.println("+----------------------------------------------------+");
            System.out.println("|                         BANK                       |");
            System.out.println("+----------------------------------------------------+");
            System.out.println(
                    "|  CÓDIGO  |    OPÇÕES         |\n" +
                            "|    1     |   PAGAMENTO       |\n" +
                            "|    2     |   DEPÓSITO        |\n" +
                            "|    3     |   EXTRATO         |\n" +
                            "|    4     |   SAIR            |"
            );
            System.out.println("+----------------------------------------------------+");

            System.out.println("Qual transação deseja realizar?");
            int codigoTransacao = ler.nextInt();

            if (codigoTransacao == 4) {
                break;
            }

            escolherTransacoes(codigoTransacao);

            System.out.println("Deseja realizar uma nova transação?");
            System.out.println("1- SIM");
            System.out.println("2- NÃO");
            sim = ler.nextInt();

        } while (sim == 1);
    }

    public void escolherTransacoes(int codigoTransacao) {
        switch (codigoTransacao) {
            case 1:
                pagamento();
                extrato();
                break;
            case 2:
                deposito();
                extrato();
                break;
            case 3:
                extrato();
                break;
            default:
                break;
        }
    }

    @Override
    public double pagamento() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a conta do destinatário");
        int contaDestinatario = ler.nextInt();

        System.out.println("Qual o valor do pagamento?");
        valorPagamento = ler.nextDouble();

        return valorPagamento;
    }

    public double deposito() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o valor do depósito?");
        valorDeposito = ler.nextDouble();

        return valorDeposito;
    }

    public double saldo() {
        saldo = valorDeposito - valorPagamento;

        return saldo;
    }

    public void extrato() {
        saldo();

        System.out.println("\n");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|                       EXTRATO                      |");
        System.out.println("+----------------------------------------------------+");
        System.out.printf(
                "|  CÓDIGO  |    VALOR      \n" +
                        "|    DEPÓSITO      |   R$ %s     \n" +
                        "|    PAGAMENTO     |   R$ %s     \n" +
                        "|    TAXA          |   R$ 0.00   \n" +
                        "|    SALDO         |   %s        \n", valorDeposito, valorPagamento, saldo
        );
        System.out.println("+----------------------------------------------------+");
    }
}
