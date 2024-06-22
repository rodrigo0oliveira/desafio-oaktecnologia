package com.oaktecnologia.desafio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.oaktecnologia.desafio.domain.Produto;
import com.oaktecnologia.desafio.repository.ProdutoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		produtoRepository.deleteAll();
		
		 Produto produto1 = new Produto("Notebook", "Notebook rápido e leve", 2500.0, true,null);
	     Produto produto2 = new Produto("Smartphone", "Smartphone com câmera de alta resolução", 1200.0, true,null);
	     Produto produto3 = new Produto("Livro", "Romance best-seller", 35.0, true,null);
			/*
			 * Produto produto4 = new Produto("Fones de Ouvido",
			 * "Fones de ouvido com cancelamento de ruído", 150.0, false,null); Produto
			 * produto5 = new Produto("Cadeira Gamer", "Cadeira ergonômica para gamers",
			 * 400.0, true,null);
			 */

	     produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3));
		
	}

}
