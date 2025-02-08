package com.java.poo.sessao9.d_reduce.reduceCombider;

public class Media {

    public Double totalNotas = 0.0;
    public Integer quantidadeNotas = 0;

    public Media somaNotasIndividuais(double notas) {
        this.totalNotas += notas;
        this.quantidadeNotas++;

        return this;
    }

    public double calculoMedia() {
        return totalNotas / quantidadeNotas;
    }

    public static Media combinerMediaAprovados(Media media1, Media media2) {
        Media media = new Media();

        media.quantidadeNotas = media1.quantidadeNotas + media2.quantidadeNotas;
        media.totalNotas = media1.totalNotas + media2.totalNotas;

        return media;
    }
}
