package com.myprojects.dio_desafio_api_rest_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.myprojects.dio_desafio_api_rest_spring_boot.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long>{

}
