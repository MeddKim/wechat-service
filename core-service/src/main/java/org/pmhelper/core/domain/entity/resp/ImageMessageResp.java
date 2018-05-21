package org.pmhelper.core.domain.entity.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 图片消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageMessageResp extends BaseMessageResp {
	// 图片
	private Image Image;
}
