package com.example.designpatterns.command;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GeraPedido {

    private String Cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
        Cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return Cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}
