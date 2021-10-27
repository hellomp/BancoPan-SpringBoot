package br.com.gama.model;

public class DemoModel {
  private String skills;
  private String resources;
  private String participantes;
  
  public DemoModel(String skills, String resources, String participantes) {
    this.skills = skills;
    this.resources = resources;
    this.participantes = participantes;
  }

  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  public String getResources() {
    return resources;
  }

  public void setResources(String resources) {
    this.resources = resources;
  }

  public String getParticipantes() {
    return participantes;
  }

  public void setParticipantes(String participantes) {
    this.participantes = participantes;
  }
  
}
