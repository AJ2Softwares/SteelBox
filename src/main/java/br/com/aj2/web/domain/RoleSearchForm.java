/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package br.com.aj2.web.domain;

import static br.com.aj2.dao.support.PropertySelector.newPropertySelector;
import javax.inject.Named;
import br.com.aj2.dao.support.PropertySelector;
import br.com.aj2.dao.support.SearchParameters;
import br.com.aj2.domain.Role;
import br.com.aj2.domain.Role_;
import br.com.aj2.web.domain.support.GenericSearchForm;
import br.com.aj2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Role}.
 * It exposes a {@link Role} instance so it can be used in search by Example query.
 */
@Named
@ConversationContextScoped
public class RoleSearchForm extends GenericSearchForm<Role, Integer, RoleSearchForm> {
    private static final long serialVersionUID = 1L;

    protected Role role = new Role();
    protected PropertySelector<Role, String> roleNameSelector = newPropertySelector(Role_.roleName);

    public Role getRole() {
        return role;
    }

    @Override
    protected Role getEntity() {
        return getRole();
    }

    @Override
    public RoleSearchForm newInstance() {
        return new RoleSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        return new SearchParameters() //
                .anywhere() //
                .property(roleNameSelector) //
        ;
    }

    @Override
    public void resetWithOther(RoleSearchForm other) {
        this.role = other.getRole();
        this.roleNameSelector = other.getRoleNameSelector();
    }

    // Property selectors
    public PropertySelector<Role, String> getRoleNameSelector() {
        return roleNameSelector;
    }
}
