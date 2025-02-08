package com.java.poo.sessao5.e_ValorVsReferencia;

import com.java.poo.sessao5.c_Construtor.desafioConstrutor.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {

        // Atribuição por valor
        // Faz referência aos tipos primitivos, de forma que os valores das varáveis ao serem atribuidos, são independentes, apesar de serem cópia
        int a = 2;
        int b = a; // Atribuição por valor

        a++;
        b--;

        System.out.println("O valor de a antes da alteração é: " + a);
        System.out.println("O valor de b antes da alteração é: " + b);

        alterarPrimitivo(a); // Tipo primitivo não muda o valor de um objeto nem de outro tipo primitivo

        System.out.println("O valor de a depois da alteração é: " + a);
        System.out.println("O valor de b depois da alteração é: " + b);

        // Atribuição por referência
        // Faz refeência à objetos
        // Um objeto interfere no outro, pois compartilham o mesmo endereço de memória
        Data d1 = new Data(1, 1, 2025);
        Data d2 = d1; // Atribuição por referência

        d1.dia = 12;
        d2.mes = 8;

        System.out.println("A data em d1 é: " + d1.obterDataFormatada2());
        System.out.println("A data em d2 é: " + d2.obterDataFormatada2());

        voltarParaValorPadrao(d1); // Apenas valor de referência muda o valor de um um objeto

        System.out.println("A data em d1 é: " + d1.obterDataFormatada2());
        System.out.println("A data em d2 é: " + d2.obterDataFormatada2());

        // Os objetos passados em um método também são passados como referência
    }

    // Atribuição por referência - Métodos
    // Os parâmeetros dos métodos também são passsados como referência
    // O fato de ser possível alterar um oobjeto a partir de um método é por causa dos parâmetros do método.
    // Pois qnd passa um objeto como parâmetro para o método, na verdade está sendo compartilhado a referência de um objeto,
    // ou seja o seu endereço de memória, tornando possível a alteração de outro objeto.
    static void voltarParaValorPadrao(Data d) {
        d.dia = 7;
        d.mes = 9;
        d.ano = 2023;
    }

    // Tentando passar um valor primitivo como parâmeetro do método
    // O método não irá conseguir modificar outro valor primitivo e nenhum objeto
    static void alterarPrimitivo(int c) {
        c++;
    }
}
