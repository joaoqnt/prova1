package br.edu.iftm.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.prova.model.Rastreamento;
import br.edu.iftm.prova.repository.RastreamentoRepository;

@RestController
@RequestMapping("/rastreamentos")
public class RastreamentoController {     
    @Autowired
    private RastreamentoRepository repository;

    @GetMapping("/{id}")
    public List<Rastreamento> getById(@PathVariable Long id){
        return repository.findAllById(id);
    }
}
