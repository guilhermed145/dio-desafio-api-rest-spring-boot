package com.myprojects.dio_desafio_api_rest_spring_boot.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.myprojects.dio_desafio_api_rest_spring_boot.model.Evento;
import com.myprojects.dio_desafio_api_rest_spring_boot.repository.EventoRepository;
import com.myprojects.dio_desafio_api_rest_spring_boot.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {

    private final EventoRepository eventoRepository;

    public EventoServiceImpl(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public Evento findById(Long id) {
        return eventoRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    
    @Override
    public Evento create(Evento evento) {
        if (evento.getId() != null && eventoRepository.existsById(evento.getId())){
            throw new IllegalArgumentException("Este evento já existe.");
        }
        return eventoRepository.save(evento);
    }


}
