package br.com.bootcamp01templatecasadocodigo.dto;

import br.com.bootcamp01templatecasadocodigo.annotation.UniqueValue;
import br.com.bootcamp01templatecasadocodigo.entity.Categoria;

import javax.validation.constraints.NotBlank;

public class CategoriaDTO {

    private Integer id;

    @NotBlank
    @UniqueValue(domainClass = Categoria.class, fieldName = "nome")
    private String nome;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Integer id, @NotBlank String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaDTO(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
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
