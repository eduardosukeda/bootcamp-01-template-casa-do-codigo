package br.com.bootcamp01templatecasadocodigo.dto;

import br.com.bootcamp01templatecasadocodigo.annotation.UniqueValue;
import br.com.bootcamp01templatecasadocodigo.entity.Pais;

import javax.validation.constraints.NotBlank;

public class PaisDTO {

    private Integer id;

    @NotBlank
    @UniqueValue(domainClass = Pais.class, fieldName = "nome")
    private String nome;

    public PaisDTO() {
    }

    public PaisDTO(Integer id, @NotBlank String nome) {
        this.id = id;
        this.nome = nome;
    }

    public PaisDTO(Pais pais) {
        this.id = pais.getId();
        this.nome = pais.getNome();
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
