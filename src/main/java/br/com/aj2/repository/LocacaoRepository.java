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
import br.com.aj2.dao.LocacaoDao;
import br.com.aj2.domain.Locacao;
import br.com.aj2.repository.support.GenericRepository;

/**
 * Note: you may use multiple DAO from this layer.
 */
@Named
@Singleton
public class LocacaoRepository extends GenericRepository<Locacao, Integer> {

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(LocacaoRepository.class);

    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected LocacaoRepository() {
        super();
    }

    @Inject
    public LocacaoRepository(LocacaoDao locacaoDao) {
        super(locacaoDao);
    }

    @Override
    public Locacao getNew() {
        return new Locacao();
    }

    @Override
    public Locacao getNewWithDefaults() {
        Locacao result = getNew();
        result.initDefaultValues();
        return result;
    }
}