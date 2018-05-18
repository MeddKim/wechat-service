package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 语音消息
 */
@Data
public class VoiceMessageReq extends BaseMessage {
    //媒体ID
    private String mediaId;
    //语言格式
    private String format;
    //语言识别结果，UTF-8编码
    private String recognition;
}
