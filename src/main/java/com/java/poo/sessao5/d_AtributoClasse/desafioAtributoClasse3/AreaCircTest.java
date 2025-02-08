package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse3;

public class AreaCircTest {
    public static void main(String[] args) {

        AreaCirc area1 = new AreaCirc(45);
//        AreaCirc.PI = 3.14; O valor de PI não consegue mais ser alterado (final)

        System.out.println(area1.area()); // A area é um método pertencente a instancia (area1)

        System.out.println(AreaCirc.areaCirc(75)); // A area é um método pertencente à classe (static)
    }
}
