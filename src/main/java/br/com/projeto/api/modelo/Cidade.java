package br.com.projeto.api.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cidades")
@Getter
@Setter

public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;


    
    private String cidade;



    @OneToMany
    @JoinColumn(name = "cidade_cliente")
    private List<Cliente> clientes;

    
    /* @OneToOne
    @JoinColumn(name = "cidade_cliente", referencedColumnName = "cidade")
    private Cliente cliente;
 */


    

}
