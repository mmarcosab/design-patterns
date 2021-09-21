package com.example.designpatterns.adapters;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> dados) throws IOException;
}
