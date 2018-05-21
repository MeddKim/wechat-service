package org.pmhelper.core.domain.entity.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 音乐消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MusicMessageResp extends BaseMessageResp {
	// 音乐
	private Music Music;
}
