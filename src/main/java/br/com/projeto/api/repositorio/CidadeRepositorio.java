package br.com.projeto.api.repositorio;


// Importações
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.modelo.Cidade;


// Interface
public interface CidadeRepositorio extends CrudRepository<Cidade, Long>{
    
}

