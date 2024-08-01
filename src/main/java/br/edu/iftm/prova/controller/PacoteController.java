package br.edu.iftm.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.prova.model.Pacote;
import br.edu.iftm.prova.repository.PacoteRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    @Autowired
    private PacoteRepository pacoteRepository;

    @GetMapping
    public List<Pacote> getAllPacotes() {
        return pacoteRepository.findAll();
    }

    @PostMapping
    public Pacote createPacote(@RequestBody Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    @GetMapping("/{id}")
    public List<Pacote> getPacote(@PathVariable Long id) {
        return pacoteRepository.findAllById(id);
    }

    @PutMapping("/{id}")
    public Pacote updatePacote(@PathVariable Long id, @RequestBody Pacote pacoteDetails) {
        final Pacote updatedPacote = pacoteRepository.save(pacoteDetails);
        return updatedPacote;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePacote(@PathVariable Long id) {
        pacoteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
