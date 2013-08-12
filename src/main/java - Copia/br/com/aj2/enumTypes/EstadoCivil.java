/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Enum.enum.vm.java
 */
package br.com.aj2.enumTypes;

import br.com.aj2.util.ResourcesUtil;

public enum EstadoCivil {
    SOLTEIRO, CASADO, DIVORCIADO;

    public String getLabel() {
        return ResourcesUtil.getInstance().getProperty("EstadoCivil_" + name());
    }
}