package com.produtos.Api.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.Api.Rest.models.Produto;

/*Jpa possui metodos prontos*/
public interface ProdutoRepository extends JpaRepository <Produto, Long> {

	Produto findById(long id);
}
