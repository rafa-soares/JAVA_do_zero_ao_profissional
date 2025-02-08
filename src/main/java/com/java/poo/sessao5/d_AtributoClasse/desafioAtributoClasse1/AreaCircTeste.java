package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse1;

public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc area1 = new AreaCirc(37);
        area1.pi = 3; //Instanciando um ATRIBUTO para modificar o valor de pi

        System.out.println(area1.area());

        AreaCirc area2 = new AreaCirc(60);
        area1.pi = 4; //Instanciando um ATRIBUTO para modificar o valor de pi

        System.out.println(area2.area());
        // Um resultado não vai influenciar no outro, pois pi apesar de ter sido setado como
        // constante não foi colocado como STATIC
    }
}
