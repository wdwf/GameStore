package com.generation.gamestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gamestore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public List<Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
