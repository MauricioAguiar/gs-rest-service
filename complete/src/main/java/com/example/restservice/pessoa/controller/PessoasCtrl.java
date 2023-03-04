package com.example.restservice.pessoa.controller;

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

import com.example.restservice.pessoa.model.Pessoas;
import com.example.restservice.pessoa.repository.PessoasRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/pessoas")
public class PessoasCtrl {

    private final PessoasRepository pessoasRepository;

    @GetMapping
    public List<Pessoas> get(){
        return pessoasRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(code=HttpStatus.CREATED)
    public Pessoas save (@RequestBody Pessoas pessoas){
        
        return pessoasRepository.save(pessoas);
    }

    @DeleteMapping
    public void deleteById(@PathVariable int id){
        pessoasRepository.deleteById(id);
    }



}