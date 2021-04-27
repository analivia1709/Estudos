package com.produtos.Api.Rest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.Api.Rest.models.Produto;
import com.produtos.Api.Rest.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController /*ele vai receber as requisições http*/
@RequestMapping (value= "/api")
@Api(value= "Api Rest Produtos")
@CrossOrigin(origins= "*")
public class ProdutoResource {
	
	@Autowired 
	ProdutoRepository produtoRepository;
	
	/*Esse metodo vai listar todos os produtos*/
	@GetMapping ("/produtos")
	@ApiOperation(value= "Retorna uma lista de produtos ")
	public  List <Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	/*Esse metodo vai listar um produto especifico*/
	@GetMapping ("/produto/{id}")
	@ApiOperation(value= "Retorna um produto unico")

	public Produto listaProdutoUnico(@PathVariable(value="id")long id) /*o metodo recebeu um arguemento para procurar algo especifico*/ {
		return produtoRepository.findById(id);
	}
	
	/*Meotodo para salvar o produto*/
	@PostMapping("/produto")
	@ApiOperation(value= "Salva um produto ")
	public Produto salvaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value= "Deleta um produto")
	public void deletaProduto(@RequestBody Produto produto){
		 produtoRepository.delete(produto);
	}
	

	@PutMapping("/produto")
	@ApiOperation(value= "Atualiza um produto ")
	public Produto atualizaProduto(@RequestBody Produto produto){
	  return produtoRepository.save(produto);
	}
	
	

}
