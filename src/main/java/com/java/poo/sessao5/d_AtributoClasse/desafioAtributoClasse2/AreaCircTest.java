package com.java.poo.sessao5.d_AtributoClasse.desafioAtributoClasse2;

public class AreaCircTest {

    public static void main(String[] args) {

        AreaCirc area1 = new AreaCirc(45);
        AreaCirc.pi = 3.14; // A forma correta nesse caso, é acessar o atributo (pi) diretamente através da CLASSE

        System.out.println(area1.area());

//      *************** OBSERVAÇÃO *****************

        // Se pi for instanciado por um atributo, apenas o valor da ultima instância prevalece
        // Mas nesse caso não é a forma correta de modificar o valor de pi

        AreaCirc area2 = new AreaCirc(37);
        area1.pi = 3; //Instanciando um ATRIBUTO, mas nesse caso não é a forma correta de modificar o valor de pi

        AreaCirc area3 = new AreaCirc(60);
        area1.pi = 0; //Instanciando um ATRIBUTO, mas nesse caso não é a forma correta de modificar o valor de pi

        System.out.println(area2.area());
        System.out.println(area3.area());
    }
}