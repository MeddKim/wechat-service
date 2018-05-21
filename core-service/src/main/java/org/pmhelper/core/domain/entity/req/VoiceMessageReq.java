package org.pmhelper.core.domain.entity.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 语音消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VoiceMessageReq extends BaseMessageReq {
    //媒体ID
    private String MediaId;
    //语言格式
    private String Format;
    //语言识别结果，UTF-8编码
    private String Recognition;
}
