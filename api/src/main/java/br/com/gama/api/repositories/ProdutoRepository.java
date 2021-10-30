package br.com.gama.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gama.api.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
  
}
