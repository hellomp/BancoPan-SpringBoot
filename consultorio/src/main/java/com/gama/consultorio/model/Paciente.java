package com.gama.consultorio.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Paciente implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  private String id;
  private String nome;
  private String telefone;
  
  public Paciente() {
  }

  public Paciente(String id, String nome, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

}
