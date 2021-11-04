package com.gama.consultorio.service;

import java.util.List;

import com.gama.consultorio.model.Consulta;
import com.gama.consultorio.model.Medico;
import com.gama.consultorio.repository.ConsultaRepository;
import com.gama.consultorio.repository.MedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

  @Autowired
  ConsultaRepository consultaRepository;

  @Autowired
  MedicoRepository medicoRepository;

  public List<Consulta> findAll(){
    return this.consultaRepository.findAll();
  }

  public Consulta findById(String id){
    return this.consultaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Consulta não encontrada"));
  }

  public Consulta create(Consulta consulta){
    Medico medico = this.medicoRepository.findById(consulta.getMedico().getId()).orElseThrow(() -> new IllegalArgumentException("Médico não encontrado"));
    consulta.setMedico(medico);
    return this.consultaRepository.save(consulta);
  }
}
