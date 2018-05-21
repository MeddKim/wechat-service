package org.pmhelper.wechat.interfaces.service;

import org.pmhelper.core.domain.entity.Token;

import javax.servlet.http.HttpServletRequest;

public interface CoreService {
    /**
     * 微信消息处理
     * @param request
     * @return
     */
    String processRequest(HttpServletRequest request);

    /**
     * 获取token
     * @return
     */
    Token getToken();
}
