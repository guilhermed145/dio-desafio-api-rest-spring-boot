package com.myprojects.dio_desafio_api_rest_spring_boot.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date data;
    private Time horario;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Convidado> listaConvidados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Convidado> getListaConvidados() {
        return listaConvidados;
    }

    public void setListaConvidados(List<Convidado> listaConvidados) {
        this.listaConvidados = listaConvidados;
    }

}
