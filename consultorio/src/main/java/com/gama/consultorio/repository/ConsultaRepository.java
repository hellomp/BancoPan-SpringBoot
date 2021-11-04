package com.gama.consultorio.repository;

import com.gama.consultorio.model.Consulta;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsultaRepository extends MongoRepository<Consulta, String>{
  
}
