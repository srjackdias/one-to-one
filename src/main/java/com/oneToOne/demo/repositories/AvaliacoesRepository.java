package com.oneToOne.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToOne.demo.Entities.AvaliacoesEntity;

public interface AvaliacoesRepository extends JpaRepository<AvaliacoesEntity,Long> {
    
}
