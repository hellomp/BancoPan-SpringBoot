package br.com.gama.controller;

import br.com.gama.model.DemoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/hello")
  public DemoModel ola(){
    return new DemoModel("Exposição de endpoints retornando objetos. Importância de utilizar as anotações", "Materiais da aula, aula do Jonathan, documentação do SpringBoot", "Alana, Alano, Carlos, José, Marcos");
  }
}
