package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 * 图片消息
 */
@Data
public class ImageMessageResp extends BaseMessageResp {
	// 图片
	private Image Image;
}
