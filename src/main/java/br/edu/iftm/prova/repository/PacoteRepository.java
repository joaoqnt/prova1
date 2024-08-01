package br.edu.iftm.prova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.prova.model.Pacote;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote,Long>{
    List<Pacote> findAllById(Long id);
}
