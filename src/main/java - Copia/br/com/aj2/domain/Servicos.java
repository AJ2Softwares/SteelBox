/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package br.com.aj2.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.domain.IdentifiableHashBuilder;
import br.com.aj2.domain.Servicos_;
import com.google.common.base.Objects;

@Entity
@Table(name = "servicos")
public class Servicos implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Servicos.class);

    // Raw attributes
    private Integer id; // pk
    private String servico;
    private Double valor;

    // -- [id] ------------------------

    @Override
    @Column(name = "id_servicos", precision = 10)
    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Servicos id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [servico] ------------------------

    @Size(max = 45)
    @Column(name = "servico", length = 45)
    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Servicos servico(String servico) {
        setServico(servico);
        return this;
    }

    // -- [valor] ------------------------

    @Column(name = "valor", precision = 12)
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Servicos valor(Double valor) {
        setValor(valor);
        return this;
    }

    /**
     * Set the default values.
     */
    public void initDefaultValues() {
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Servicos && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Servicos instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add(Servicos_.id.getName(), getId()) //
                .add(Servicos_.servico.getName(), getServico()) //
                .add(Servicos_.valor.getName(), getValor()) //
                .toString();
    }
}