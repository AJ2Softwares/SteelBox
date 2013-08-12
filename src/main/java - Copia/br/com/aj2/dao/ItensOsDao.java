/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/dao/DAOImpl.e.vm.java
 */
package br.com.aj2.dao;

import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.dao.ItensOsDao;
import br.com.aj2.dao.support.GenericDao;
import br.com.aj2.domain.ItensOs;

/**
 * JPA 2 Data Access Object for {@link ItensOs}.
 * Note: do not use @Transactional in the DAO layer.
 */
@Named
@Singleton
public class ItensOsDao extends GenericDao<ItensOs, Integer> {
    public ItensOsDao() {
        super(ItensOs.class);
    }
}