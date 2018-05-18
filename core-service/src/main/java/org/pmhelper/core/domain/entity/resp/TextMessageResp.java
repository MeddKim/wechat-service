package org.pmhelper.core.domain.entity.resp;

import lombok.Data;

/**
 * 文本消息
 */
@Data
public class TextMessageResp extends BaseMessageResp {
    //回复消息内容
    private String Content;
}
