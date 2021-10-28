package br.com.gama.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.api.models.Usuario;
import br.com.gama.api.services.UsuarioService;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
  @Autowired
  private UsuarioService usuarioService;

  @GetMapping("/{id}")
  public ResponseEntity<Usuario> findById(@PathVariable Integer id){
    Usuario obj = this.usuarioService.findById(id);
    return ResponseEntity.ok().body(obj);
  }

  @GetMapping
  public ResponseEntity<List<Usuario>> findAll(){
    List<Usuario> list = usuarioService.findAll();  
    return ResponseEntity.ok().body(list);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario usuario){
    Usuario newUsuario = usuarioService.update(id, usuario);
    return ResponseEntity.ok().body(newUsuario);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Integer id){
    usuarioService.delete(id);
    return ResponseEntity.noContent().build();
  }
}
