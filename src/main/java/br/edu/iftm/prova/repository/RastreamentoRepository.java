package br.edu.iftm.prova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.prova.model.Rastreamento;

@Repository
public interface RastreamentoRepository extends JpaRepository<Rastreamento, Long> {

    List<Rastreamento> findAllByPacote_id(Long pacote_id);

}
