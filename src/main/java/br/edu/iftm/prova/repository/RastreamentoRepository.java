package br.edu.iftm.prova.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.prova.model.Rastreamento;

@Repository
public interface RastreamentoRepository extends CrudRepository<Rastreamento,Long>{
    
}
