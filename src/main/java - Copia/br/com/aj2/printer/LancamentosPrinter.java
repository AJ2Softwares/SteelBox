/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/printer/Printer.e.vm.java
 */
package br.com.aj2.printer;

import java.util.Locale;
import javax.inject.Named;
import javax.inject.Singleton;
import br.com.aj2.domain.Lancamentos;
import br.com.aj2.printer.DiscoverablePrinter;

/**
 * {@link org.springframework.format.Printer} for {@link Lancamentos} 
 *
 * @see org.springframework.format.Printer
 * @see DiscoverablePrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class LancamentosPrinter extends DiscoverablePrinter<Lancamentos> {
    public LancamentosPrinter() {
        super(Lancamentos.class);
    }

    @Override
    public String print(Lancamentos lancamentos, Locale locale) {
        if (lancamentos == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, lancamentos.getDescricao());
        return ret.toString();
    }
}