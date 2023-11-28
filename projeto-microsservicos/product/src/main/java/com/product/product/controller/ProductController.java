package com.product.product.controller;

import com.product.product.model.Product;
import com.product.product.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    RestTemplateService restTemplateService;

    @GetMapping(value = "/products")
    public List<Product> getProducts() {

        Product product = new Product("Rice", "Food", "1");
        Product product2 = new Product("Beans", "Food", "2");
        Product product3 = new Product("Pasta", "Food", "3");

        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);

        return products;
    }

    @GetMapping(value = "/skusForProduct/{id}")
    public ResponseEntity<List<Object>> getSkusForProduct(@PathVariable String id) {
        return restTemplateService.getRequestSku(id);
    }
}
