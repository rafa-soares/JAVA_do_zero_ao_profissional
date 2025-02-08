package com.java.poo.sessao7.d_interface.interface2;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.print();

        ContaPoupanca contaPoupanca =  new ContaPoupanca();

        contaPoupanca.print();
    }
}
