package com.projetosegundaunidade.projetosegundaunidade.service;

import com.projetosegundaunidade.projetosegundaunidade.entity.Produto;
import com.projetosegundaunidade.projetosegundaunidade.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public Produto create (Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }
}
