package com.example.designpatterns.composite;

import java.math.BigDecimal;

public class Item implements Orcavel{
    private BigDecimal valor;
    private String nome;

    public Item(BigDecimal valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
