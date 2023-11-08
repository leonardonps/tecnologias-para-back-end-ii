package com.example.demo.servicos;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.entidades.dtos.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Produto;
import com.example.demo.repositorio.ProdutoRepositorioJPA;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositorioJPA produtoRepositorioJPA;
	
	public ProdutoDTO insert(ProdutoDTO produtoDTO) {
		/*List<Produto> teste = produtoRepositorioJPA.findAll();*/

		Produto prod = new Produto(produtoDTO.getId(), produtoDTO.getNome(), produtoDTO.getPreco());
		return new ProdutoDTO(produtoRepositorioJPA.save(prod));
	}
	
	
	public List<ProdutoDTO> findAll() {
		List<Produto> list = produtoRepositorioJPA.findAll();
		return list.stream().map(p -> new ProdutoDTO(p)).collect(Collectors.toList());
		
	}
	
	public Optional<ProdutoDTO> findById(Integer id) {
		Optional<Produto> produtoAchado = produtoRepositorioJPA.findById(id);
		Optional<ProdutoDTO> produtoAchadoDTO = Optional.of(new ProdutoDTO(produtoAchado));

		return produtoAchadoDTO;
	}






	public void delete(Integer id) {
		produtoRepositorioJPA.deleteById(id);

	}

	public Optional<ProdutoDTO> findByNameJpql(String nome) {
		Optional<Produto> prod = produtoRepositorioJPA.findNomeProdutoJpql(nome);
		Optional<ProdutoDTO> prodDto = Optional.of(new ProdutoDTO(prod));
		return prodDto;
	}

	public Optional<ProdutoDTO> findByNameSql(String nome) {
		Optional<Produto> prod = produtoRepositorioJPA.findNomeProdutoSql(nome);
		Optional<ProdutoDTO> prodDTO = Optional.of(new ProdutoDTO(prod));
		return prodDTO;
	}
	

}
