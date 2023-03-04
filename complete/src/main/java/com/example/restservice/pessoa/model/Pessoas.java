package com.example.restservice.pessoa.model;

import java.util.List;

import com.example.restservice.ordem.model.OrganizacaoFila;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "pessoas")
public class Pessoas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column(length = 25, nullable = false)
    private String idade;

    @OneToMany(mappedBy = "pessoas")
    private List<OrganizacaoFila> ordemChamada;
}