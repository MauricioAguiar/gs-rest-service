package com.example.restservice.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restservice.pessoa.model.Pessoas;

public interface PessoasRepository extends JpaRepository< Pessoas, Integer>{
    
}