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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/produtos",produces = {"application/json"})
@Tag(name = "api-desafio")
public class ProdutoResources {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	@Operation(summary = "Retorna todos os produtos existentes.",method = "GET")
	public ResponseEntity<List<Produto>> listaProdutos(){
		return ResponseEntity.ok().body(produtoService.listaProdutos());
	}
	
	@PostMapping
	@Operation(summary = "Inseri um novo produto.",method = "POST")
	public ResponseEntity<List<Produto>> inserirProduto(@RequestBody Produto produto){
		List<Produto> listaProdutos = produtoService.inserirProduto(produto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
		return ResponseEntity.created(uri).body(listaProdutos);
	}
	
	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deleta um produto por id.",method = "DELETE")
	public ResponseEntity<Produto> deletarProduto(@PathVariable Long id){
		produtoService.deletarProduto(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping(value = "/{id}")
	@Operation(summary = "Buscar um produto por id.",method = "GET")
	public ResponseEntity<Produto> buscarPorId(@PathVariable Long id){
		Produto produto = produtoService.buscarPorId(id);
		return ResponseEntity.ok().body(produto);
	}
}
