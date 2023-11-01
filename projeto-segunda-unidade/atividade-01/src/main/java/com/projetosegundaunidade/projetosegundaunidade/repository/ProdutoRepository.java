package com.projetosegundaunidade.projetosegundaunidade.repository;

import com.projetosegundaunidade.projetosegundaunidade.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
