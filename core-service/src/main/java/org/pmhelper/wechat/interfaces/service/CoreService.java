package org.pmhelper.wechat.interfaces.service;

import javax.servlet.http.HttpServletRequest;

public interface CoreService {
    /**
     * 微信消息处理
     * @param request
     * @return
     */
    String processRequest(HttpServletRequest request);
}
