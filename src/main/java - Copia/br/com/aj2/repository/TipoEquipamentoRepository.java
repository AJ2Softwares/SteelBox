/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/repository/Repository.e.vm.java
 */
package br.com.aj2.repository;

import static org.apache.commons.lang.StringUtils.isBlank;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import br.com.aj2.dao.TipoEquipamentoDao;
import br.com.aj2.domain.TipoEquipamento;
import br.com.aj2.repository.support.GenericRepository;

/**
 * Note: you may use multiple DAO from this layer.
 */
@Named
@Singleton
public class TipoEquipamentoRepository extends GenericRepository<TipoEquipamento, Integer> {

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TipoEquipamentoRepository.class);

    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected TipoEquipamentoRepository() {
        super();
    }

    @Inject
    public TipoEquipamentoRepository(TipoEquipamentoDao tipoEquipamentoDao) {
        super(tipoEquipamentoDao);
    }

    @Override
    public TipoEquipamento getNew() {
        return new TipoEquipamento();
    }

    @Override
    public TipoEquipamento getNewWithDefaults() {
        TipoEquipamento result = getNew();
        result.initDefaultValues();
        return result;
    }

    @Override
    @Transactional(readOnly = true)
    public TipoEquipamento get(TipoEquipamento model) {
        if (model == null) {
            return null;
        }

        if (model.isIdSet()) {
            return super.get(model);
        }
        if (isBlank(model.getDescricao())) {
            TipoEquipamento result = getByDescricao(model.getDescricao());
            if (result != null) {
                return result;
            }
        }

        return null;
    }

    /**
     * Return the persistent instance of {@link TipoEquipamento} with the given unique property value descricao,
     * or null if there is no such persistent instance.
     *
     * @param descricao the unique value
     * @return the corresponding {@link TipoEquipamento} persistent instance or null
     */
    @Transactional(readOnly = true)
    public TipoEquipamento getByDescricao(String descricao) {
        return findUniqueOrNone(new TipoEquipamento().descricao(descricao));
    }

    /**
     * Delete a {@link TipoEquipamento} using the unique column descricao
     *
     * @param descricao the unique value
     */
    @Transactional
    public void deleteByDescricao(String descricao) {
        delete(getByDescricao(descricao));
    }
}