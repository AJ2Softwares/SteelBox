/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aj2.web.util;

import br.com.aj2.dao.support.PropertySelector;
import static br.com.aj2.dao.support.PropertySelector.newPropertySelector;
import br.com.aj2.domain.Cliente;
import br.com.aj2.domain.Cliente_;
import br.com.aj2.util.Mensagem;
import br.com.aj2.web.faces.ConversationContextScoped;
import javax.inject.Named;

/**
 *
 * @author João Paulo
 */
@Named
@ConversationContextScoped
public class MensagemBean {
    protected Cliente cliente = new Cliente();
    public Mensagem mensagem;
    protected PropertySelector<Cliente, String> emailSelector = newPropertySelector(Cliente_.email);

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    
    public PropertySelector<Cliente, String> getEmailSelector() {
        return emailSelector;
    }
    
    
}
