package br.com.bootcamp01templatecasadocodigo.entity;

import br.com.bootcamp01templatecasadocodigo.dto.EstadoDTO;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @ManyToOne
    @NotNull
    @Valid
    private Pais pais;

    public Estado() {
    }

    public Estado(Integer id, @NotBlank String nome, @NotNull @Valid Pais pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
    }

    public Estado(EstadoDTO estadoDTO, Pais pais) {
        this.nome = estadoDTO.getNome();
        this.pais = pais;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
