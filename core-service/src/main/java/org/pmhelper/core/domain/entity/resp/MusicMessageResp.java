package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 * 音乐消息
 */
@Data
public class MusicMessageResp extends BaseMessageResp {
	// 音乐
	private Music music;
}
