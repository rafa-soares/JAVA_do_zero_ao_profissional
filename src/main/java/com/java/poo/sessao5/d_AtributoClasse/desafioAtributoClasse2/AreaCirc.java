package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse2;

public class AreaCirc {

    double raio;
    static double pi = 3.1415; //O valor de pi está associado a CLASSE (static)

    AreaCirc(double raioCircunferencia) {
        raio = raioCircunferencia;
    }
    double area() {
        double areaCircunferencia = pi * raio * raio;
        return areaCircunferencia;
    }
}
