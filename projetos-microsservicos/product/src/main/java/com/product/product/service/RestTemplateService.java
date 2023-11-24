package com.product.product.service;

import com.product.product.model.Sku;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestTemplateService {
    public ResponseEntity<List<Object>> getRequestSku(String id) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<>();
        ResponseEntity response = restTemplate.getForEntity("https://sku-61iv.onrender.com/getSkubyProduct/" + id, Object.class);
        return response;
    }
}
