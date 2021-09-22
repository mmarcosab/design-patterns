package com.example.designpatterns.composite;

import java.math.BigDecimal;

public class TestesComposite {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento(new BigDecimal("500"));
        Orcamento novo = new Orcamento(new BigDecimal("500"));
        novo.addItem(antigo);
        System.out.println(novo.getQuantidadeItens());
    }

}
