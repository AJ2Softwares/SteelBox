/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/conversation/ConversationHolder.p.vm.java
 */
package br.com.aj2.web.conversation;

/**
 * Holds the current {@link Conversation} in the current thread of execution.
 */
public class ConversationHolder {
    private static final ThreadLocal<Conversation> currentConversationHolder = new ThreadLocal<Conversation>();

    /**
     * Returns the {@link Conversation} that is bound to the current thread of execution.
     */
    public static Conversation getCurrentConversation() {
        return currentConversationHolder.get();
    }

    /**
     * Bind the passed {@link Conversation} to the current thread of execution.
     */
    public static void setCurrentConversation(Conversation conversation) {
        currentConversationHolder.set(conversation);
    }
}