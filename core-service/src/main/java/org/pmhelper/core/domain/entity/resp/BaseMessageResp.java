package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 *
 * 消息基类（公众账号 -> 普通用户）
 */
@Data
public class BaseMessageResp {
	// 接收方账号（收到的OpenID）
	private String toUserName;
	// 开发者微信号
	private String fromUserName;
	// 消息创建时间
	private long createTime;
	// 消息类型
	private String msgType;

}
