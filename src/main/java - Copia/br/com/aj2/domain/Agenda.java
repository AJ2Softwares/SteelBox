/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/domain/Entity.e.vm.java
 */
package br.com.aj2.domain;

import static javax.persistence.TemporalType.DATE;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.domain.Agenda_;
import br.com.aj2.domain.IdentifiableHashBuilder;
import com.google.common.base.Objects;

@Entity
@Table(name = "agenda")
public class Agenda implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Agenda.class);

    // Raw attributes
    private Integer id; // pk
    private String evento; // not null
    private Date data; // not null
    private String hora; // not null
    private String arquivoFileName;
    private String descricao;
    private byte[] arquivoBinary;
    private String arquivoContentType;

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

    public Agenda id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [evento] ------------------------

    @Size(max = 255)
    @NotEmpty
    @Column(name = "evento", nullable = false)
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Agenda evento(String evento) {
        setEvento(evento);
        return this;
    }

    // -- [data] ------------------------

    @NotNull
    @Column(name = "`data`", nullable = false, length = 10)
    @Temporal(DATE)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Agenda data(Date data) {
        setData(data);
        return this;
    }

    // -- [hora] ------------------------

    @Size(max = 10)
    @NotEmpty
    @Column(name = "hora", nullable = false, length = 10)
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Agenda hora(String hora) {
        setHora(hora);
        return this;
    }

    // -- [arquivoFileName] ------------------------

    @Size(max = 255)
    @Column(name = "arquivo_file_name")
    public String getArquivoFileName() {
        return arquivoFileName;
    }

    public void setArquivoFileName(String arquivoFileName) {
        this.arquivoFileName = arquivoFileName;
    }

    public Agenda arquivoFileName(String arquivoFileName) {
        setArquivoFileName(arquivoFileName);
        return this;
    }

    // -- [descricao] ------------------------

    @Size(max = 65535)
    @Column(name = "descricao", length = 65535)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Agenda descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    // -- [arquivoBinary] ------------------------

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "arquivo_binary")
    @Lob
    public byte[] getArquivoBinary() {
        return arquivoBinary;
    }

    public void setArquivoBinary(byte[] arquivoBinary) {
        this.arquivoBinary = arquivoBinary;
    }

    public Agenda arquivoBinary(byte[] arquivoBinary) {
        setArquivoBinary(arquivoBinary);
        return this;
    }

    // -- [arquivoContentType] ------------------------

    @Size(max = 255)
    @Column(name = "arquivo_content_type")
    public String getArquivoContentType() {
        return arquivoContentType;
    }

    public void setArquivoContentType(String arquivoContentType) {
        this.arquivoContentType = arquivoContentType;
    }

    public Agenda arquivoContentType(String arquivoContentType) {
        setArquivoContentType(arquivoContentType);
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
        return this == other || (other instanceof Agenda && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Agenda instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add(Agenda_.id.getName(), getId()) //
                .add(Agenda_.evento.getName(), getEvento()) //
                .add(Agenda_.data.getName(), getData()) //
                .add(Agenda_.hora.getName(), getHora()) //
                .add(Agenda_.arquivoFileName.getName(), getArquivoFileName()) //
                .add(Agenda_.descricao.getName(), getDescricao()) //
                .add(Agenda_.arquivoBinary.getName(), getArquivoBinary()) //
                .add(Agenda_.arquivoContentType.getName(), getArquivoContentType()) //
                .toString();
    }
}