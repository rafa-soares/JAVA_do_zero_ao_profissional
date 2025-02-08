package com.java.poo.sessao5.g_This;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    // Utilizando o Contrutor com o os atributos
//    public Data() {
//        dia = 01;
//        mes = 01;
//        ano = 1970;
//    }

    // Utilizando this() como método no construtos
    // Utilizado quando dentro de um construtor, precisa chamar outro construtor
    public Data () {
        this(01, 01, 1070);
    }

    // Utilizando this. para referenciar um atributo externo fora do construtor:
    // Os parâmetros do construtor só ficam visíveis dentro do construtor
    // Sendo necessário esses parâmetros (dia, mes, ano) serem atribuídos aos atributos da classe (this.dia, this.mes, this.ano)
    // Com a finalidade de ficarem visíveis e poderem ser acessados por objetos
    public Data(int dia, int mes, int ano) {
        this.dia = dia; // This.dia pertence ao atributo da classe data que poderá ser instanciado, enquanto dia pertentence ao parâmetro do construtor
        this.mes = mes; // This.mes pertence ao atributo da classe data que poderá ser instanciado, enquanto mes pertentence ao parâmetro do construtor
        this.ano = ano; // This.ano pertence ao atributo da classe data que poderá ser instanciado, enquanto ano pertentence ao parâmetro do construtor
    }

    // This. é utilizado apenas em métodos de instância (aqueles que estão disponíveis apenas quando se instancia um objeto, pois manipulam os atributos contidos nesta instância)
    public String obterDataFormatada2() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada2()); // sinaliza que é um método de instância
    }

//    This.
// Qnd se deseja acessar uma variável que pertence à instância (objeto)
// Se um atributo NÃO contem static, é uma variável de instância. De forma que só pode ser acessado por um objeto
//   *  OBS: Também existe métodos de instância
// Se um atributo contem static, é uma variável de classe. De forma que é acessado diretamente pela classe

}
