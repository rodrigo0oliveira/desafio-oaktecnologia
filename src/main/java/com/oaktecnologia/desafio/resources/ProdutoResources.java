package com.oaktecnologia.desafio.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.oaktecnologia.desafio.domain.Produto;
import com.oaktecnologia.desafio.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResources {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> listaProdutos(){
		return ResponseEntity.ok().body(produtoService.listaProdutos());
	}
	
	@PostMapping
	public ResponseEntity<List<Produto>> inserirProduto(@RequestBody Produto produto){
		List<Produto> listaProdutos = produtoService.inserirProduto(produto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
		return ResponseEntity.created(uri).body(listaProdutos);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<List<Produto>> deletarProduto(@PathVariable Long id){
		List<Produto> listaProdutos = produtoService.deletarProduto(id);
		return ResponseEntity.ok().body(listaProdutos);
	}
}
