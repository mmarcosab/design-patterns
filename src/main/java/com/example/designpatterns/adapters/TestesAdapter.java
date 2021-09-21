package com.example.designpatterns.adapters;

import com.example.designpatterns.strategy.Orcamento;
import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) throws Exception {
        Orcamento orcamento = new Orcamento(new BigDecimal("700"), 6);
        orcamento.aprovar();
        orcamento.finalizar();
        RegistrarOrçamento registrarOrçamento = new RegistrarOrçamento(new HttpClient());
        registrarOrçamento.registrar(orcamento);
    }

}
