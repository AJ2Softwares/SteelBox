/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aj2.util;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author João Paulo
 */
public class teste {

    /**
     * @param args the command line arguments
     */
  
    public static  Long newDM(){
        Random gerador = new Random();
        Long gerado = 0L;
        
            gerado = Long.parseLong(new Integer(gerador.nextInt(9)+1).toString());
        
        return gerado;
    }
    private int diasValidos;
    public Long longHexa32(String value){
        
        String nvalue = value.replaceAll("[\'\"!@#$%¨&*()-=_+;:\\|/,mMnNoOpPqQrRsStTuUvVxXyYzZwW]", "");
        if (nvalue.length()>10){
            nvalue = nvalue.substring(0,9);
        }
        
        return Long.parseLong(nvalue, 32);
    }
    public Long longHexa16(String value){
       
        String nvalue = value.replaceAll("[\'\"!@#$%¨&*()-=_+;:\\|/,gGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVxXyYzZwW]", "");
        
        return Long.parseLong(nvalue, 16);
    }
    
    public Long getMesAtual(){
        GregorianCalendar calendar = new GregorianCalendar();  
        return Long.parseLong(new Integer(1+calendar.get(GregorianCalendar.MONTH)).toString());
        
    }
    
    public Long getAnoAtual(){
        GregorianCalendar calendar = new GregorianCalendar();  
        
        return Long.parseLong(new Integer(calendar.get(GregorianCalendar.YEAR)).toString());
    }
    
    private Long getCatch4First(Long value) {
        String nValue = value.toString();
        return Long.parseLong(nValue.substring(0,4));
    }
    
    public Long getSerial() throws IOException{
        String serial = SerialHd.getHDSerial();
        long longSerial = Long.parseLong(serial, 16);
        String hexSerial = Long.toHexString(longSerial);
        Long longHexSerial = longHexa16(hexSerial);
        
        return getCatch4First(longHexSerial);
    }
    public Long concatDM(String dm1, String dm2){
        String nDM = dm1+dm2;
        return Long.parseLong(nDM);
    }
    public String validaVerificador(String verificador){
        StringBuilder s = null;
        //Long verificar1 = 326231523531L;
        String verifica = verificador.toString();
        if (verifica.length()>8){
            verifica = verifica.substring(0,8);
        }else if (verifica.length()<8){
            while (verifica.length()<8){
                    s = new StringBuilder(verifica);  
                    s.insert(0, '0'); 
                    verifica = s.toString();
             }
        }
        return verifica;
    }
    
    public String validaVerificado(String verificador){
        StringBuilder s = null;
        //Long verificar1 = 326231523531L;
        String verifica = verificador.toString();
        if (verifica.length()>5){
            verifica = verifica.substring(0,5);
        }else if (verifica.length()<5){
            while (verifica.length()<5){
                //System.out.println(verifica.length());
                    s = new StringBuilder(verifica);  
                    s.insert(0, '0'); 
                    verifica = s.toString();
             }
        }
        return verifica;
    }

    public int getDiasValidos() {
        return diasValidos;
    }

    public void setDiasValidos(int diasValidos) {
        this.diasValidos = diasValidos;
    }
    
    
    
    
    public Boolean ValidaChave(String chave, String cnpj,String email) throws IOException{
        chave = chave.replaceAll("-", "");
        String verificar1 = chave.substring(0,8);
        String verificar2 = chave.substring(8,16);
        Long verificado = Long.parseLong(chave.substring(16,21));
        
        Long condVerificar1 ;
        Long condVerificar2 ;
        
        Long DM1 = Long.parseLong(chave.substring(21,22));
        Long DM2 = Long.parseLong(chave.substring(22,23));
        Long DM3 = Long.parseLong(chave.substring(23,24));
        
        
        String concatDm = DM1.toString()+DM2.toString();
        
        
        Long ano = getAnoAtual();
        Long mes = getMesAtual();
        
        
        Long codCli = getCodCli(email);
        Long nCnpj = getCnpj(cnpj);
        Long serialHd = getSerial();
        
        Long concat = concatDM(DM1.toString(), DM2.toString());
        Long calcDiasValidos = (verificado-(codCli*concat))/concat;
        diasValidos = Integer.valueOf(calcDiasValidos.toString());                
        
        if ((DM3 % 2)>0){
            condVerificar1 = (nCnpj+codCli)*DM1*mes;
            condVerificar2 = (serialHd+codCli)*(ano+DM2);
            
            String sCondVerificar1 = validaVerificador(condVerificar1.toString());
            String sCondVerificar2 = validaVerificador(condVerificar2.toString());
            
            if (sCondVerificar1.equals(verificar1) && sCondVerificar2.equals(verificar2)){
                return true;
            }else{
                return false;
            }
        }else{
            condVerificar2 = (nCnpj+codCli)*DM1*mes;
            condVerificar1 = (serialHd+codCli)*(ano+DM2);
            
            String sCondVerificar1 = validaVerificador(condVerificar1.toString());
            String sCondVerificar2 = validaVerificador(condVerificar2.toString());
            
            if (sCondVerificar1.equals(verificar1) && sCondVerificar2.equals(verificar2)){
                return true;
            }else{
                return false;
            }
        }    
        
    }
    
    public Long getCnpj(String cnpj){
        return getCatch4First(Long.parseLong(cnpj.replaceAll("[./-]", "")))  ;
    }
    
    public Long getCodCli(String email){
        return getCatch4First(longHexa32(email));
    }
    public String GeraSerialKey(String cnpj,String email, String diasValidos) throws IOException{
        StringBuilder s = null ;
        Long DM1 = 0L;
        while (DM1 == 0L){
            DM1 = newDM();
        }
        Long DM2 = 0L;
        while (DM2 == 0L){
            DM2 = newDM();
        }
        Long DM3 = 0L;
        while (DM3 == 0L){
            DM3 = newDM();
        }
        
        
        
        String serial;
        //Long nCnpj = getCatch4First(Long.parseLong(cnpj))  ;
        
        
        //Pega os 4 primeiros digitos validos do cnpj;
        Long nCnpj = getCnpj(cnpj);
        //Pega os 4 primeiros digitos convertido do email;
        Long codCli = getCodCli(email);
        //Pega o serial retornado da função serial
        
        Long serialHd = getSerial();
        
        Long ano = getAnoAtual();
        
        Long mes = getMesAtual();
        Long verificar1;
        Long verificar2;
        Long verificado;
        
        String dmsVerificado;
        if ((DM3 % 2)>0){
            verificar1 = (nCnpj+codCli)*DM1*mes;
            verificar2 = (serialHd+codCli)*(ano+DM2);
        }else{
            verificar2 = (nCnpj+codCli)*DM1*mes;
            verificar1 = (serialHd+codCli)*(ano+DM2);            
        }
        
        
        verificado = (((codCli+Long.parseLong(diasValidos)) * concatDM(DM1.toString(),DM2.toString())));
        
        dmsVerificado = validaVerificado(verificado.toString())+DM1.toString()+DM2.toString()+DM3.toString();
        
        serial = (validaVerificador(verificar1.toString())+"-"+validaVerificador(verificar2.toString())+"-"+dmsVerificado);
        return serial;
    }
    
    public static void main(String[] args) throws IOException {
        
        String cnpj = "48.797.831/0001-62";
        String email = "empresa@aj2.com.br";
        String dataExpira = "120";
        
        teste t = new teste();
        //String chave = "12241188-00051440-46719292";
        //System.out.println("Nova chave: "+t.GeraSerialKey(cnpj, email,dataExpira)); 
        String chave =t.GeraSerialKey(cnpj, email,dataExpira); 
        System.out.println("a chave "+chave+" é valida? : "+t.ValidaChave(chave, cnpj, email)); 
        //System.out.println("Dias de validade "+t.getDiasValidos());
       //String bin = "jaieedcahail";
       //System.out.println(Long.parseLong(bin, 32));
        
}

    
}