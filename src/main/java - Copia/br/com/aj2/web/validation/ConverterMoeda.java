/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aj2.web.validation;

import br.com.aj2.web.util.MessageUtil;
import java.text.NumberFormat;  
import java.util.Locale;  
import java.util.ResourceBundle;
import java.util.regex.Pattern;  
import javax.faces.application.FacesMessage;
  
import javax.faces.component.UIComponent;  
import javax.faces.context.FacesContext;  
import javax.faces.convert.Converter;  
import javax.faces.convert.ConverterException;  
import javax.faces.convert.FacesConverter;
import javax.faces.validator.FacesValidator;
import javax.inject.Named;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import org.springframework.context.annotation.Scope;
  


@Named
@Scope(SCOPE_PROTOTYPE)
@FacesConverter(value = "MoedaConverter")
public class ConverterMoeda implements Converter{  
  
   public Object getAsObject(FacesContext arg0, UIComponent arg1, String valorTela) throws ConverterException {    
             
            if(valorTela == null || valorTela.toString().trim().equals("")){    
                return null;    
        
            } else {   
             try{  
                  
                if(valorTela.contains(".")){  
                    valorTela.length();  
                    char[] valor = valorTela.toCharArray();  
                    int indice1 = valorTela.length() - 3;  
                    Character x = valorTela.charAt(indice1);  
                    if(x.equals('.')){  
                        valor[indice1] = ',';  
                    }  
                    int indice2 = valorTela.length() - 2;  
                    x = valorTela.charAt(indice2);  
                    if(x.equals('.')){  
                        valor[indice1] = ',';  
                    }  
                    valorTela = new String(valor);  
                    if(valorTela.contains(",")){  
                        valorTela = valorTela.replaceAll(Pattern.quote("."), "");    
                        String novoValor = valorTela.replace(",", ".");  
                        return new Double(novoValor);    
                    }  
                }  
               
                }catch (Exception e) {  
                     throw new ConverterException("Valor inválido");  
                }  
             
                  
            try{  
                valorTela = valorTela.replaceAll(Pattern.quote("."), "");    
                String novoValor = valorTela.replace(",", ".");  
                return new Double(novoValor);    
        
                }catch (Exception e) {  
                 throw new ConverterException("Valor inválido");    
             }    
            }    
  
     }    
     
     public String getAsString(FacesContext arg0, UIComponent arg1, Object valorTela) throws ConverterException {    
     
         if(valorTela == null || valorTela.toString().trim().equals("")){    
             return null;    
     
         } else {    
             NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));    
             nf.setMaximumFractionDigits(2);    
             nf.setMinimumFractionDigits(2);  
             return nf.format(Double.valueOf(valorTela.toString()));    
         }    
     }   
}  
