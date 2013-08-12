/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aj2.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class testeEmail {

  public void sendEmail() throws EmailException {
    Email email = new SimpleEmail();
    email.setHostName("smtp.mail.yahoo.com.br");
    email.setSmtpPort(587);
    email.setAuthenticator(new DefaultAuthenticator("jpaulo_silva2005", "trojan"));
    email.setSSL(true);
    email.setTLS(true);
    email.setFrom("user@gmail.com");
    email.setSubject("TestMail");
    email.setMsg("This is a test mail ... :-)");
    email.addTo("foo@bar.com");
    email.send();

  }
  public static void main(String[] args) throws EmailException {
      testeEmail teste = new testeEmail();
      teste.sendEmail();
  }
}
    
