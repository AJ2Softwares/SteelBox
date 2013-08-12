/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 */
package br.com.aj2.web.domain;

import br.com.aj2.domain.ItensOs;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.domain.Os;
import br.com.aj2.repository.OsRepository;
import br.com.aj2.web.domain.support.GenericController;
import br.com.aj2.web.permission.OsPermission;
import java.util.List;

/**
 * Stateless controller for {@link Os} conversation start. 
 */
@Named
@Singleton
public class OsController extends GenericController<Os, Integer> {
    private static final String editUri = "/domain/osEdit.faces";
    private static final String selectUri = "/domain/osSelect.faces";

    @Inject
    public OsController(OsRepository osRepository, OsPermission osPermission) {
        super(osRepository, osPermission, selectUri, editUri);
    }

    public static Double somar(List<ItensOs> itensOss){
        Double total = 0D;
       for (ItensOs ios: itensOss){
            total = total+ios.getTotal();
        }
        return total;
        
    }
}