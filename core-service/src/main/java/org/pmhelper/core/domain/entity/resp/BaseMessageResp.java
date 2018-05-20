package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 *
 * 消息基类（公众账号 -> 普通用户）
 */
@Data
public class BaseMessageResp {
	// 接收方账号（收到的OpenID）
	private String ToUserName;
	// 开发者微信号
	private String FromUserName;
	// 消息创建时间
	private long CreateTime;
	// 消息类型
	private String MsgType;

}
