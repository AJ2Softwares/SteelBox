/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/printer/TypeAwarePrinter.p.vm.java
 */
package br.com.aj2.printer;

import static com.google.common.collect.Maps.newHashMap;
import static org.hibernate.proxy.HibernateProxyHelper.getClassWithoutInitializingProxy;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.format.Printer;

/**
 * Given the type of the object use the corresponding {@link org.springframework.format.Printer}, or use toString method.
 * 
 * @see org.springframework.format.Printer
 * @see DiscoverablePrinter
 */
@Named("printer")
@SuppressWarnings("rawtypes")
public class TypeAwarePrinter implements Printer {
    private Map<Class, DiscoverablePrinter<?>> printers = newHashMap();

    @Inject
    void buildCache(List<DiscoverablePrinter> registredPrinters) {
        for (DiscoverablePrinter printer : registredPrinters) {
            printers.put(printer.getTarget(), printer);
        }
    }

    /**
     * return the string representation using the current {@link Locale}
     */
    public String print(Object object) {
        return print(object, LocaleContextHolder.getLocale());
    }

    @SuppressWarnings("unchecked")
    @Override
    public String print(Object object, Locale locale) {
        if (object == null) {
            return "";
        }

        // note: getClassWithoutInitializingProxy expects a non null object
        // _HACK_ as we depend on hibernate here.
        DiscoverablePrinter printer = printers.get(getClassWithoutInitializingProxy(object));
        return printer == null ? object.toString() : printer.print(object, locale);
    }
}