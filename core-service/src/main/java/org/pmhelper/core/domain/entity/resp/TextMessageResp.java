package org.pmhelper.core.domain.entity.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文本消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TextMessageResp extends BaseMessageResp {
    //回复消息内容
    private String Content;
}
