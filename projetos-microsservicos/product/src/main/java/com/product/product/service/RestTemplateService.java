package com.product.product.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestTemplateService {
    public ResponseEntity<List<Object>> getRequestSku(String id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity response = restTemplate.getForEntity("https://sku-61iv.onrender.com/getSkubyProduct/" + id, Object.class);
        return response;
    }
}
