package com.gama.consultorio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Consulta implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  private String id;
  private String prescricoes;
  private String exames;
  private String prontuario;
  private String dataHora;

  @DBRef
  private Medico medico;

  private String paciente;

  public Consulta() {
  }

  public Consulta(String id, String prescricoes, String exames, String prontuario, String dataHora, Medico medico,
      String paciente) {
    this.prescricoes = prescricoes;
    this.exames = exames;
    this.prontuario = prontuario;
    this.dataHora = dataHora;
    this.medico = medico;
    this.paciente = paciente;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPrescricoes() {
    return prescricoes;
  }

  public void setPrescricoes(String prescricoes) {
    this.prescricoes = prescricoes;
  }

  public String getExames() {
    return exames;
  }

  public void setExames(String exames) {
    this.exames = exames;
  }

  public String getProntuario() {
    return prontuario;
  }

  public void setProntuario(String prontuario) {
    this.prontuario = prontuario;
  }

  public String getDataHora() {
    return dataHora;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public String getPaciente() {
    return paciente;
  }

  public void setPaciente(String paciente) {
    this.paciente = paciente;
  }

  
}
