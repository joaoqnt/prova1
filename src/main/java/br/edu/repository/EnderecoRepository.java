package br.edu.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.prova.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
    
}
