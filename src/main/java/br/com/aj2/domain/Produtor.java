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
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.audit.AuditContextHolder;
import br.com.aj2.domain.Produtor_;
import br.com.aj2.enumTypes.EstadoCivil;
import br.com.aj2.enumTypes.Sexo;
import br.com.aj2.enumTypes.TipoPessoa;
import br.com.aj2.enumTypes.UF;
import com.google.common.base.Objects;

@Entity
@Table(name = "produtor")
public class Produtor implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Produtor.class);

    // Raw attributes
    private Integer id; // pk
    private String nome; // not null
    private Sexo sexo;
    private Date dataNascimento;
    private EstadoCivil estadoCivil;
    private String cpfCnpj; // unique (not null)
    private String rgIe;
    private TipoPessoa tipoPessoa; // not null
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private UF uf;
    private String pais;
    private String cep;
    private String telefone;
    private String fax;
    private String celular;
    private String email; // not null
    private String facebook;
    private String skype;
    private String msn;
    private String site;
    private Double valorComissao;
    private Double salario;
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

    public Produtor id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [nome] ------------------------

    @Size(max = 100)
    @NotEmpty
    @Column(name = "nome", nullable = false, length = 100)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produtor nome(String nome) {
        setNome(nome);
        return this;
    }

    // -- [sexo] ------------------------

    @Column(name = "sexo", length = 10)
    @Enumerated(STRING)
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Produtor sexo(Sexo sexo) {
        setSexo(sexo);
        return this;
    }

    // -- [dataNascimento] ------------------------

    @Column(name = "data_nascimento", length = 10)
    @Temporal(DATE)
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Produtor dataNascimento(Date dataNascimento) {
        setDataNascimento(dataNascimento);
        return this;
    }

    // -- [estadoCivil] ------------------------

    @Column(name = "estado_civil", length = 10)
    @Enumerated(STRING)
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Produtor estadoCivil(EstadoCivil estadoCivil) {
        setEstadoCivil(estadoCivil);
        return this;
    }

    // -- [cpfCnpj] ------------------------

    @Size(max = 45)
    @NotEmpty
    @Column(name = "cpf_cnpj", nullable = false, unique = true, length = 45)
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Produtor cpfCnpj(String cpfCnpj) {
        setCpfCnpj(cpfCnpj);
        return this;
    }

    // -- [rgIe] ------------------------

    @Size(max = 45)
    @Column(name = "rg_ie", length = 45)
    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    public Produtor rgIe(String rgIe) {
        setRgIe(rgIe);
        return this;
    }

    // -- [tipoPessoa] ------------------------

    @NotNull
    @Column(name = "tipo_pessoa", nullable = false, length = 10)
    @Enumerated(STRING)
    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Produtor tipoPessoa(TipoPessoa tipoPessoa) {
        setTipoPessoa(tipoPessoa);
        return this;
    }

    // -- [logradouro] ------------------------

    @Size(max = 45)
    @Column(name = "logradouro", length = 45)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Produtor logradouro(String logradouro) {
        setLogradouro(logradouro);
        return this;
    }

    // -- [complemento] ------------------------

    @Size(max = 45)
    @Column(name = "complemento", length = 45)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Produtor complemento(String complemento) {
        setComplemento(complemento);
        return this;
    }

    // -- [bairro] ------------------------

    @Size(max = 100)
    @Column(name = "bairro", length = 100)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Produtor bairro(String bairro) {
        setBairro(bairro);
        return this;
    }

    // -- [cidade] ------------------------

    @Size(max = 100)
    @Column(name = "cidade", length = 100)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Produtor cidade(String cidade) {
        setCidade(cidade);
        return this;
    }

    // -- [uf] ------------------------

    @Column(name = "uf", length = 2)
    @Enumerated(STRING)
    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public Produtor uf(UF uf) {
        setUf(uf);
        return this;
    }

    // -- [pais] ------------------------

    @Size(max = 45)
    @Column(name = "pais", length = 45)
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Produtor pais(String pais) {
        setPais(pais);
        return this;
    }

    // -- [cep] ------------------------

    @Size(max = 10)
    @Column(name = "cep", length = 10)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Produtor cep(String cep) {
        setCep(cep);
        return this;
    }

    // -- [telefone] ------------------------

    @Size(max = 20)
    @Column(name = "telefone", length = 20)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Produtor telefone(String telefone) {
        setTelefone(telefone);
        return this;
    }

    // -- [fax] ------------------------

    @Size(max = 20)
    @Column(name = "fax", length = 20)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Produtor fax(String fax) {
        setFax(fax);
        return this;
    }

    // -- [celular] ------------------------

    @Size(max = 20)
    @Column(name = "celular", length = 20)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Produtor celular(String celular) {
        setCelular(celular);
        return this;
    }

    // -- [email] ------------------------

    @Size(max = 100)
    @NotEmpty
    @Email
    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Produtor email(String email) {
        setEmail(email);
        return this;
    }

    // -- [facebook] ------------------------

    @Size(max = 45)
    @Column(name = "facebook", length = 45)
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public Produtor facebook(String facebook) {
        setFacebook(facebook);
        return this;
    }

    // -- [skype] ------------------------

    @Size(max = 45)
    @Column(name = "skype", length = 45)
    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Produtor skype(String skype) {
        setSkype(skype);
        return this;
    }

    // -- [msn] ------------------------

    @Size(max = 100)
    @Column(name = "msn", length = 100)
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public Produtor msn(String msn) {
        setMsn(msn);
        return this;
    }

    // -- [site] ------------------------

    @Size(max = 100)
    @Column(name = "site", length = 100)
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Produtor site(String site) {
        setSite(site);
        return this;
    }

    // -- [valorComissao] ------------------------

    @Column(name = "valor_comissao", precision = 22)
    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public Produtor valorComissao(Double valorComissao) {
        setValorComissao(valorComissao);
        return this;
    }

    // -- [salario] ------------------------

    @Column(name = "salario", precision = 22)
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Produtor salario(Double salario) {
        setSalario(salario);
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

    public Produtor creationDate(Date creationDate) {
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

    public Produtor lastModificationAuthor(String lastModificationAuthor) {
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

    public Produtor lastModificationDate(Date lastModificationDate) {
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

    public Produtor creationAuthor(String creationAuthor) {
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

    public Produtor description(String description) {
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
        return this == other || (other instanceof Produtor && hashCode() == other.hashCode());
    }

    private volatile int previousHashCode = 0;

    @Override
    public int hashCode() {
        int hashCode = Objects.hashCode(getCpfCnpj());
        if (previousHashCode != 0 && previousHashCode != hashCode) {
            log.warn("DEVELOPER: hashCode has changed!." //
                    + "If you encounter this message you should take the time to carefuly review equals/hashCode for: " //
                    + getClass().getCanonicalName());
        }

        previousHashCode = hashCode;
        return hashCode;
    }

    /**
     * Construct a readable string representation for this Produtor instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add(Produtor_.id.getName(), getId()) //
                .add(Produtor_.nome.getName(), getNome()) //
                .add(Produtor_.sexo.getName(), getSexo()) //
                .add(Produtor_.dataNascimento.getName(), getDataNascimento()) //
                .add(Produtor_.estadoCivil.getName(), getEstadoCivil()) //
                .add(Produtor_.cpfCnpj.getName(), getCpfCnpj()) //
                .add(Produtor_.rgIe.getName(), getRgIe()) //
                .add(Produtor_.tipoPessoa.getName(), getTipoPessoa()) //
                .add(Produtor_.logradouro.getName(), getLogradouro()) //
                .add(Produtor_.complemento.getName(), getComplemento()) //
                .add(Produtor_.bairro.getName(), getBairro()) //
                .add(Produtor_.cidade.getName(), getCidade()) //
                .add(Produtor_.uf.getName(), getUf()) //
                .add(Produtor_.pais.getName(), getPais()) //
                .add(Produtor_.cep.getName(), getCep()) //
                .add(Produtor_.telefone.getName(), getTelefone()) //
                .add(Produtor_.fax.getName(), getFax()) //
                .add(Produtor_.celular.getName(), getCelular()) //
                .add(Produtor_.email.getName(), getEmail()) //
                .add(Produtor_.facebook.getName(), getFacebook()) //
                .add(Produtor_.skype.getName(), getSkype()) //
                .add(Produtor_.msn.getName(), getMsn()) //
                .add(Produtor_.site.getName(), getSite()) //
                .add(Produtor_.valorComissao.getName(), getValorComissao()) //
                .add(Produtor_.salario.getName(), getSalario()) //
                .add(Produtor_.creationDate.getName(), getCreationDate()) //
                .add(Produtor_.lastModificationAuthor.getName(), getLastModificationAuthor()) //
                .add(Produtor_.lastModificationDate.getName(), getLastModificationDate()) //
                .add(Produtor_.creationAuthor.getName(), getCreationAuthor()) //
                .add(Produtor_.description.getName(), getDescription()) //
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