package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 * 音乐
 */
@Data
public class Music {
	// 音乐标题
	private String title;
	// 音乐描述
	private String description;
	// 音乐链接
	private String musicUrl;
	// 高质量音乐链接（WI-FI环境优先使用该链接播放音乐）
	private String hQMusicUrl;
	// 缩略图媒体ID,通过上传多媒体得到
	private String thumbMediaId;
}
