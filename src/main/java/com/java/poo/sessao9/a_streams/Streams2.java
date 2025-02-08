package com.java.poo.sessao9.a_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        System.out.println("******************* FORMAS DE UTILIZAR STREAM *******************");

        System.out.println("\n1- Criando STREAM a partir de uma LISTA (1): ");
        List<String> langs1 = Arrays.asList("C ", "C++ ");
        langs1.stream().forEach(langs -> System.out.println(langs));

        System.out.println("\n2- Criando STREAM a partir de uma LISTA (2): ");
        Stream<String> stream = langs1.stream();
        stream.forEach(langs -> System.out.println(langs));

        System.out.println("\n3- Criando STREAM a partir de uma LISTA (3): ");
        Stream.of(langs1).forEach(langs -> System.out.println(langs));

        System.out.println("\n4- Criando STREAM a partir de um ARRAY(1): ");
        String[] langs4 = {"Python ", "R "};
        Stream.of(langs4).forEach(langs -> System.out.println(langs));

        System.out.println("\n5- Criando STREAM a partir de um ARRAY(2): ");
        Arrays.stream(langs4).forEach(langs -> System.out.println(langs));
        
        System.out.println("\n6- Criando lista diretamente na interface do STREAM: ");
        Stream<String> langs6 = Stream.of("Java ", "Kotlin");
        langs6.forEach(langs -> System.out.println(langs));

    }
}
