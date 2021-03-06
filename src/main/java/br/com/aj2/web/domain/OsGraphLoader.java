/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/GraphLoader.e.vm.java
 */
package br.com.aj2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.domain.Os;
import br.com.aj2.repository.OsRepository;
import br.com.aj2.repository.support.EntityGraphLoader;

/**
 * Preloads the {@link Os} associations required by the view layer.
 */
@Named
@Singleton
public class OsGraphLoader extends EntityGraphLoader<Os, Integer> {
    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected OsGraphLoader() {
        super();
    }

    @Inject
    public OsGraphLoader(OsRepository osRepository) {
        super(osRepository);
    }

    @Override
    public void loadGraph(Os os) {
        loadSingular(os.getCliente());
        loadSingular(os.getProdutor());
        loadCollection(os.getListItensOs());
    }
}