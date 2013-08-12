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
import javax.inject.Named;
import br.com.aj2.dao.support.EntitySelector;
import br.com.aj2.dao.support.PropertySelector;
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.Cliente;
import br.com.aj2.domain.Grupocliente;
import br.com.aj2.domain.Grupocliente_;
import br.com.aj2.web.domain.support.GenericSearchForm;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Grupocliente}.
 * It exposes a {@link Grupocliente} instance so it can be used in search by Example query.
 */
@Named
@ConversationContextScoped
public class GrupoclienteSearchForm extends GenericSearchForm<Grupocliente, Integer, GrupoclienteSearchForm> {
    private static final long serialVersionUID = 1L;

    protected Grupocliente grupocliente = new Grupocliente();
    protected PropertySelector<Grupocliente, String> nomeSelector = newPropertySelector(Grupocliente_.nome);
    protected EntitySelector<Grupocliente, Cliente, Integer> clienteRepresentanteSelector = newEntitySelector(Grupocliente_.clienteRepresentante);

    public Grupocliente getGrupocliente() {
        return grupocliente;
    }

    @Override
    protected Grupocliente getEntity() {
        return getGrupocliente();
    }

    @Override
    public GrupoclienteSearchForm newInstance() {
        return new GrupoclienteSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        return new SearchParameters() //
                .anywhere() //
                .property(nomeSelector) //
                .entity(clienteRepresentanteSelector) //
        ;
    }

    @Override
    public void resetWithOther(GrupoclienteSearchForm other) {
        this.grupocliente = other.getGrupocliente();
        this.nomeSelector = other.getNomeSelector();
        this.clienteRepresentanteSelector = other.getClienteRepresentanteSelector();
    }

    // Property selectors
    public PropertySelector<Grupocliente, String> getNomeSelector() {
        return nomeSelector;
    }

    // Relation selectors
    public EntitySelector<Grupocliente, Cliente, Integer> getClienteRepresentanteSelector() {
        return clienteRepresentanteSelector;
    }
}
