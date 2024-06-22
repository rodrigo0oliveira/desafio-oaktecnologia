package com.oaktecnologia.desafio.services;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.oaktecnologia.desafio.domain.Produto;
import com.oaktecnologia.desafio.repository.ProdutoRepository;
import com.oaktecnologia.desafio.services.exceptions.RecursoNaoEncontrado;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listaProdutos(){
		List<Produto> listaProdutos = produtoRepository.findAll();
		listaProdutos.sort(comparadorValor);
		return listaProdutos;
	}
	
	public List<Produto> inserirProduto(Produto produto){
		 produtoRepository.save(produto);
		 return listaProdutos();
	}
	
	public void deletarProduto(Long id){
		try {
			produtoRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new RecursoNaoEncontrado("Produto não encontrado!");
		}
	}
	

	Comparator<Produto> comparadorValor = (p1,p2)->{return p1.getValor().compareTo(p2.getValor());};
}
