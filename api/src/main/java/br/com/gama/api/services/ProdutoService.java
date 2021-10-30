package br.com.gama.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gama.api.models.Produto;
import br.com.gama.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
  @Autowired
  ProdutoRepository produtoRepository;

  public List<Produto> findAll(){
    return produtoRepository.findAll();
  }

  public Produto findById(Integer id){
    Optional<Produto> produto = produtoRepository.findById(id);
    return produto.orElse(null);
  }

  public Produto create(Produto produto){
    produto.setId(null);
    return produtoRepository.save(produto);
  }

  public void delete(Integer id){
    findById(id);
    produtoRepository.deleteById(id);
  }
}
