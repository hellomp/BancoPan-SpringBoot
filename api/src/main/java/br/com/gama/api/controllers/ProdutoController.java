package br.com.gama.api.controllers;

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

import br.com.gama.api.models.Produto;
import br.com.gama.api.services.ProdutoService;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {
  @Autowired
  ProdutoService produtoService;

  @GetMapping("/{id}")
  public ResponseEntity<Produto> findById(@PathVariable Integer id){
    Produto produto = produtoService.findById(id);
    return ResponseEntity.ok().body(produto);
  }

  @GetMapping()
  public ResponseEntity<List<Produto>> findAll(){
    List<Produto> produtos = produtoService.findAll();
    return ResponseEntity.ok().body(produtos);
  }

  @PostMapping
  public ResponseEntity<Produto> create(@RequestBody Produto produto){
    Produto newProduto = produtoService.create(produto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newProduto.getId()).toUri();
    return ResponseEntity.created(uri).build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Integer id){
    produtoService.delete(id);
    return ResponseEntity.noContent().build();
  }
}
