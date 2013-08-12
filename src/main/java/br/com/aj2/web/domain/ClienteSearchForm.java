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
import static br.com.aj2.dao.support.Ranges.RangeDate.newRangeDate;
import javax.inject.Named;
import br.com.aj2.dao.support.EntitySelector;
import br.com.aj2.dao.support.PropertySelector;
import br.com.aj2.dao.support.Ranges.RangeDate;
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.Cliente;
import br.com.aj2.domain.Cliente_;
import br.com.aj2.domain.Grupocliente;
import br.com.aj2.enumTypes.EstadoCivil;
import br.com.aj2.enumTypes.Sexo;
import br.com.aj2.enumTypes.TipoPessoa;
import br.com.aj2.enumTypes.UF;
import br.com.aj2.web.domain.support.GenericSearchForm;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Cliente}.
 * It exposes a {@link Cliente} instance so it can be used in search by Example query.
 */
@Named
@ConversationContextScoped
public class ClienteSearchForm extends GenericSearchForm<Cliente, Integer, ClienteSearchForm> {
    private static final long serialVersionUID = 1L;

    protected Cliente cliente = new Cliente();
    protected RangeDate<Cliente> dataNascimentoRange = newRangeDate(Cliente_.dataNascimento);
    protected PropertySelector<Cliente, String> nomeSelector = newPropertySelector(Cliente_.nome);
    protected PropertySelector<Cliente, Sexo> sexoSelector = newPropertySelector(Cliente_.sexo);
    protected PropertySelector<Cliente, EstadoCivil> estadoCivilSelector = newPropertySelector(Cliente_.estadoCivil);
    protected PropertySelector<Cliente, String> cpfCnpjSelector = newPropertySelector(Cliente_.cpfCnpj);
    protected PropertySelector<Cliente, String> rgIeSelector = newPropertySelector(Cliente_.rgIe);
    protected PropertySelector<Cliente, TipoPessoa> tipoPessoaSelector = newPropertySelector(Cliente_.tipoPessoa);
    protected PropertySelector<Cliente, String> logradouroSelector = newPropertySelector(Cliente_.logradouro);
    protected PropertySelector<Cliente, String> numeroSelector = newPropertySelector(Cliente_.numero);
    protected PropertySelector<Cliente, String> complementoSelector = newPropertySelector(Cliente_.complemento);
    protected PropertySelector<Cliente, String> bairroSelector = newPropertySelector(Cliente_.bairro);
    protected PropertySelector<Cliente, String> cidadeSelector = newPropertySelector(Cliente_.cidade);
    protected PropertySelector<Cliente, UF> ufSelector = newPropertySelector(Cliente_.uf);
    protected PropertySelector<Cliente, String> paisSelector = newPropertySelector(Cliente_.pais);
    protected PropertySelector<Cliente, String> cepSelector = newPropertySelector(Cliente_.cep);
    protected PropertySelector<Cliente, String> telefoneSelector = newPropertySelector(Cliente_.telefone);
    protected PropertySelector<Cliente, String> faxSelector = newPropertySelector(Cliente_.fax);
    protected PropertySelector<Cliente, String> celularSelector = newPropertySelector(Cliente_.celular);
    protected PropertySelector<Cliente, String> emailSelector = newPropertySelector(Cliente_.email);
    protected PropertySelector<Cliente, String> facebookSelector = newPropertySelector(Cliente_.facebook);
    protected PropertySelector<Cliente, String> skypeSelector = newPropertySelector(Cliente_.skype);
    protected PropertySelector<Cliente, String> msnSelector = newPropertySelector(Cliente_.msn);
    protected PropertySelector<Cliente, String> siteSelector = newPropertySelector(Cliente_.site);
    protected PropertySelector<Cliente, String> descriptionSelector = newPropertySelector(Cliente_.description);
    protected EntitySelector<Cliente, Grupocliente, Integer> grupoClienteSelector = newEntitySelector(Cliente_.grupoCliente);

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    protected Cliente getEntity() {
        return getCliente();
    }

    @Override
    public ClienteSearchForm newInstance() {
        return new ClienteSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        return new SearchParameters() //
                .anywhere() //
                .range(dataNascimentoRange) //
                .property(nomeSelector) //
                .property(sexoSelector) //
                .property(estadoCivilSelector) //
                .property(cpfCnpjSelector) //
                .property(rgIeSelector) //
                .property(tipoPessoaSelector) //
                .property(logradouroSelector) //
                .property(numeroSelector) //
                .property(complementoSelector) //
                .property(bairroSelector) //
                .property(cidadeSelector) //
                .property(ufSelector) //
                .property(paisSelector) //
                .property(cepSelector) //
                .property(telefoneSelector) //
                .property(faxSelector) //
                .property(celularSelector) //
                .property(emailSelector) //
                .property(facebookSelector) //
                .property(skypeSelector) //
                .property(msnSelector) //
                .property(siteSelector) //
                .property(descriptionSelector) //
                .entity(grupoClienteSelector) //
        ;
    }

    @Override
    public void resetWithOther(ClienteSearchForm other) {
        this.cliente = other.getCliente();
        this.dataNascimentoRange = other.getDataNascimentoRange();
        this.nomeSelector = other.getNomeSelector();
        this.sexoSelector = other.getSexoSelector();
        this.estadoCivilSelector = other.getEstadoCivilSelector();
        this.cpfCnpjSelector = other.getCpfCnpjSelector();
        this.rgIeSelector = other.getRgIeSelector();
        this.tipoPessoaSelector = other.getTipoPessoaSelector();
        this.logradouroSelector = other.getLogradouroSelector();
        this.numeroSelector = other.getNumeroSelector();
        this.complementoSelector = other.getComplementoSelector();
        this.bairroSelector = other.getBairroSelector();
        this.cidadeSelector = other.getCidadeSelector();
        this.ufSelector = other.getUfSelector();
        this.paisSelector = other.getPaisSelector();
        this.cepSelector = other.getCepSelector();
        this.telefoneSelector = other.getTelefoneSelector();
        this.faxSelector = other.getFaxSelector();
        this.celularSelector = other.getCelularSelector();
        this.emailSelector = other.getEmailSelector();
        this.facebookSelector = other.getFacebookSelector();
        this.skypeSelector = other.getSkypeSelector();
        this.msnSelector = other.getMsnSelector();
        this.siteSelector = other.getSiteSelector();
        this.descriptionSelector = other.getDescriptionSelector();
        this.grupoClienteSelector = other.getGrupoClienteSelector();
    }

    // Ranges
    public RangeDate<Cliente> getDataNascimentoRange() {
        return dataNascimentoRange;
    }

    // Property selectors
    public PropertySelector<Cliente, String> getNomeSelector() {
        return nomeSelector;
    }

    public PropertySelector<Cliente, Sexo> getSexoSelector() {
        return sexoSelector;
    }

    public PropertySelector<Cliente, EstadoCivil> getEstadoCivilSelector() {
        return estadoCivilSelector;
    }

    public PropertySelector<Cliente, String> getCpfCnpjSelector() {
        return cpfCnpjSelector;
    }

    public PropertySelector<Cliente, String> getRgIeSelector() {
        return rgIeSelector;
    }

    public PropertySelector<Cliente, TipoPessoa> getTipoPessoaSelector() {
        return tipoPessoaSelector;
    }

    public PropertySelector<Cliente, String> getLogradouroSelector() {
        return logradouroSelector;
    }

    public PropertySelector<Cliente, String> getNumeroSelector() {
        return numeroSelector;
    }

    public PropertySelector<Cliente, String> getComplementoSelector() {
        return complementoSelector;
    }

    public PropertySelector<Cliente, String> getBairroSelector() {
        return bairroSelector;
    }

    public PropertySelector<Cliente, String> getCidadeSelector() {
        return cidadeSelector;
    }

    public PropertySelector<Cliente, UF> getUfSelector() {
        return ufSelector;
    }

    public PropertySelector<Cliente, String> getPaisSelector() {
        return paisSelector;
    }

    public PropertySelector<Cliente, String> getCepSelector() {
        return cepSelector;
    }

    public PropertySelector<Cliente, String> getTelefoneSelector() {
        return telefoneSelector;
    }

    public PropertySelector<Cliente, String> getFaxSelector() {
        return faxSelector;
    }

    public PropertySelector<Cliente, String> getCelularSelector() {
        return celularSelector;
    }

    public PropertySelector<Cliente, String> getEmailSelector() {
        return emailSelector;
    }

    public PropertySelector<Cliente, String> getFacebookSelector() {
        return facebookSelector;
    }

    public PropertySelector<Cliente, String> getSkypeSelector() {
        return skypeSelector;
    }

    public PropertySelector<Cliente, String> getMsnSelector() {
        return msnSelector;
    }

    public PropertySelector<Cliente, String> getSiteSelector() {
        return siteSelector;
    }

    public PropertySelector<Cliente, String> getDescriptionSelector() {
        return descriptionSelector;
    }

    // Relation selectors
    public EntitySelector<Cliente, Grupocliente, Integer> getGrupoClienteSelector() {
        return grupoClienteSelector;
    }
}