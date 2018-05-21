package org.pmhelper.core.domain.entity.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 语音消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VoiceMessageResp extends BaseMessageResp {
	// 语音
	private Voice Voice;
}
