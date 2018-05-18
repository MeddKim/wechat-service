package org.pmhelper.core.domain.entity.event;

/**
 * 事件基类
 */
public class BaseEvent {
    //开发者微信号
    private String toUserName;
    //发送方账号（一个OpenID）
    private String fromUserName;
    //消息创建时间（整形）
    private long createTime;
    //消息类型
    private String msgType;
    //事件类型
    private String event;
}
