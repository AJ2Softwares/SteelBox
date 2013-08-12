/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package br.com.aj2.web.domain;

import static br.com.aj2.dao.support.PropertySelector.newPropertySelector;
import static br.com.aj2.dao.support.Ranges.RangeFloat.newRangeFloat;
import javax.inject.Named;
import br.com.aj2.dao.support.PropertySelector;
import br.com.aj2.dao.support.Ranges.RangeFloat;
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.Servicos;
import br.com.aj2.domain.Servicos_;
import br.com.aj2.web.domain.support.GenericSearchForm;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Servicos}.
 * It exposes a {@link Servicos} instance so it can be used in search by Example query.
 */
@Named
@ConversationContextScoped
public class ServicosSearchForm extends GenericSearchForm<Servicos, Integer, ServicosSearchForm> {
    private static final long serialVersionUID = 1L;

    protected Servicos servicos = new Servicos();
    protected RangeFloat<Servicos> valorRange = newRangeFloat(Servicos_.valor);
    protected PropertySelector<Servicos, String> servicoSelector = newPropertySelector(Servicos_.servico);
    protected PropertySelector<Servicos, Float> valorSelector = newPropertySelector(Servicos_.valor);

    public Servicos getServicos() {
        return servicos;
    }

    @Override
    protected Servicos getEntity() {
        return getServicos();
    }

    @Override
    public ServicosSearchForm newInstance() {
        return new ServicosSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        return new SearchParameters() //
                .anywhere() //
                .range(valorRange) //
                .property(servicoSelector) //
                .property(valorSelector) //
        ;
    }

    @Override
    public void resetWithOther(ServicosSearchForm other) {
        this.servicos = other.getServicos();
        this.valorRange = other.getValorRange();
        this.servicoSelector = other.getServicoSelector();
        this.valorSelector = other.getValorSelector();
    }

    // Ranges
    public RangeFloat<Servicos> getValorRange() {
        return valorRange;
    }

    // Property selectors
    public PropertySelector<Servicos, String> getServicoSelector() {
        return servicoSelector;
    }

    public PropertySelector<Servicos, Float> getValorSelector() {
        return valorSelector;
    }
}
