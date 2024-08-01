package br.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.prova.model.Pacote;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote,Long>{
    
}
