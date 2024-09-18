package com.oneToOne.demo.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabalhador")

public class TrabalhadorEntity {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_trabalhador;

    @Column(name="profissao")
    private String profissao;

    @Column(name="nota_trabalhador")
    private int nota_trabalhador;


    @Column(name="descricao_perfil")
    private String descricao_perfil;

    

    @OneToOne
    @JoinColumn(name = "avaliacao_id")
    private AvaliacoesEntity avaliacoesEntity;

    public TrabalhadorEntity(){}

    public TrabalhadorEntity(String profissao, int nota_trabalhador, String descricao_perfil){

        this.profissao=profissao;
        this.nota_trabalhador=nota_trabalhador;
        this.descricao_perfil=descricao_perfil;

    }

    public Long getId_trabalhador() {
        return id_trabalhador;
    }

    public void setId_trabalhador(Long id_trabalhador) {
        this.id_trabalhador = id_trabalhador;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getNota_trabalhador() {
        return nota_trabalhador;
    }

    public void setNota_trabalhador(int nota_trabalhador) {
        this.nota_trabalhador = nota_trabalhador;
    }

    public String getDescricao_perfil() {
        return descricao_perfil;
    }

    public void setDescricao_perfil(String descricao_perfil) {
        this.descricao_perfil = descricao_perfil;
    }

    public AvaliacoesEntity getAvaliacoesEntity() {
        return avaliacoesEntity;
    }

    public void setAvaliacoesEntity(AvaliacoesEntity avaliacoesEntity) {
        this.avaliacoesEntity = avaliacoesEntity;
    }

    
}
