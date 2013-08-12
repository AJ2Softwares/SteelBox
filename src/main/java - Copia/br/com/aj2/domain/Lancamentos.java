/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package br.com.aj2.domain;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.TemporalType.TIMESTAMP;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.audit.AuditContextHolder;
import br.com.aj2.domain.IdentifiableHashBuilder;
import br.com.aj2.domain.Lancamentos_;
import br.com.aj2.enumTypes.StatusLancamento;
import br.com.aj2.enumTypes.TipoLancamento;
import com.google.common.base.Objects;

@Entity
@Table(name = "lancamentos")
public class Lancamentos implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Lancamentos.class);

    // Raw attributes
    private Integer id; // pk
    private String descricao; // not null
    private String documento;
    private TipoLancamento tipo;
    private StatusLancamento status;
    private Date dataVencimento;
    private Date dataPagamento;
    private Double valor; // not null
    private Double valorPago;
    private Date creationDate;
    private String lastModificationAuthor;
    private Date lastModificationDate;
    private String creationAuthor;
    private String description;

    // -- [id] ------------------------

    @Override
    @Column(name = "id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Lancamentos id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [descricao] ------------------------

    @Size(max = 65535)
    @NotEmpty
    @Column(name = "descricao", nullable = false, length = 65535)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lancamentos descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    // -- [documento] ------------------------

    @Size(max = 200)
    @Column(name = "documento", length = 200)
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Lancamentos documento(String documento) {
        setDocumento(documento);
        return this;
    }

    // -- [tipo] ------------------------

    @Column(name = "tipo", length = 15)
    @Enumerated(STRING)
    public TipoLancamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoLancamento tipo) {
        this.tipo = tipo;
    }

    public Lancamentos tipo(TipoLancamento tipo) {
        setTipo(tipo);
        return this;
    }

    // -- [status] ------------------------

    @Column(name = "status", length = 15)
    @Enumerated(STRING)
    public StatusLancamento getStatus() {
        return status;
    }

    public void setStatus(StatusLancamento status) {
        this.status = status;
    }

    public Lancamentos status(StatusLancamento status) {
        setStatus(status);
        return this;
    }

    // -- [dataVencimento] ------------------------

    @Column(name = "data_vencimento", length = 10)
    @Temporal(DATE)
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Lancamentos dataVencimento(Date dataVencimento) {
        setDataVencimento(dataVencimento);
        return this;
    }

    // -- [dataPagamento] ------------------------

    @Column(name = "data_pagamento", length = 10)
    @Temporal(DATE)
    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Lancamentos dataPagamento(Date dataPagamento) {
        setDataPagamento(dataPagamento);
        return this;
    }

    // -- [valor] ------------------------

    @NotNull
    @Column(name = "valor", nullable = false, precision = 22)
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Lancamentos valor(Double valor) {
        setValor(valor);
        return this;
    }

    // -- [valorPago] ------------------------

    @Column(name = "valor_pago", precision = 22)
    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Lancamentos valorPago(Double valorPago) {
        setValorPago(valorPago);
        return this;
    }

    // -- [creationDate] ------------------------

    @Column(name = "creation_date", length = 19)
    @Temporal(TIMESTAMP)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Lancamentos creationDate(Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    // -- [lastModificationAuthor] ------------------------

    @Column(name = "last_modification_author", length = 200)
    public String getLastModificationAuthor() {
        return lastModificationAuthor;
    }

    public void setLastModificationAuthor(String lastModificationAuthor) {
        this.lastModificationAuthor = lastModificationAuthor;
    }

    public Lancamentos lastModificationAuthor(String lastModificationAuthor) {
        setLastModificationAuthor(lastModificationAuthor);
        return this;
    }

    // -- [lastModificationDate] ------------------------

    @Column(name = "last_modification_date", length = 19)
    @Temporal(TIMESTAMP)
    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public Lancamentos lastModificationDate(Date lastModificationDate) {
        setLastModificationDate(lastModificationDate);
        return this;
    }

    // -- [creationAuthor] ------------------------

    @Column(name = "creation_author", length = 200)
    public String getCreationAuthor() {
        return creationAuthor;
    }

    public void setCreationAuthor(String creationAuthor) {
        this.creationAuthor = creationAuthor;
    }

    public Lancamentos creationAuthor(String creationAuthor) {
        setCreationAuthor(creationAuthor);
        return this;
    }

    // -- [description] ------------------------

    @Size(max = 255)
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lancamentos description(String description) {
        setDescription(description);
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
        return this == other || (other instanceof Lancamentos && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Lancamentos instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add(Lancamentos_.id.getName(), getId()) //
                .add(Lancamentos_.descricao.getName(), getDescricao()) //
                .add(Lancamentos_.documento.getName(), getDocumento()) //
                .add(Lancamentos_.tipo.getName(), getTipo()) //
                .add(Lancamentos_.status.getName(), getStatus()) //
                .add(Lancamentos_.dataVencimento.getName(), getDataVencimento()) //
                .add(Lancamentos_.dataPagamento.getName(), getDataPagamento()) //
                .add(Lancamentos_.valor.getName(), getValor()) //
                .add(Lancamentos_.valorPago.getName(), getValorPago()) //
                .add(Lancamentos_.creationDate.getName(), getCreationDate()) //
                .add(Lancamentos_.lastModificationAuthor.getName(), getLastModificationAuthor()) //
                .add(Lancamentos_.lastModificationDate.getName(), getLastModificationDate()) //
                .add(Lancamentos_.creationAuthor.getName(), getCreationAuthor()) //
                .add(Lancamentos_.description.getName(), getDescription()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        if (AuditContextHolder.audit()) {
            setCreationAuthor(AuditContextHolder.username());
            setCreationDate(new Date());
        }
    }

    @PreUpdate
    protected void preUpdate() {
        if (AuditContextHolder.audit()) {
            setLastModificationAuthor(AuditContextHolder.username());
            setLastModificationDate(new Date());
        }
    }
}