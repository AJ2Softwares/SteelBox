/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package br.com.aj2.web.domain;

import static br.com.aj2.dao.support.EntitySelector.newEntitySelector;
import static br.com.aj2.dao.support.PropertySelector.newPropertySelector;
import static br.com.aj2.dao.support.Ranges.RangeDouble.newRangeDouble;
import static br.com.aj2.dao.support.Ranges.RangeInteger.newRangeInteger;
import javax.inject.Named;
import br.com.aj2.dao.support.EntitySelector;
import br.com.aj2.dao.support.PropertySelector;
import br.com.aj2.dao.support.Ranges.RangeDouble;
import br.com.aj2.dao.support.Ranges.RangeInteger;
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.ItensOs;
import br.com.aj2.domain.ItensOs_;
import br.com.aj2.domain.Os;
import br.com.aj2.domain.Servicos;
import br.com.aj2.web.domain.support.GenericSearchForm;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link ItensOs}.
 * It exposes a {@link ItensOs} instance so it can be used in search by Example query.
 */
@Named
@ConversationContextScoped
public class ItensOsSearchForm extends GenericSearchForm<ItensOs, Integer, ItensOsSearchForm> {
    private static final long serialVersionUID = 1L;

    protected ItensOs itensOs = new ItensOs();
    protected RangeDouble<ItensOs> valorRange = newRangeDouble(ItensOs_.valor);
    protected RangeDouble<ItensOs> descontoRange = newRangeDouble(ItensOs_.desconto);
    protected RangeInteger<ItensOs> quantidadeRange = newRangeInteger(ItensOs_.quantidade);
    protected RangeDouble<ItensOs> adicionaisRange = newRangeDouble(ItensOs_.adicionais);
    protected RangeDouble<ItensOs> totalRange = newRangeDouble(ItensOs_.total);
    protected PropertySelector<ItensOs, Double> valorSelector = newPropertySelector(ItensOs_.valor);
    protected PropertySelector<ItensOs, Double> descontoSelector = newPropertySelector(ItensOs_.desconto);
    protected PropertySelector<ItensOs, Integer> quantidadeSelector = newPropertySelector(ItensOs_.quantidade);
    protected PropertySelector<ItensOs, Double> adicionaisSelector = newPropertySelector(ItensOs_.adicionais);
    protected PropertySelector<ItensOs, Double> totalSelector = newPropertySelector(ItensOs_.total);
    protected EntitySelector<ItensOs, Servicos, Integer> servicosSelector = newEntitySelector(ItensOs_.servicos);
    protected EntitySelector<ItensOs, Os, Integer> itensOssSelector = newEntitySelector(ItensOs_.itensOss);

    public ItensOs getItensOs() {
        return itensOs;
    }

    @Override
    protected ItensOs getEntity() {
        return getItensOs();
    }

    @Override
    public ItensOsSearchForm newInstance() {
        return new ItensOsSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        return new SearchParameters() //
                .anywhere() //
                .range(valorRange) //
                .range(descontoRange) //
                .range(quantidadeRange) //
                .range(adicionaisRange) //
                .range(totalRange) //
                .property(valorSelector) //
                .property(descontoSelector) //
                .property(quantidadeSelector) //
                .property(adicionaisSelector) //
                .property(totalSelector) //
                .entity(servicosSelector) //
                .entity(itensOssSelector) //
        ;
    }

    @Override
    public void resetWithOther(ItensOsSearchForm other) {
        this.itensOs = other.getItensOs();
        this.valorRange = other.getValorRange();
        this.descontoRange = other.getDescontoRange();
        this.quantidadeRange = other.getQuantidadeRange();
        this.adicionaisRange = other.getAdicionaisRange();
        this.totalRange = other.getTotalRange();
        this.valorSelector = other.getValorSelector();
        this.descontoSelector = other.getDescontoSelector();
        this.quantidadeSelector = other.getQuantidadeSelector();
        this.adicionaisSelector = other.getAdicionaisSelector();
        this.totalSelector = other.getTotalSelector();
        this.servicosSelector = other.getServicosSelector();
        this.itensOssSelector = other.getItensOssSelector();
    }

    // Ranges
    public RangeDouble<ItensOs> getValorRange() {
        return valorRange;
    }

    public RangeDouble<ItensOs> getDescontoRange() {
        return descontoRange;
    }

    public RangeInteger<ItensOs> getQuantidadeRange() {
        return quantidadeRange;
    }

    public RangeDouble<ItensOs> getAdicionaisRange() {
        return adicionaisRange;
    }

    public RangeDouble<ItensOs> getTotalRange() {
        return totalRange;
    }

    // Property selectors
    public PropertySelector<ItensOs, Double> getValorSelector() {
        return valorSelector;
    }

    public PropertySelector<ItensOs, Double> getDescontoSelector() {
        return descontoSelector;
    }

    public PropertySelector<ItensOs, Integer> getQuantidadeSelector() {
        return quantidadeSelector;
    }

    public PropertySelector<ItensOs, Double> getAdicionaisSelector() {
        return adicionaisSelector;
    }

    public PropertySelector<ItensOs, Double> getTotalSelector() {
        return totalSelector;
    }

    // Relation selectors
    public EntitySelector<ItensOs, Servicos, Integer> getServicosSelector() {
        return servicosSelector;
    }

    public EntitySelector<ItensOs, Os, Integer> getItensOssSelector() {
        return itensOssSelector;
    }
}
