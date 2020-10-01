package br.com.bootcamp01templatecasadocodigo.dto;

import br.com.bootcamp01templatecasadocodigo.annotation.ExistsId;
import br.com.bootcamp01templatecasadocodigo.annotation.UniqueValue;
import br.com.bootcamp01templatecasadocodigo.entity.Estado;
import br.com.bootcamp01templatecasadocodigo.entity.Pais;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EstadoDTO {

    private Integer id;

    @NotBlank
    @UniqueValue(domainClass = Estado.class, fieldName = "nome")
    private String nome;

    @NotNull
    @ExistsId(domainClass = Pais.class, fieldName = "id")
    private Integer idPais;

    public EstadoDTO() {
    }

    public EstadoDTO(@NotBlank String nome, @NotNull Integer idPais) {
        this.nome = nome;
        this.idPais = idPais;
    }

    public EstadoDTO(Estado estado, Pais pais) {
        this.nome = estado.getNome();
        this.idPais = pais.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }
}
