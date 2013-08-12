/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-spring-conversation:src/main/java/conversation/ConversationUtil.p.vm.java
 */
package br.com.aj2.web.conversation;

import static org.apache.commons.lang.StringUtils.substringAfter;
import static org.apache.commons.lang.StringUtils.substringBefore;

import javax.servlet.http.HttpServletRequest;

public class ConversationUtil {
    public static final String CID_PARAM_NAME = "_cid";
    public static final String CID_PARAM_SEPARATOR = "c";

    public static String cidParamValue(String conversationId, String conversationContextId) {
        return conversationId + CID_PARAM_SEPARATOR + conversationContextId;
    }

    public static String cidParamNameValue(String conversationId, String conversationContextId) {
        return CID_PARAM_NAME + "=" + cidParamValue(conversationId, conversationContextId);
    }

    public static String getConversationId(HttpServletRequest request) {
        String _cid = request.getParameter(CID_PARAM_NAME);
        return _cid != null ? substringBefore(_cid, CID_PARAM_SEPARATOR) : null;
    }

    public static String getConversationContextId(HttpServletRequest request) {
        String _cid = request.getParameter(CID_PARAM_NAME);
        return _cid != null ? substringAfter(_cid, CID_PARAM_SEPARATOR) : null;
    }
}