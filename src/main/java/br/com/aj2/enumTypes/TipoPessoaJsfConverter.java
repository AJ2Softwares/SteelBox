/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/converter/converter.enum.vm.java
 */
package br.com.aj2.enumTypes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import javax.inject.Named;
import javax.inject.Singleton;

import br.com.aj2.enumTypes.TipoPessoa;

/**
 * Responsible for creating TipoPessoa JSF converters required for multiple select! (support null)
 */
@Named
@Singleton
public class TipoPessoaJsfConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        if (arg2 != null && !arg2.isEmpty()) {
            return TipoPessoa.valueOf(arg2);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        if (arg2 instanceof TipoPessoa) {
            return ((TipoPessoa) arg2).name();
        }
        return "";
    }
}
