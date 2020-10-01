package br.com.bootcamp01templatecasadocodigo.dto;

public class DetalheAutorDTO {

    private String nome;
    private String descricao;

    public DetalheAutorDTO() {
    }

    public DetalheAutorDTO(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
