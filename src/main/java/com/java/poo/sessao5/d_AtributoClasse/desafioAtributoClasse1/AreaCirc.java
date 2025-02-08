package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse1;

public class AreaCirc {

    double raio;
    double pi = 3.1415; //O valor de pi está associado as INSTÂNCIAS

    AreaCirc(double raioCircunferencia) {
        raio = raioCircunferencia;
    }
    double area() {
        double areaCircunferencia = pi * raio * raio;
        return areaCircunferencia;
    }
}
