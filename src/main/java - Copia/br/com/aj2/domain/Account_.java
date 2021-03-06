/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/EntityMeta_.e.vm.java
 */
package br.com.aj2.domain;

import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import br.com.aj2.domain.Role;
import br.com.aj2.enumTypes.EstadoCivil;

@StaticMetamodel(Account.class)
public abstract class Account_ {

    // Raw attributes
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, String> login;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> email;
    public static volatile SingularAttribute<Account, Boolean> isEnabled;
    public static volatile SingularAttribute<Account, EstadoCivil> civility;
    public static volatile SingularAttribute<Account, String> firstName;
    public static volatile SingularAttribute<Account, String> lastName;
    public static volatile SingularAttribute<Account, Date> birthDate;
    public static volatile SingularAttribute<Account, String> description;
    public static volatile SingularAttribute<Account, Date> creationDate;
    public static volatile SingularAttribute<Account, String> creationAuthor;
    public static volatile SingularAttribute<Account, Date> lastModificationDate;
    public static volatile SingularAttribute<Account, String> lastModificationAuthor;
    public static volatile SingularAttribute<Account, Integer> version;
    public static volatile SingularAttribute<Account, String> avatarFileName;
    public static volatile SingularAttribute<Account, String> avatarContentType;
    public static volatile SingularAttribute<Account, byte[]> avatarBinary;

    // Many to many
    public static volatile ListAttribute<Account, Role> roles;
}