/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package br.com.aj2.web.domain;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.aj2.domain.Cliente;
import br.com.aj2.domain.Grupocliente;
import br.com.aj2.repository.ClienteRepository;
import br.com.aj2.web.domain.ClienteGraphLoader;
import br.com.aj2.web.domain.GrupoclienteController;
import br.com.aj2.web.domain.support.GenericEditForm;
import br.com.aj2.web.domain.support.GenericToOneAssociation;
import br.com.aj2.web.faces.ConversationContextScoped;
import br.com.aj2.web.util.TabBean;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.IOException;

/**
 * View Helper/Controller to edit {@link Cliente}.
 */
@Named
@ConversationContextScoped
public class ClienteEditForm extends GenericEditForm<Cliente, Integer> {
    protected TabBean tabBean = new TabBean();
    @Inject
    protected GrupoclienteController grupoclienteController;
    protected GenericToOneAssociation<Grupocliente, Integer> grupoCliente;

    @Inject
    public ClienteEditForm(ClienteRepository clienteRepository, ClienteGraphLoader clienteGraphLoader) {
        super(clienteRepository, clienteGraphLoader);
    }

    public TabBean getTabBean() {
        return tabBean;
    }

    public void setTabBean(TabBean tabBean) {
        this.tabBean = tabBean;
    }

    
    /**
     * The entity to edit/view.
     */
    public Cliente getCliente() {
        return getEntity();
    }

    public void ImportDados() throws IOException{
                //definicao do browser
        WebClient webClient = new WebClient(BrowserVersion.FIREFOX_2);

        // página da receita
        HtmlPage url = (HtmlPage) webClient.getPage("http://www.receita.fazenda.gov.br/PessoaJuridica/CNPJ/cnpjreva/Cnpjreva_Solicitacao2.asp");


      
        // pega o form html
        HtmlForm form = url.getForms().get(0);

        form.getInputByName("cnpj").setValueAttribute("cnpj_empresa");
        form.getInputByName("idLetra").setValueAttribute("letra captcha");

        HtmlPage subm = (HtmlPage) form.getInputByName("submit1").click();

        System.out.println(subm.asXml());

    }
    
    @PostConstruct
    void setupGrupoClientesActions() {
        grupoCliente = new GenericToOneAssociation<Grupocliente, Integer>("cliente_grupoCliente", grupoclienteController) {
            @Override
            protected Grupocliente get() {
                return getCliente().getGrupoCliente();
            }

            @Override
            protected void set(Grupocliente grupocliente) {
                getCliente().setGrupoCliente(grupocliente);
            }
        };
    }

    public GenericToOneAssociation<Grupocliente, Integer> getGrupoCliente() {
        return grupoCliente;
    }
}
