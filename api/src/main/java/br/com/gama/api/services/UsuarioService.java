package br.com.gama.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gama.api.models.Usuario;
import br.com.gama.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {
  @Autowired
  UsuarioRepository usuarioRepository;

  public Usuario findById(Integer id){
    Optional<Usuario> usuario = usuarioRepository.findById(id);
    return usuario.orElse(null);
  }

  public List<Usuario> findAll(){
    return usuarioRepository.findAll();
  }

  public Usuario update(Integer id, Usuario usuario){
    Usuario newUsuario = findById(id);
    newUsuario.setNome(usuario.getNome());
    newUsuario.setSenha(usuario.getSenha());
    return usuarioRepository.save(newUsuario);
  }
}
