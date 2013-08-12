/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package br.com.aj2.domain;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.EnumType.STRING;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.TemporalType.TIMESTAMP;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.audit.AuditContextHolder;
import br.com.aj2.domain.Cliente;
import br.com.aj2.domain.IdentifiableHashBuilder;
import br.com.aj2.domain.ItensOs;
import br.com.aj2.domain.Os_;
import br.com.aj2.domain.Produtor;
import br.com.aj2.enumTypes.FormaPagamento;
import br.com.aj2.enumTypes.StatusOs;
import com.google.common.base.Objects;
import javax.persistence.FetchType;

@Entity
@Table(name = "os")
public class Os implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Os.class);

    // Raw attributes
    private Integer id; // pk
    private StatusOs status;
    private Date dataAtendimento;
    private Date dataConclusao;
    private Date dataVenciemento;
    private FormaPagamento formaPagamento;
    private Date creationDate;
    private String lastModificationAuthor;
    private Date lastModificationDate;
    private String creationAuthor;
    private String description;
    private Double total;

    // Many to one
    private Cliente cliente; // not null (clienteId)
    private Produtor produtor; // not null (produtorId)

    // One to many
    private List<ItensOs> listItensOs = new ArrayList<ItensOs>();

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

    public Os id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [status] ------------------------

    @Column(name = "status", length = 45)
    @Enumerated(STRING)
    public StatusOs getStatus() {
        return status;
    }

    public void setStatus(StatusOs status) {
        this.status = status;
    }

    public Os status(StatusOs status) {
        setStatus(status);
        return this;
    }

    // -- [dataAtendimento] ------------------------

    @Column(name = "data_atendimento", length = 10)
    @Temporal(DATE)
    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Os dataAtendimento(Date dataAtendimento) {
        setDataAtendimento(dataAtendimento);
        return this;
    }

    // -- [dataConclusao] ------------------------

    @Column(name = "data_conclusao", length = 10)
    @Temporal(DATE)
    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Os dataConclusao(Date dataConclusao) {
        setDataConclusao(dataConclusao);
        return this;
    }

    // -- [dataVenciemento] ------------------------

    @Column(name = "data_venciemento", length = 10)
    @Temporal(DATE)
    public Date getDataVenciemento() {
        return dataVenciemento;
    }

    public void setDataVenciemento(Date dataVenciemento) {
        this.dataVenciemento = dataVenciemento;
    }

    public Os dataVenciemento(Date dataVenciemento) {
        setDataVenciemento(dataVenciemento);
        return this;
    }

    // -- [formaPagamento] ------------------------

    @Column(name = "forma_pagamento", length = 45)
    @Enumerated(STRING)
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Os formaPagamento(FormaPagamento formaPagamento) {
        setFormaPagamento(formaPagamento);
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

    public Os creationDate(Date creationDate) {
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

    public Os lastModificationAuthor(String lastModificationAuthor) {
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

    public Os lastModificationDate(Date lastModificationDate) {
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

    public Os creationAuthor(String creationAuthor) {
        setCreationAuthor(creationAuthor);
        return this;
    }

    // -- [description] ------------------------

    @Size(max = 45)
    @Column(name = "description", length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Os description(String description) {
        setDescription(description);
        return this;
    }

    // -- [total] ------------------------

    @Column(name = "total", precision = 22)
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Os total(Double total) {
        setTotal(total);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: Os.clienteId ==> Cliente.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "cliente_id", nullable = false)
    @ManyToOne(cascade = { PERSIST, MERGE })
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the {@link #cliente} without adding this Os instance on the passed {@link #cliente}
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link Cliente}
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Os cliente(Cliente cliente) {
        setCliente(cliente);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: Os.produtorId ==> Produtor.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "produtor_id", nullable = false)
    @ManyToOne(cascade = { PERSIST, MERGE })
    public Produtor getProdutor() {
        return produtor;
    }

    /**
     * Set the {@link #produtor} without adding this Os instance on the passed {@link #produtor}
     * If you want to preserve referential integrity we recommend to use
     * instead the corresponding adder method provided by {@link Produtor}
     */
    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Os produtor(Produtor produtor) {
        setProdutor(produtor);
        return this;
    }

    // -----------------------------------------------------------------
    // One to Many support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // one to many: os ==> listItensOs
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @OneToMany(mappedBy = "os", fetch= FetchType.EAGER, orphanRemoval = true, cascade = ALL)
    public List<ItensOs> getListItensOs() {
        return listItensOs;
    }

    /**
     * Set the {@link ItensOs} list.
     * It is recommended to use the helper method {@link #addItensOs(ItensOs)} / {@link #removeItensOs(ItensOs)}
     * if you want to preserve referential integrity at the object level.
     *
     * @param listItensOs the list to set
     */
    public void setListItensOs(List<ItensOs> listItensOs) {
        this.listItensOs = listItensOs;
    }

    /**
     * Helper method to add the passed {@link ItensOs} to the {@link #listItensOs} list
     * and set this itensOss on the passed itensOs to preserve referential
     * integrity at the object level.
     *
     * @param itensOs the to add
     * @return true if the itensOs could be added to the listItensOs list, false otherwise
     */
    public boolean addItensOs(ItensOs itensOs) {
        if (getListItensOs().add(itensOs)) {
            itensOs.setOs(this);
            return true;
        }
        return false;
    }

    /**
     * Helper method to remove the passed {@link ItensOs} from the {@link #listItensOs} list and unset
     * this itensOss from the passed itensOs to preserve referential integrity at the object level.
     *
     * @param itensOs the instance to remove
     * @return true if the itensOs could be removed from the listItensOs list, false otherwise
     */
    public boolean removeItensOs(ItensOs itensOs) {
        if (getListItensOs().remove(itensOs)) {
            itensOs.setOs(null);
            return true;
        }
        return false;
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
        return this == other || (other instanceof Os && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Os instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add(Os_.id.getName(), getId()) //
                .add(Os_.status.getName(), getStatus()) //
                .add(Os_.dataAtendimento.getName(), getDataAtendimento()) //
                .add(Os_.dataConclusao.getName(), getDataConclusao()) //
                .add(Os_.dataVenciemento.getName(), getDataVenciemento()) //
                .add(Os_.formaPagamento.getName(), getFormaPagamento()) //
                .add(Os_.creationDate.getName(), getCreationDate()) //
                .add(Os_.lastModificationAuthor.getName(), getLastModificationAuthor()) //
                .add(Os_.lastModificationDate.getName(), getLastModificationDate()) //
                .add(Os_.creationAuthor.getName(), getCreationAuthor()) //
                .add(Os_.description.getName(), getDescription()) //
                .add(Os_.total.getName(), getTotal()) //
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