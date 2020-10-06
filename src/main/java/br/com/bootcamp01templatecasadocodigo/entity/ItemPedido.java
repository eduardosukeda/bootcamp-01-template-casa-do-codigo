package br.com.bootcamp01templatecasadocodigo.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Embeddable
public class ItemPedido {

    @ManyToOne
    @NotNull
    private Livro livro;

    @Positive
    private int quantidade;

    @Positive
    private BigDecimal precoMomento;

    public ItemPedido() {
    }

    public ItemPedido(@NotNull Livro livro, @Positive int quantidade, @Positive BigDecimal precoMomento) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.precoMomento = precoMomento;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoMomento() {
        return precoMomento;
    }

    public void setPrecoMomento(BigDecimal precoMomento) {
        this.precoMomento = precoMomento;
    }
}