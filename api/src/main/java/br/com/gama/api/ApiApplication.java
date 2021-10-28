package br.com.gama.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gama.api.models.Usuario;
import br.com.gama.api.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	@Autowired
	UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario1 = new Usuario("Marcos Paulo", "12345");
		Usuario usuario2 = new Usuario("Nilmara Cunha", "3536");
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2));
		
	}

}
