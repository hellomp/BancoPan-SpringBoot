package com.gama.consultorio.controller;

import java.util.List;

import com.gama.consultorio.model.Medico;
import com.gama.consultorio.service.MedicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
  @Autowired
  MedicoService medicoService;

  @GetMapping
  public List<Medico> findAll(){
    return this.medicoService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Medico> findById(@PathVariable String id){
    Medico medico = this.medicoService.findById(id);
    return ResponseEntity.ok().body(medico);
  }

  @PostMapping
  public Medico create(@RequestBody Medico medico){
    return this.medicoService.create(medico);
  }
  
}
