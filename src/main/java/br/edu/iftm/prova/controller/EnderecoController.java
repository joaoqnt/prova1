package br.edu.iftm.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.prova.model.Endereco;
import br.edu.iftm.prova.repository.EnderecoRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoRepository repository;
    
    @GetMapping
    public List<Endereco> getAllEnderecos() {
        return repository.findAll();
    }

    @PostMapping
    public Endereco createEndereco(@RequestBody Endereco endereco){
        return repository.save(endereco);
    }
}
