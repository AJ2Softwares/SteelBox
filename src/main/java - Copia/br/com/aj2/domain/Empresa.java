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
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.aj2.domain.Empresa_;
import br.com.aj2.enumTypes.TipoPessoa;
import br.com.aj2.enumTypes.UF;
import com.google.common.base.Objects;

@Entity
@Table(name = "empresa")
public class Empresa implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Empresa.class);

    // Raw attributes
    private Integer id; // pk
    private String razaosocial; // unique (not null)
    private String cnpj; // unique (not null)
    private String ie;
    private String nomeFantasia;
    private String sigla;
    private String telefone;
    private String fax;
    private String facebook;
    private String site;
    private String email; // unique (not null)
    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private UF uf;
    private String cep;
    private Date expiredate;
    private String serialhd;
    private Boolean ativo; // unique (but null allowed)
    private String plano;
    private String logo;
    private TipoPessoa tipoPessoa; // not null
    private String botonrelatorio;
    private byte[] logomarcaBinary;
    private String logomarcaFileName;
    private String logomarcaContentType;
    private Integer port;
    private String hostname;
    private String emailOrigem;
    private String username;
    private String password;
    private Boolean tls;
    private Boolean ssl;

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

    public Empresa id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [razaosocial] ------------------------

    @Size(max = 50)
    @NotEmpty
    @Column(name = "RazaoSocial", nullable = false, unique = true, length = 50)
    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public Empresa razaosocial(String razaosocial) {
        setRazaosocial(razaosocial);
        return this;
    }

    // -- [cnpj] ------------------------

    @Size(max = 20)
    @NotEmpty
    @Column(name = "cnpj", nullable = false, unique = true, length = 20)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa cnpj(String cnpj) {
        setCnpj(cnpj);
        return this;
    }

    // -- [ie] ------------------------

    @Size(max = 20)
    @Column(name = "ie", length = 20)
    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Empresa ie(String ie) {
        setIe(ie);
        return this;
    }

    // -- [nomeFantasia] ------------------------

    @Size(max = 20)
    @Column(name = "nome_fantasia", length = 20)
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Empresa nomeFantasia(String nomeFantasia) {
        setNomeFantasia(nomeFantasia);
        return this;
    }

    // -- [sigla] ------------------------

    @Size(max = 10)
    @Column(name = "sigla", length = 10)
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Empresa sigla(String sigla) {
        setSigla(sigla);
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

    public Empresa telefone(String telefone) {
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

    public Empresa fax(String fax) {
        setFax(fax);
        return this;
    }

    // -- [facebook] ------------------------

    @Size(max = 20)
    @Column(name = "facebook", length = 20)
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public Empresa facebook(String facebook) {
        setFacebook(facebook);
        return this;
    }

    // -- [site] ------------------------

    @Size(max = 45)
    @Column(name = "site", length = 45)
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Empresa site(String site) {
        setSite(site);
        return this;
    }

    // -- [email] ------------------------

    @Size(max = 200)
    @NotEmpty
    @Email
    @Column(name = "email", nullable = false, unique = true, length = 200)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa email(String email) {
        setEmail(email);
        return this;
    }

    // -- [logradouro] ------------------------

    @Size(max = 100)
    @Column(name = "logradouro", length = 100)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Empresa logradouro(String logradouro) {
        setLogradouro(logradouro);
        return this;
    }

    // -- [complemento] ------------------------

    @Size(max = 50)
    @Column(name = "complemento", length = 50)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Empresa complemento(String complemento) {
        setComplemento(complemento);
        return this;
    }

    // -- [numero] ------------------------

    @Size(max = 10)
    @Column(name = "numero", length = 10)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Empresa numero(String numero) {
        setNumero(numero);
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

    public Empresa bairro(String bairro) {
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

    public Empresa cidade(String cidade) {
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

    public Empresa uf(UF uf) {
        setUf(uf);
        return this;
    }

    // -- [cep] ------------------------

    @Size(max = 20)
    @Column(name = "cep", length = 20)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Empresa cep(String cep) {
        setCep(cep);
        return this;
    }

    // -- [expiredate] ------------------------

    @Column(name = "expireDate", length = 10)
    @Temporal(DATE)
    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public Empresa expiredate(Date expiredate) {
        setExpiredate(expiredate);
        return this;
    }

    // -- [serialhd] ------------------------

    @Size(max = 45)
    @Column(name = "serialHd", length = 45)
    public String getSerialhd() {
        return serialhd;
    }

    public void setSerialhd(String serialhd) {
        this.serialhd = serialhd;
    }

    public Empresa serialhd(String serialhd) {
        setSerialhd(serialhd);
        return this;
    }

    // -- [ativo] ------------------------

    @Column(name = "ativo", unique = true, length = 0)
    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Empresa ativo(Boolean ativo) {
        setAtivo(ativo);
        return this;
    }

    // -- [plano] ------------------------

    @Size(max = 45)
    @Column(name = "plano", length = 45)
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Empresa plano(String plano) {
        setPlano(plano);
        return this;
    }

    // -- [logo] ------------------------

    @Size(max = 255)
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Empresa logo(String logo) {
        setLogo(logo);
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

    public Empresa tipoPessoa(TipoPessoa tipoPessoa) {
        setTipoPessoa(tipoPessoa);
        return this;
    }

    // -- [botonrelatorio] ------------------------

    @Size(max = 2147483647)
    @Column(name = "botonRelatorio", length = 2147483647)
    public String getBotonrelatorio() {
        return botonrelatorio;
    }

    public void setBotonrelatorio(String botonrelatorio) {
        this.botonrelatorio = botonrelatorio;
    }

    public Empresa botonrelatorio(String botonrelatorio) {
        setBotonrelatorio(botonrelatorio);
        return this;
    }

    // -- [logomarcaBinary] ------------------------

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "logomarca_binary")
    @Lob
    public byte[] getLogomarcaBinary() {
        return logomarcaBinary;
    }

    public void setLogomarcaBinary(byte[] logomarcaBinary) {
        this.logomarcaBinary = logomarcaBinary;
    }

    public Empresa logomarcaBinary(byte[] logomarcaBinary) {
        setLogomarcaBinary(logomarcaBinary);
        return this;
    }

    // -- [logomarcaFileName] ------------------------

    @Size(max = 255)
    @Column(name = "logomarca_file_name")
    public String getLogomarcaFileName() {
        return logomarcaFileName;
    }

    public void setLogomarcaFileName(String logomarcaFileName) {
        this.logomarcaFileName = logomarcaFileName;
    }

    public Empresa logomarcaFileName(String logomarcaFileName) {
        setLogomarcaFileName(logomarcaFileName);
        return this;
    }

    // -- [logomarcaContentType] ------------------------

    @Size(max = 255)
    @Column(name = "logomarca_content_type")
    public String getLogomarcaContentType() {
        return logomarcaContentType;
    }

    public void setLogomarcaContentType(String logomarcaContentType) {
        this.logomarcaContentType = logomarcaContentType;
    }

    public Empresa logomarcaContentType(String logomarcaContentType) {
        setLogomarcaContentType(logomarcaContentType);
        return this;
    }

    @Column(name = "email_port")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Size(max = 255)
    @Column(name = "email_hostname")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Size(max = 255)
    @Column(name = "email_origem")
    public String getEmailOrigem() {
        return emailOrigem;
    }

    public void setEmailOrigem(String emailOrigem) {
        this.emailOrigem = emailOrigem;
    }

    @Size(max = 255)
    @Column(name = "email_username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Size(max = 15)
    @Column(name = "email_password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email_tls")
    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    @Column(name = "email_ssl")
    public Boolean getSsl() {
        return ssl;
    }

    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
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
        return this == other || (other instanceof Empresa && hashCode() == other.hashCode());
    }

    private volatile int previousHashCode = 0;

    @Override
    public int hashCode() {
        int hashCode = Objects.hashCode(getEmail());
        if (previousHashCode != 0 && previousHashCode != hashCode) {
            log.warn("DEVELOPER: hashCode has changed!." //
                    + "If you encounter this message you should take the time to carefuly review equals/hashCode for: " //
                    + getClass().getCanonicalName());
        }

        previousHashCode = hashCode;
        return hashCode;
    }

    /**
     * Construct a readable string representation for this Empresa instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add(Empresa_.id.getName(), getId()) //
                .add(Empresa_.razaosocial.getName(), getRazaosocial()) //
                .add(Empresa_.cnpj.getName(), getCnpj()) //
                .add(Empresa_.ie.getName(), getIe()) //
                .add(Empresa_.nomeFantasia.getName(), getNomeFantasia()) //
                .add(Empresa_.sigla.getName(), getSigla()) //
                .add(Empresa_.telefone.getName(), getTelefone()) //
                .add(Empresa_.fax.getName(), getFax()) //
                .add(Empresa_.facebook.getName(), getFacebook()) //
                .add(Empresa_.site.getName(), getSite()) //
                .add(Empresa_.email.getName(), getEmail()) //
                .add(Empresa_.logradouro.getName(), getLogradouro()) //
                .add(Empresa_.complemento.getName(), getComplemento()) //
                .add(Empresa_.numero.getName(), getNumero()) //
                .add(Empresa_.bairro.getName(), getBairro()) //
                .add(Empresa_.cidade.getName(), getCidade()) //
                .add(Empresa_.uf.getName(), getUf()) //
                .add(Empresa_.cep.getName(), getCep()) //
                .add(Empresa_.expiredate.getName(), getExpiredate()) //
                .add(Empresa_.serialhd.getName(), getSerialhd()) //
                .add(Empresa_.ativo.getName(), getAtivo()) //
                .add(Empresa_.plano.getName(), getPlano()) //
                .add(Empresa_.logo.getName(), getLogo()) //
                .add(Empresa_.tipoPessoa.getName(), getTipoPessoa()) //
                .add(Empresa_.botonrelatorio.getName(), getBotonrelatorio()) //
                .add(Empresa_.logomarcaBinary.getName(), getLogomarcaBinary()) //
                .add(Empresa_.logomarcaFileName.getName(), getLogomarcaFileName()) //
                .add(Empresa_.logomarcaContentType.getName(), getLogomarcaContentType()) //
                .toString();
    }
}