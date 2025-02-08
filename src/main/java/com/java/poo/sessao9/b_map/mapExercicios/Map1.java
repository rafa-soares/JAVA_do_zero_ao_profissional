package com.java.poo.sessao9.b_map.mapExercicios;

import java.util.Arrays;
import java.util.List;

public class Map1 {
    public static void main(String[] args) {

        List<String> marcas = Arrays.asList("Chanel", "MAC", "Dior");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print -> System.out.println(print));
    }
}
