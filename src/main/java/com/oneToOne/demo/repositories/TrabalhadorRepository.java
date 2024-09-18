package com.oneToOne.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToOne.demo.Entities.TrabalhadorEntity;

public interface TrabalhadorRepository extends JpaRepository<TrabalhadorEntity, Long> {
    
}
