package com.gama.consultorio.service;

import java.util.List;

import com.gama.consultorio.model.Medico;
import com.gama.consultorio.repository.MedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
  @Autowired
  MedicoRepository medicoRepository;

  public List<Medico> findAll(){
    return this.medicoRepository.findAll();
  }

  public Medico findById(String id){
    return this.medicoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Medico não encontrado"));
  }

  public Medico create(Medico medico){
    return this.medicoRepository.save(medico);
  }
}
