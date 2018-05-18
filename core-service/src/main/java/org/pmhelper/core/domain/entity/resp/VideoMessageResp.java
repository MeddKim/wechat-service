package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 * 视频消息
 */
@Data
public class VideoMessageResp extends BaseMessageResp {
	// 视频
	private Video video;
}
