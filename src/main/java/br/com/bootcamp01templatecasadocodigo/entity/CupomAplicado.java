package br.com.bootcamp01templatecasadocodigo.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

@Embeddable
public class CupomAplicado {

    @ManyToOne
    private Cupom cupom;

    @Positive
    @NotNull
    private BigDecimal percentualDescontoMomento;

    @NotNull
    @Future
    private LocalDate validadeMomento;

    public CupomAplicado() {
    }

    public CupomAplicado(Cupom cupom, @Positive @NotNull BigDecimal percentualDescontoMomento, @NotNull @Future LocalDate validadeMomento) {
        this.cupom = cupom;
        this.percentualDescontoMomento = percentualDescontoMomento;
        this.validadeMomento = validadeMomento;
    }

    public Cupom getCupom() {
        return cupom;
    }

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public BigDecimal getPercentualDescontoMomento() {
        return percentualDescontoMomento;
    }

    public void setPercentualDescontoMomento(BigDecimal percentualDescontoMomento) {
        this.percentualDescontoMomento = percentualDescontoMomento;
    }

    public LocalDate getValidadeMomento() {
        return validadeMomento;
    }

    public void setValidadeMomento(LocalDate validadeMomento) {
        this.validadeMomento = validadeMomento;
    }
}