package com.example.restservice.ordem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restservice.ordem.model.OrganizacaoFila;

public interface OrganizacaoFilaRepository extends JpaRepository< OrganizacaoFila, Integer>{
    
}