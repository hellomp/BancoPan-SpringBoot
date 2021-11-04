package com.gama.consultorio.controller;

import com.gama.consultorio.service.ConsultaService;

import java.util.List;

import com.gama.consultorio.model.Consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
  @Autowired
  ConsultaService consultaService;

  @GetMapping
  public List<Consulta> findAll(){
    return this.consultaService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Consulta> findById(@PathVariable String id){
    Consulta consulta = this.consultaService.findById(id);
    return ResponseEntity.ok().body(consulta);
  }

  @PostMapping
  public Consulta create(@RequestBody Consulta consulta){
    return this.consultaService.create(consulta);
  }
}
