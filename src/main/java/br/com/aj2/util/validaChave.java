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
public class validaChave {
    Integer diasValidos;
    private String CodCli;
    private String serialNumber;

    public Integer getDiasValidos() {
        return diasValidos;
    }

    public void setDiasValidos(Integer diasValidos) {
        this.diasValidos = diasValidos;
    }
    
    
    public static  Long newDM(){
        Random gerador = new Random();
        return Long.parseLong(new Integer(gerador.nextInt(9)+1).toString());
    }

    public Long longHexa32(String value){
        String nvalue = value.replaceAll("[\'\"!@#$%¨&*()-=_+;:\\|/,mMnNoOpPqQrRsStTuUvVxXyYzZwW]", "");
        if (nvalue.length()>10){
            nvalue = nvalue.substring(0,9);
        }
        
        return Long.parseLong(nvalue, 32);
    }
    public Long longHexa16(String value){
        //System.out.println(value);
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
                //System.out.println(verifica.length());
                    s = new StringBuilder(verifica);  
                    s.insert(0, '0'); 
                    verifica = s.toString();
             }
        }
        return verifica;
    }
    
    public Long getCnpj(String cnpj){
        return getCatch4First(Long.parseLong(cnpj.replaceAll("[./-]", "")))  ;
    }
    
    public Long getCodCli(String email){
        return getCatch4First(longHexa32(email));
    }
    
    public static boolean isNumeric (String s) {  
        try {  
            Long.parseLong (s);   
            return true;  
        } catch (NumberFormatException ex) {  
            return false;  
        }  
    }  
    
    public void setCodCLi(String CodCli){
        this.CodCli = CodCli;
    }
    
    
    
    public Boolean ValidaChave(String chave, String cnpj,String email) throws IOException{
        chave = chave.replaceAll("-", "");
        String verificar1 = chave.substring(0,8);
        String verificar2 = chave.substring(8,16);
        Boolean isNumeric = true;

        Long condVerificar1 ;
        Long condVerificar2 ;
        
        Long verificado = Long.parseLong(chave.substring(16,21));
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
        Long calcDias = (verificado-(codCli*concat))/concat;
        diasValidos = (Integer.valueOf(calcDias.toString()));   
        setCodCLi(codCli.toString());
        
        
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

    
        
}

