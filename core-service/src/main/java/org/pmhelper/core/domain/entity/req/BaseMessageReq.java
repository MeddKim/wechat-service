package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 请求消息基类（普通用户->公众账号）
 */
@Data
public class BaseMessageReq {
    //开发者微信号
    private String ToUserName;
    //发送方账号（一个OpenID）
    private String FromUserName;
    //消息创建时间（整形）
    private long CreateTime;
    //消息类型
    private String MsgType;
    //消息ID
    private long MsgId;
}
