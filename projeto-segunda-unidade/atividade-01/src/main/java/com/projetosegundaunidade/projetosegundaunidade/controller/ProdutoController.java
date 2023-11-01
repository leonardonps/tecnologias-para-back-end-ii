package com.projetosegundaunidade.projetosegundaunidade.controller;

import com.projetosegundaunidade.projetosegundaunidade.entity.Produto;
import com.projetosegundaunidade.projetosegundaunidade.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        Produto produtoCriado = service.create(produto);
        return ResponseEntity.status(201).body(produtoCriado);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findAll() {
        return service.findAll();
    }
}
