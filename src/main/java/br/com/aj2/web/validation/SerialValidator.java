package br.com.aj2.web.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.ResourceBundle;
import javax.faces.validator.FacesValidator;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
* Validação de CNPJ.
*
* @author Pablo Nóbrega
*/


@Named
@Scope(SCOPE_PROTOTYPE)
@FacesValidator(value = "serialValidator")
public class SerialValidator implements Validator {
     @Override
     public void validate(FacesContext arg0, UIComponent arg1, Object valorTela) throws ValidatorException {
          if (!validaSerial(String.valueOf(valorTela))) {
               FacesMessage message = new FacesMessage();
               message.setSeverity(FacesMessage.SEVERITY_ERROR);
               message.setSummary(ResourceBundle.getBundle(FacesContext.getCurrentInstance().getApplication().getMessageBundle()).getString("erro.validacao.cnpj"));
               throw new ValidatorException(message);
          }
     }

     /**
     * Valida CNPJ do usuário.
     *
     * @param cnpj String valor com 14 dígitos
    */
    public static String noCaracterSerial(String value){
         String serial = value;
        if (value!= null && !value.equals("")) {
            serial = value.replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("/", "");
        }

        return serial;
     }
     public static boolean validaSerial(String value) {
         String serial = noCaracterSerial(value);
          if(serial == null || serial.length() != 24)
               return false;

          try {
               serial.toString();
          } catch (NumberFormatException e) { // CNPJ não possui somente números
               return false;
          }

          
         return serial.equals("");
     }
}

