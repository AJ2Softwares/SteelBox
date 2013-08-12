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
import br.com.aj2.domain.Locacao;
import br.com.aj2.printer.DiscoverablePrinter;

/**
 * {@link org.springframework.format.Printer} for {@link Locacao} 
 *
 * @see org.springframework.format.Printer
 * @see DiscoverablePrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class LocacaoPrinter extends DiscoverablePrinter<Locacao> {
    public LocacaoPrinter() {
        super(Locacao.class);
    }

    @Override
    public String print(Locacao locacao, Locale locale) {
        if (locacao == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, locacao.getHora());
        appendIfNotEmpty(ret, locacao.getQtdHoras());
        if (locacao.getFormaPagamento() != null) {
            appendIfNotEmpty(ret, locacao.getFormaPagamento().getLabel());
        }
        return ret.toString();
    }
}