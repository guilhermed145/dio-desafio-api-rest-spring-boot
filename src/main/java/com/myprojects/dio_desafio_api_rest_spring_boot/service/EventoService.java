package com.myprojects.dio_desafio_api_rest_spring_boot.service;

import com.myprojects.dio_desafio_api_rest_spring_boot.model.Evento;

public interface EventoService {

    Evento findById(Long id);

    Evento create(Evento evento);
}
