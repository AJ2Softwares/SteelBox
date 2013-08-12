package br.com.aj2.util;

import java.io.File;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtils {
 
    private static String HOSTNAME ;
    private static Integer PORT ;
    private static String USERNAME ;
    private static String PASSWORD ;
    private static String EMAILORIGEM;
    private static HtmlEmail email;
    private static boolean SSL;
    private static boolean TLS;

    public static String getHOSTNAME() {
        return HOSTNAME;
    }

    public static void setHOSTNAME(String HOSTNAME) {
        EmailUtils.HOSTNAME = HOSTNAME;
    }

    public static Integer getPORT() {
        return PORT;
    }

    public static void setPORT(Integer PORT) {
        EmailUtils.PORT = PORT;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        EmailUtils.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        EmailUtils.PASSWORD = PASSWORD;
    }

    public static String getEMAILORIGEM() {
        return EMAILORIGEM;
    }

    public static void setEMAILORIGEM(String EMAILORIGEM) {
        EmailUtils.EMAILORIGEM = EMAILORIGEM;
    }

    public static boolean isSSL() {
        return SSL;
    }

    public static void setSSL(boolean SSL) {
        EmailUtils.SSL = SSL;
    }

    public static boolean isTLS() {
        return TLS;
    }

    public static void setTLS(boolean TLS) {
        EmailUtils.TLS = TLS;
    }
 
    
 
    
 
 public static HtmlEmail conectaEmail() throws EmailException  {
    HtmlEmail  email = new HtmlEmail();
    email.setHostName(HOSTNAME);
    email.setSmtpPort(PORT);
    email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
    email.setSSL(SSL);
    email.setTLS(TLS);
    email.setFrom(EMAILORIGEM);
    
    return email;
 }
 
 
 
 public static void enviaEmail(Mensagem mensagem) throws EmailException {
    for (int i=0;i< mensagem.getDestino().size(); i++){
        email = conectaEmail();
        email.setSubject(mensagem.getTitulo());
        email.setHtmlMsg(mensagem.getMensagem());
        email.addTo(mensagem.getDestino().get(i));//implementar laço
        
        EmailAttachment anexo = new EmailAttachment();
        anexo.setPath(mensagem.getAnexo());
        anexo.setDisposition(EmailAttachment.ATTACHMENT);
        anexo.setName(mensagem.getAnexoName());
        if (anexo.getPath()!= null){
            email.attach(anexo);
        }
        
        String resposta = email.send();
        System.out.println("Resposta de envio"+resposta);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso para: " + mensagem.getDestino(), "Informação"));
    }
    
 }

   

    
}