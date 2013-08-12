/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/EntityMeta_.e.vm.java
 */
package br.com.aj2.domain;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import br.com.aj2.enumTypes.StatusLancamento;
import br.com.aj2.enumTypes.TipoLancamento;

@StaticMetamodel(Lancamentos.class)
public abstract class Lancamentos_ {

    // Raw attributes
    public static volatile SingularAttribute<Lancamentos, Integer> id;
    public static volatile SingularAttribute<Lancamentos, String> descricao;
    public static volatile SingularAttribute<Lancamentos, String> documento;
    public static volatile SingularAttribute<Lancamentos, TipoLancamento> tipo;
    public static volatile SingularAttribute<Lancamentos, StatusLancamento> status;
    public static volatile SingularAttribute<Lancamentos, Date> dataVencimento;
    public static volatile SingularAttribute<Lancamentos, Date> dataPagamento;
    public static volatile SingularAttribute<Lancamentos, Double> valor;
    public static volatile SingularAttribute<Lancamentos, Double> valorPago;
    public static volatile SingularAttribute<Lancamentos, Date> creationDate;
    public static volatile SingularAttribute<Lancamentos, String> lastModificationAuthor;
    public static volatile SingularAttribute<Lancamentos, Date> lastModificationDate;
    public static volatile SingularAttribute<Lancamentos, String> creationAuthor;
    public static volatile SingularAttribute<Lancamentos, String> description;
}