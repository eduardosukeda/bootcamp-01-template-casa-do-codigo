package br.com.bootcamp01templatecasadocodigo.entity;

import br.com.bootcamp01templatecasadocodigo.dto.CategoriaDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    public Categoria() {
    }

    public Categoria(Integer id, @NotBlank String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categoria(CategoriaDTO categoriaDTO) {
        this.nome = categoriaDTO.getNome();
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