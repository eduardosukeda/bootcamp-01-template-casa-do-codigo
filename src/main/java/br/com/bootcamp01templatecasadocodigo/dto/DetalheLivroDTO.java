package br.com.bootcamp01templatecasadocodigo.dto;

import br.com.bootcamp01templatecasadocodigo.entity.Livro;

import java.math.BigDecimal;

public class DetalheLivroDTO {

    private DetalheAutorDTO autor;
    private String titulo;
    private String isbn;
    private int numeroPaginas;
    private BigDecimal preco;
    private String resumo;
    private String sumario;
    private String dataPublicacao;

    public DetalheLivroDTO() {
    }

    public DetalheLivroDTO(DetalheAutorDTO autor, Livro livro) {
        this.autor = autor;
        this.titulo = livro.getTitulo();
        this.isbn = livro.getIsbn();
        this.numeroPaginas = livro.getNumeroPaginas();
        this.preco = livro.getPreco();
        this.resumo = livro.getResumo();
        this.sumario = livro.getSumario();
        this.dataPublicacao = livro.getDataPublicacao().toString();
    }

    public DetalheAutorDTO getAutor() {
        return autor;
    }

    public void setAutor(DetalheAutorDTO autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
