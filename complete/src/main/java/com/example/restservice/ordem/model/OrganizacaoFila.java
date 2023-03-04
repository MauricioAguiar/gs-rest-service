package com.example.restservice.ordem.model;

import com.example.restservice.pessoa.model.Pessoas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "organizacao_fila")
public class OrganizacaoFila {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200, nullable = false)
    private int numOrdem;
    
    @Column()
    private boolean foiChamado;


    @ManyToOne
    @JoinColumn(name ="idPessoa")
    private Pessoas pessoa;

}
