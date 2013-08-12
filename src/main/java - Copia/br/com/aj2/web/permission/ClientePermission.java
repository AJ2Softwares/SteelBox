/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/permission/Permission.e.vm.java
 */
package br.com.aj2.web.permission;

import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.domain.Cliente;
import br.com.aj2.web.permission.support.GenericPermission;

@Named
@Singleton
public class ClientePermission extends GenericPermission<Cliente> {
}