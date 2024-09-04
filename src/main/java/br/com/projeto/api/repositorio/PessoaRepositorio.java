package br.com.projeto.api.repositorio;


// Importações
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.modelo.Pessoa;


// Interface
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long>{
    
}
