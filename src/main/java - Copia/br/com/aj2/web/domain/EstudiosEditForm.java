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
import br.com.aj2.domain.Equipamentos;
import br.com.aj2.domain.Estudios;
import br.com.aj2.repository.EstudiosRepository;
import br.com.aj2.web.domain.EquipamentosController;
import br.com.aj2.web.domain.EstudiosGraphLoader;
import br.com.aj2.web.domain.support.GenericEditForm;
import br.com.aj2.web.domain.support.GenericToManyAssociation;
import br.com.aj2.web.faces.ConversationContextScoped;
import br.com.aj2.web.util.TabBean;

/**
 * View Helper/Controller to edit {@link Estudios}.
 */
@Named
@ConversationContextScoped
public class EstudiosEditForm extends GenericEditForm<Estudios, Integer> {
    @Inject
    protected EquipamentosController equipamentosController;
    protected GenericToManyAssociation<Equipamentos, Integer> equipamentos;
    protected TabBean tabBean = new TabBean();

    @Inject
    public EstudiosEditForm(EstudiosRepository estudiosRepository, EstudiosGraphLoader estudiosGraphLoader) {
        super(estudiosRepository, estudiosGraphLoader);
    }

    /**
     * View helper to store the x-to-many associations tab's index. 
     */
    public TabBean getTabBean() {
        return tabBean;
    }

    /**
     * The entity to edit/view.
     */
    public Estudios getEstudios() {
        return getEntity();
    }

    @PostConstruct
    void setupEquipamentosActions() {
        equipamentos = new GenericToManyAssociation<Equipamentos, Integer>(getEstudios().getEquipamentos(), "estudios_equipamentos", equipamentosController) {
            @Override
            protected void remove(Equipamentos equipamentos) {
                getEstudios().removeEquipamento(equipamentos);
            }

            @Override
            protected void add(Equipamentos equipamentos) {
                // add the object only to the equipamento side of the relation 
                getEstudios().getEquipamentos().add(equipamentos);
            }
        };
    }

    public GenericToManyAssociation<Equipamentos, Integer> getEquipamentos() {
        return equipamentos;
    }
}
