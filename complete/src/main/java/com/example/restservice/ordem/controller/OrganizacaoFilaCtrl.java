package com.example.restservice.ordem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.ordem.model.OrganizacaoFila;
import com.example.restservice.ordem.repository.OrganizacaoFilaRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/chamada")
public class OrganizacaoFilaCtrl {

    private final OrganizacaoFilaRepository organizacaoFilaRepository;

    @GetMapping
    public List<OrganizacaoFila> get(){
        return organizacaoFilaRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(code=HttpStatus.CREATED)
    public OrganizacaoFila save (@RequestBody OrganizacaoFila organizacaoFila){
        
        return organizacaoFilaRepository.save(organizacaoFila);
    }

    @DeleteMapping
    public void deleteById(@PathVariable int id){
        organizacaoFilaRepository.deleteById(id);
    }


}

