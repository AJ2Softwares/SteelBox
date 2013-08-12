/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/faces/ConversationContextScoped.p.vm.java
 */
package br.com.aj2.web.faces;

import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Retention;

import org.springframework.context.annotation.Scope;

/**
 * Beans in the 'conversationContext' scope reside in a {@link Conversation conversation}'s {@link ConversationContext}.
 * They are 'visible' only when the conversation is bound to the current thread of execution and their 
 * hosting ConversationContext is on top of the conversation's contextes stack.
 */
@Scope("conversationContext")
@Retention(RetentionPolicy.RUNTIME)
public @interface ConversationContextScoped {
}
