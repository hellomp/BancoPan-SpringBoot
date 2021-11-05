package com.gama.consultorio.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medico implements Serializable{
  
  private static final long serialVersionUID = 1L;

  @Id
  private String id;
  private String nome;
  private String documentoProfissional;
  private String telefone;
  private String especialidade;
  
  public Medico() {
  }

  public Medico(String id, String nome, String documentoProfissional, String telefone, String especialidade) {
    this.id = id;
    this.nome = nome;
    this.documentoProfissional = documentoProfissional;
    this.telefone = telefone;
    this.especialidade = especialidade;
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

  public String getDocumentoProfissional() {
    return documentoProfissional;
  }

  public void setDocumentoProfissional(String documentoProfissional) {
    this.documentoProfissional = documentoProfissional;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Medico other = (Medico) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
