package com.sku.sku.controller;

import com.sku.sku.model.Sku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SkuController {

    @GetMapping(value = "/getSkubyProduct")
    List<Sku> getSkuByProductId(@RequestParam String id) {
       List<String> skus1 = Arrays.asList("SKU123", "SKU456");
       List<String> skus2 = Arrays.asList("SKU566", "SKU122");
       Sku sku1 = new Sku("1", skus1);
       Sku sku2 = new Sku("2", skus2);

       List<Sku> skuList = new ArrayList<>();
       skuList.add(sku1);
       skuList.add(sku2);

       List<Sku> result = skuList.stream().filter(p -> p.getProductId().equals(id)).collect(Collectors.toList());

       return result;
    }
}
