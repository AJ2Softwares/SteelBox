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
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.Role;
import br.com.aj2.domain.Role_;
import br.com.aj2.repository.RoleRepository;
import br.com.aj2.web.domain.support.GenericController;
import br.com.aj2.web.permission.RolePermission;

/**
 * Stateless controller for {@link Role} conversation start. 
 */
@Named
@Singleton
public class RoleController extends GenericController<Role, Integer> {
    private static final String editUri = "/domain/roleEdit.faces";
    private static final String selectUri = "/domain/roleSelect.faces";

    @Inject
    public RoleController(RoleRepository roleRepository, RolePermission rolePermission) {
        super(roleRepository, rolePermission, selectUri, editUri);
    }

    @Override
    protected SearchParameters defaultOrder(SearchParameters searchParameters) {
        searchParameters.orderBy(Role_.roleName);
        return searchParameters;
    }

}