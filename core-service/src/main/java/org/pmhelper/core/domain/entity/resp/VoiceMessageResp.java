package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 * 语音消息
 */
@Data
public class VoiceMessageResp extends BaseMessageResp {
	// 语音
	private Voice Voice;
}
