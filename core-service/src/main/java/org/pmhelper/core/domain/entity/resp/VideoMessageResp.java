package org.pmhelper.core.domain.entity.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 视频消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VideoMessageResp extends BaseMessageResp {
	// 视频
	private Video Video;
}
