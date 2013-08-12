/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/repository/Repository.e.vm.java
 */
package br.com.aj2.repository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.dao.ServicosDao;
import br.com.aj2.domain.Servicos;
import br.com.aj2.repository.support.GenericRepository;

/**
 * Note: you may use multiple DAO from this layer.
 */
@Named
@Singleton
public class ServicosRepository extends GenericRepository<Servicos, Integer> {

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ServicosRepository.class);

    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected ServicosRepository() {
        super();
    }

    @Inject
    public ServicosRepository(ServicosDao servicosDao) {
        super(servicosDao);
    }

    @Override
    public Servicos getNew() {
        return new Servicos();
    }

    @Override
    public Servicos getNewWithDefaults() {
        Servicos result = getNew();
        result.initDefaultValues();
        return result;
    }
}