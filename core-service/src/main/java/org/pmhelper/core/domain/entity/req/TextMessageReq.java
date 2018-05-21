package org.pmhelper.core.domain.entity.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TextMessageReq extends BaseMessageReq {
    //消息内容
    private String Content;
}
