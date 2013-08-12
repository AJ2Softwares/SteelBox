/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package br.com.aj2.web.domain;

import static br.com.aj2.dao.support.PropertySelector.newPropertySelector;
import static br.com.aj2.dao.support.Ranges.RangeDate.newRangeDate;
import static br.com.aj2.dao.support.Ranges.RangeDouble.newRangeDouble;
import javax.inject.Named;
import br.com.aj2.dao.support.PropertySelector;
import br.com.aj2.dao.support.Ranges.RangeDate;
import br.com.aj2.dao.support.Ranges.RangeDouble;
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.Lancamentos;
import br.com.aj2.domain.Lancamentos_;
import br.com.aj2.enumTypes.StatusLancamento;
import br.com.aj2.enumTypes.TipoLancamento;
import br.com.aj2.web.domain.support.GenericSearchForm;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Lancamentos}.
 * It exposes a {@link Lancamentos} instance so it can be used in search by Example query.
 */
@Named
@ConversationContextScoped
public class LancamentosSearchForm extends GenericSearchForm<Lancamentos, Integer, LancamentosSearchForm> {
    private static final long serialVersionUID = 1L;

    protected Lancamentos lancamentos = new Lancamentos();
    protected RangeDate<Lancamentos> dataVencimentoRange = newRangeDate(Lancamentos_.dataVencimento);
    protected RangeDate<Lancamentos> dataPagamentoRange = newRangeDate(Lancamentos_.dataPagamento);
    protected RangeDouble<Lancamentos> valorRange = newRangeDouble(Lancamentos_.valor);
    protected RangeDouble<Lancamentos> valorPagoRange = newRangeDouble(Lancamentos_.valorPago);
    protected PropertySelector<Lancamentos, String> descricaoSelector = newPropertySelector(Lancamentos_.descricao);
    protected PropertySelector<Lancamentos, String> documentoSelector = newPropertySelector(Lancamentos_.documento);
    protected PropertySelector<Lancamentos, TipoLancamento> tipoSelector = newPropertySelector(Lancamentos_.tipo);
    protected PropertySelector<Lancamentos, StatusLancamento> statusSelector = newPropertySelector(Lancamentos_.status);
    protected PropertySelector<Lancamentos, Double> valorSelector = newPropertySelector(Lancamentos_.valor);
    protected PropertySelector<Lancamentos, Double> valorPagoSelector = newPropertySelector(Lancamentos_.valorPago);
    protected PropertySelector<Lancamentos, String> descriptionSelector = newPropertySelector(Lancamentos_.description);

    public Lancamentos getLancamentos() {
        return lancamentos;
    }

    @Override
    protected Lancamentos getEntity() {
        return getLancamentos();
    }

    @Override
    public LancamentosSearchForm newInstance() {
        return new LancamentosSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        return new SearchParameters() //
                .anywhere() //
                .range(dataVencimentoRange) //
                .range(dataPagamentoRange) //
                .range(valorRange) //
                .range(valorPagoRange) //
                .property(descricaoSelector) //
                .property(documentoSelector) //
                .property(tipoSelector) //
                .property(statusSelector) //
                .property(valorSelector) //
                .property(valorPagoSelector) //
                .property(descriptionSelector) //
        ;
    }

    @Override
    public void resetWithOther(LancamentosSearchForm other) {
        this.lancamentos = other.getLancamentos();
        this.dataVencimentoRange = other.getDataVencimentoRange();
        this.dataPagamentoRange = other.getDataPagamentoRange();
        this.valorRange = other.getValorRange();
        this.valorPagoRange = other.getValorPagoRange();
        this.descricaoSelector = other.getDescricaoSelector();
        this.documentoSelector = other.getDocumentoSelector();
        this.tipoSelector = other.getTipoSelector();
        this.statusSelector = other.getStatusSelector();
        this.valorSelector = other.getValorSelector();
        this.valorPagoSelector = other.getValorPagoSelector();
        this.descriptionSelector = other.getDescriptionSelector();
    }

    // Ranges
    public RangeDate<Lancamentos> getDataVencimentoRange() {
        return dataVencimentoRange;
    }

    public RangeDate<Lancamentos> getDataPagamentoRange() {
        return dataPagamentoRange;
    }

    public RangeDouble<Lancamentos> getValorRange() {
        return valorRange;
    }

    public RangeDouble<Lancamentos> getValorPagoRange() {
        return valorPagoRange;
    }

    // Property selectors
    public PropertySelector<Lancamentos, String> getDescricaoSelector() {
        return descricaoSelector;
    }

    public PropertySelector<Lancamentos, String> getDocumentoSelector() {
        return documentoSelector;
    }

    public PropertySelector<Lancamentos, TipoLancamento> getTipoSelector() {
        return tipoSelector;
    }

    public PropertySelector<Lancamentos, StatusLancamento> getStatusSelector() {
        return statusSelector;
    }

    public PropertySelector<Lancamentos, Double> getValorSelector() {
        return valorSelector;
    }

    public PropertySelector<Lancamentos, Double> getValorPagoSelector() {
        return valorPagoSelector;
    }

    public PropertySelector<Lancamentos, String> getDescriptionSelector() {
        return descriptionSelector;
    }
}