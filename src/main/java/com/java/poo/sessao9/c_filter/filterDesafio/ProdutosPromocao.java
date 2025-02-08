package com.java.poo.sessao9.c_filter.filterDesafio;

public class ProdutosPromocao {
    private String produto;

    private Integer desconto;

    private String frete;

    public ProdutosPromocao(String produto, Integer desconto, String frete) {
        this.produto = produto;
        this.desconto = desconto;
        this.frete = frete;
    }

    //
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }
}
