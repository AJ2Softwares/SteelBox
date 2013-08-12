/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/converter/JsfConverter.e.vm.java
 */
package br.com.aj2.web.converter;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.domain.Produtor;
import br.com.aj2.repository.ProdutorRepository;
import br.com.aj2.web.converter.GenericJsfConverter;

/**
 * JSF converter for {@link Produtor}.
 * @see GenericJsfConverter
 */
@Named
@Singleton
public class ProdutorJsfConverter extends GenericJsfConverter<Produtor, Integer> {
    @Inject
    public ProdutorJsfConverter(ProdutorRepository produtorRepository) {
        super(produtorRepository, Produtor.class, Integer.class);
    }
}