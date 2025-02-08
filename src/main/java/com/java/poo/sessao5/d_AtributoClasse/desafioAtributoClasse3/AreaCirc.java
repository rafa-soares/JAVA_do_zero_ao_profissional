package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse3;

public class AreaCirc {

    static double raio;
    final static double PI = 3.1415; //O valor de pi está associado a CLASSE (static) e é constante (final), de modo que não pode mais ser alterado

    AreaCirc(double raioCircunferencia) {
        raio = raioCircunferencia;
    }

    public double area() {
        double areaCircunferencia = PI * Math.pow(raio, 2);
        return areaCircunferencia;
    }

    // Método da classe - Consegue chamar direto qualquer método da classe e também manipulando alguns campos da classe
    static double areaCirc(double areaCircunferencia) {
        areaCircunferencia = PI * Math.pow(raio, 2);
        return areaCircunferencia;
    }
}
