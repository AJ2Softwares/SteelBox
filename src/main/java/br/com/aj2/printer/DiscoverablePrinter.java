/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-backend-jpa:src/main/java/project/printer/DiscoverablePrinter.p.vm.java
 */
package br.com.aj2.printer;

import static org.apache.commons.lang.StringUtils.isBlank;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.format.Printer;

/**
 * This is a base class so the {@link TypeAwarePrinter} can get all {@link Printer} with their corresponding types.
 *
 * @see Printer
 */
public abstract class DiscoverablePrinter<T> implements Printer<T> {

    private final Class<T> clazz;

    public DiscoverablePrinter(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getTarget() {
        return clazz;
    }

    public String print(T document) {
        return print(document, LocaleContextHolder.getLocale());
    }

    protected void appendIfNotEmpty(StringBuilder builder, String value) {
        if (!isBlank(value)) {
            if (builder.length() != 0) {
                builder.append('/');
            }
            builder.append(value.trim());
        }
    }

    protected void appendIfNotEmpty(StringBuilder builder, Object value) {
        if (value != null) {
            if (builder.length() != 0) {
                builder.append('/');
            }
            builder.append(value);
        }
    }
}