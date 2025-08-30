package com.myprojects.dio_desafio_api_rest_spring_boot.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.myprojects.dio_desafio_api_rest_spring_boot.model.Evento;
import com.myprojects.dio_desafio_api_rest_spring_boot.service.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> findById(@PathVariable Long id) {
        return ResponseEntity.ok(eventoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Evento> create(@RequestBody Evento evento) {
        Evento eventoCriado = eventoService.create(evento);
        URI local = ServletUriComponentsBuilder.fromCurrentRequest()
                .buildAndExpand(eventoCriado.getId())
                .toUri();
        return ResponseEntity.created(local).body(eventoCriado);
    }

}
