package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Cidade;
import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;
import br.com.projeto.api.repositorio.Repositoriocid;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin(origins = "*")
public class Controle {
    
@Autowired
private Repositorio acao;

@Autowired
private Repositoriocid acao2;

@PostMapping("/")
public Cliente cadastrar(@RequestBody Cliente c){
return acao.save(c);
}

@PostMapping("/")
public Cidade cadastrar(@RequestBody Cidade c){
return acao2.save(c);
}

    @GetMapping("/")
public Iterable<Cliente> selecionar(){
    return acao.findAll();
}

    @GetMapping("/")
public Iterable<Cidade> selecionar2(){
    return acao2.findAll();
}

public String putMethodName(@PathVariable String id, @RequestBody String entity) {
    //TODO: process PUT request
    
    return entity;
}
@PutMapping("/")
public Cliente editar(@RequestBody Cliente c){
return acao.save(c);
}

@PutMapping("/")
public Cidade editar(@RequestBody Cidade c){
return acao2.save(c);
}

@DeleteMapping("/{codigo}")
public void remover(@PathVariable long codigo){
acao.deleteById(codigo);
}

@DeleteMapping("/{codigo}")
public void remover2(@PathVariable long codigo){
acao2.deleteById(codigo);
}


}
