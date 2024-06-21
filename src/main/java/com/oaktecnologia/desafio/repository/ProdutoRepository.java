package com.oaktecnologia.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oaktecnologia.desafio.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
