package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 文本信息
 */
@Data
public class TextMessageReq extends BaseMessage {
    //消息内容
    private String content;
}
