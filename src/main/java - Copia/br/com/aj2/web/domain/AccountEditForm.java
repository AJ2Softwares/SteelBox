/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package br.com.aj2.web.domain;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.aj2.domain.Account;
import br.com.aj2.domain.Role;
import br.com.aj2.repository.AccountRepository;
import br.com.aj2.web.domain.AccountGraphLoader;
import br.com.aj2.web.domain.RoleController;
import br.com.aj2.web.domain.support.GenericEditForm;
import br.com.aj2.web.domain.support.GenericToManyAssociation;
import br.com.aj2.web.faces.ConversationContextScoped;
import br.com.aj2.web.util.TabBean;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 * View Helper/Controller to edit {@link Account}.
 */
@Named
@ConversationContextScoped
public class AccountEditForm extends GenericEditForm<Account, Integer> {
    @Inject
    protected RoleController roleController;
    protected GenericToManyAssociation<Role, Integer> roles;
    protected TabBean tabBean = new TabBean();

    @Inject
    public AccountEditForm(AccountRepository accountRepository, AccountGraphLoader accountGraphLoader) {
        super(accountRepository, accountGraphLoader);
    }

    /**
     * View helper to store the x-to-many associations tab's index. 
     */
    public TabBean getTabBean() {
        return tabBean;
    }

    /**
     * The entity to edit/view.
     */
    public Account getAccount() {
        return getEntity();
    }

    @PostConstruct
    void setupRolesActions() {
        roles = new GenericToManyAssociation<Role, Integer>(getAccount().getRoles(), "account_roles", roleController) {
            @Override
            protected void remove(Role role) {
                getAccount().removeRole(role);
            }

            @Override
            protected void add(Role role) {
                // add the object only to the role side of the relation 
                getAccount().getRoles().add(role);
            }
        };
    }

    public GenericToManyAssociation<Role, Integer> getRoles() {
        return roles;
    }
    public void fileUpload(FileUploadEvent event) throws IOException{
        try{
            //Instância objetos
            String url = FacesContext.getCurrentInstance().getExternalContext().getRealPath("//resources//img//");  

            //Cria um arquivo UploadFile, para receber o arquivo do evento
            UploadedFile arq = event.getFile();
            //Transformar a imagem em bytes para salvar em banco de dados
            byte[] bimagem = event.getFile().getContents();

            InputStream in = new BufferedInputStream(arq.getInputstream());
            File file = new File(url + "//"+arq.getFileName());
            //O método file.getAbsolutePath() fornece o caminho do arquivo criado
            //Pode ser usado para ligar algum objeto do banco ao arquivo enviado
            String caminho = file.getAbsolutePath();
            getAccount().setAvatarBinary(bimagem);
            getAccount().setAvatarFileName("img/"+arq.getFileName());
            getAccount().setAvatarContentType(arq.getContentType());
            FileOutputStream fout = new FileOutputStream(file);
            while(in.available() != 0)
            {
            fout.write(in.read());
            }
            fout.close();

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    public StreamedContent getStreamedContent() {
        return new DefaultStreamedContent(new ByteArrayInputStream(getAccount().getAvatarBinary()), getAccount().getAvatarContentType(), getAccount()
                .getAvatarFileName());
    }
}
