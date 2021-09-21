package com.example.designpatterns.adapters;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpClient implements HttpAdapter{



    //implementação do primeiro adaptador
    @Override
    public void post(String url, Map<String, Object> dados) {
        try{
            URL urlExterna = new URL(url);
            URLConnection urlConnection = urlExterna.openConnection();
            urlConnection.connect();
        } catch (Exception e){
            System.out.println("deu ruim: " + e.getMessage());
        }
    }
}
