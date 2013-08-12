
package br.com.aj2.util;

import br.com.aj2.web.domain.AgendaEditForm;
import br.com.aj2.web.domain.OsEditForm;
import java.util.List;

public class Mensagem {
 
 private List<String> destino;
 private String titulo;
 private String mensagem;
 private String anexo;
 private String anexoName;

 
 public List<String> getDestino() {
    return destino;
 }
 
 public void setDestino(List<String> destino) {
    this.destino = destino;
 }
 
 public String getMensagem() {
    return mensagem;
 }
 
 public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
 }
 
 public String getTitulo() {
    return titulo;
 }
 
 public void setTitulo(String titulo) {
    this.titulo = titulo;
 }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getAnexoName() {
        return anexoName;
    }

    public void setAnexoName(String anexoName) {
        this.anexoName = anexoName;
    }
    
    
 
}