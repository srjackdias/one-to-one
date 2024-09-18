package com.oneToOne.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneToOne.demo.Entities.AvaliacoesEntity;
import com.oneToOne.demo.Entities.TrabalhadorEntity;
import com.oneToOne.demo.repositories.AvaliacoesRepository;
import com.oneToOne.demo.repositories.TrabalhadorRepository;

@RestController
@RequestMapping("/api")
public class AvaliacoesTrabalhadorController {

    @Autowired
    private AvaliacoesRepository avaliacoesRepository;

    @Autowired
    private TrabalhadorRepository trabalhadorRepository;

    @PostMapping("/avaliacoes")
    public AvaliacoesEntity createAvaliacoesEntity(@RequestBody AvaliacoesEntity avaliacoesEntity) {
        return avaliacoesRepository.save(avaliacoesEntity);
    }

    @PostMapping("/trabalhador")
    public TrabalhadorEntity createTrabalhadorEntity(@RequestBody TrabalhadorEntity trabalhadorEntity) {
        return trabalhadorRepository.save(trabalhadorEntity);
    }

    @GetMapping("/avaliacoes/{id_avaliacao}")
    public AvaliacoesEntity getAvaliacoesEntity(@PathVariable Long id_avaliacao) {
        return avaliacoesRepository.findById(id_avaliacao).orElse(null);
    }

    @GetMapping("/trabalhador/{id_trabalhador}")
    public TrabalhadorEntity getTrabalhadorEntity(@PathVariable Long id_trabalhador) {
        return trabalhadorRepository.findById(id_trabalhador).orElse(null);
    }
}
