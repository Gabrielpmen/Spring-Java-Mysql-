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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cidades")
public class ControleCidade {
    


    @Autowired
    private Repositoriocid acao2;



    @PostMapping("/cadastrar")
public Cidade cadastrarcid(@RequestBody Cidade c){
return acao2.save(c);
}



@GetMapping("/listar")
public Iterable<Cidade> selecionar2(){
    return acao2.findAll();
}

@PutMapping("/")
public Cidade editar(@RequestBody Cidade c){
return acao2.save(c);
}

@DeleteMapping("/{codigo}")
public void remover2(@PathVariable long codigo){
acao2.deleteById(codigo);
}

}
