/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 */
package br.com.aj2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.domain.Lancamentos;
import br.com.aj2.repository.LancamentosRepository;
import br.com.aj2.web.domain.support.GenericController;
import br.com.aj2.web.permission.LancamentosPermission;

/**
 * Stateless controller for {@link Lancamentos} conversation start. 
 */
@Named
@Singleton
public class LancamentosController extends GenericController<Lancamentos, Integer> {
    private static final String editUri = "/domain/lancamentosEdit.faces";
    private static final String selectUri = "/domain/lancamentosSelect.faces";

    @Inject
    public LancamentosController(LancamentosRepository lancamentosRepository, LancamentosPermission lancamentosPermission) {
        super(lancamentosRepository, lancamentosPermission, selectUri, editUri);
    }

}