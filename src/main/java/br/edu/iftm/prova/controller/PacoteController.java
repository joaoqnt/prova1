package br.edu.iftm.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.prova.model.Pacote;
import br.edu.iftm.prova.service.PacoteService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    @Autowired
    private PacoteService service;

    @GetMapping
    public List<Pacote> getAllPacotes() {
        return service.listAll();
    }

    @PostMapping
    public Pacote createPacote(@RequestBody Pacote pacote) {
        return service.salva(pacote);
    }

    @GetMapping("/{id}")
    public Pacote getPacote(@PathVariable Long id) {
        return service.busca(id);
    }

    @PutMapping("/{id}")
    public Pacote updatePacote(@PathVariable Long id, @RequestBody Pacote pacoteDetails) {
        final Pacote updatedPacote = service.atualiza(id, pacoteDetails);
        return updatedPacote;
    }

    @DeleteMapping("/{id}")
    public void deletePacote(@PathVariable Long id) {
        service.delete(id);
    }
}
