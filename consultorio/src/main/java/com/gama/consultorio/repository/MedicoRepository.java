package com.gama.consultorio.repository;

import com.gama.consultorio.model.Medico;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String>{
  
}
