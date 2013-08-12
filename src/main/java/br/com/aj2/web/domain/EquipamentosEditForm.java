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
import javax.validation.constraints.NotNull;
import br.com.aj2.domain.Equipamentos;
import br.com.aj2.domain.TipoEquipamento;
import br.com.aj2.repository.EquipamentosRepository;
import br.com.aj2.web.domain.EquipamentosGraphLoader;
import br.com.aj2.web.domain.TipoEquipamentoController;
import br.com.aj2.web.domain.support.GenericEditForm;
import br.com.aj2.web.domain.support.GenericToOneAssociation;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link Equipamentos}.
 */
@Named
@ConversationContextScoped
public class EquipamentosEditForm extends GenericEditForm<Equipamentos, Integer> {
    @Inject
    protected TipoEquipamentoController tipoEquipamentoController;
    protected GenericToOneAssociation<TipoEquipamento, Integer> tipoEquipamento;

    @Inject
    public EquipamentosEditForm(EquipamentosRepository equipamentosRepository, EquipamentosGraphLoader equipamentosGraphLoader) {
        super(equipamentosRepository, equipamentosGraphLoader);
    }

    /**
     * The entity to edit/view.
     */
    public Equipamentos getEquipamentos() {
        return getEntity();
    }

    @PostConstruct
    void setupTipoEquipamentosActions() {
        tipoEquipamento = new GenericToOneAssociation<TipoEquipamento, Integer>("equipamentos_tipoEquipamento", tipoEquipamentoController) {
            @Override
            protected TipoEquipamento get() {
                return getEquipamentos().getTipoEquipamento();
            }

            @Override
            protected void set(TipoEquipamento tipoEquipamento) {
                getEquipamentos().setTipoEquipamento(tipoEquipamento);
            }

            @NotNull
            @Override
            public TipoEquipamento getSelected() {
                return super.getSelected();
            }
        };
    }

    public GenericToOneAssociation<TipoEquipamento, Integer> getTipoEquipamento() {
        return tipoEquipamento;
    }
}
