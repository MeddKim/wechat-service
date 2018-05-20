package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 语音消息
 */
@Data
public class VoiceMessageReq extends BaseMessageReq {
    //媒体ID
    private String MediaId;
    //语言格式
    private String Format;
    //语言识别结果，UTF-8编码
    private String Recognition;
}
