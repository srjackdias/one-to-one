package com.oneToOne.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "avaliacoes")
public class AvaliacoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_avaliacao;

    @Column(name = "textodeavaliação")
    private String textodeavaliação;

    @Column(name = "cliente_id")
    private Integer cliente_id;  // Mudado para Integer para aceitar null

    @Column(name = "trabalhador_id")
    private Integer trabalhador_id;  // Mudado para Integer para aceitar null

    @OneToOne(mappedBy = "avaliacoesEntity")
    private TrabalhadorEntity trabalhadorEntity;

    // Construtores
    public AvaliacoesEntity() {}

    public AvaliacoesEntity(String textodeavaliação, Integer cliente_id, Integer trabalhador_id) {
        this.textodeavaliação = textodeavaliação;
        this.cliente_id = cliente_id;
        this.trabalhador_id = trabalhador_id;
    }

    public Long getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(Long id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public String getTextodeavaliação() {
        return textodeavaliação;
    }

    public void setTextodeavaliação(String textodeavaliação) {
        this.textodeavaliação = textodeavaliação;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getTrabalhador_id() {
        return trabalhador_id;
    }

    public void setTrabalhador_id(Integer trabalhador_id) {
        this.trabalhador_id = trabalhador_id;
    }

    public TrabalhadorEntity getTrabalhadorEntity() {
        return trabalhadorEntity;
    }

    public void setTrabalhadorEntity(TrabalhadorEntity trabalhadorEntity) {
        this.trabalhadorEntity = trabalhadorEntity;
    }



    // Getters e Setters
 
}
