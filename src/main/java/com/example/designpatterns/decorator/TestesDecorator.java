package com.example.designpatterns.decorator;

import com.example.designpatterns.strategy.Orcamento;
import java.math.BigDecimal;

public class TestesDecorator {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        //posso decorar um imposto com outro, apenas adicionando mais impostos
        //decorator pq um objeto é composto por outro
        System.out.println(calculadoraImposto.calcular(orcamento, new ISS(new ICMS(null))));

    }

}
