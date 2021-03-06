/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package br.com.aj2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import br.com.aj2.domain.Produtor;
import br.com.aj2.repository.ProdutorRepository;
import br.com.aj2.web.domain.support.GenericEditForm;
import br.com.aj2.web.faces.ConversationContextScoped;
import br.com.aj2.web.util.TabBean;

/**
 * View Helper/Controller to edit {@link Produtor}.
 */
@Named
@ConversationContextScoped
public class ProdutorEditForm extends GenericEditForm<Produtor, Integer> {
    protected TabBean tabBean = new TabBean();

    @Inject
    public ProdutorEditForm(ProdutorRepository produtorRepository) {
        super(produtorRepository);
    }

    /**
     * The entity to edit/view.
     */
    public Produtor getProdutor() {
        return getEntity();
    }

    public TabBean getTabBean() {
        return tabBean;
    }

    public void setTabBean(TabBean tabBean) {
        this.tabBean = tabBean;
    }
    
}
