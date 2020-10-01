package br.com.bootcamp01templatecasadocodigo.entity;

import br.com.bootcamp01templatecasadocodigo.dto.PaisDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    public Pais() {
    }

    public Pais(Integer id, @NotBlank String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pais(PaisDTO paisDTO) {
        this.nome = paisDTO.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
