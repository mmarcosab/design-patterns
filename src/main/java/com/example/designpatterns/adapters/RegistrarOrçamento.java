package com.example.designpatterns.adapters;


import com.example.designpatterns.strategy.Orcamento;
import lombok.SneakyThrows;

import java.util.Map;

public class RegistrarOrçamento {

    private HttpAdapter adapter;

    public RegistrarOrçamento(HttpAdapter adapter) {
        this.adapter = adapter;
    }

    @SneakyThrows
    public void registrar(Orcamento orcamento){
        if(!orcamento.isFinalizado()) {
            throw new Exception("orcamento nao finalizado");
        }

        String url = "http://api.com.br/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItend", orcamento.getQuantidadeItens()
        );

        adapter.post(url, dados);
    }
}
