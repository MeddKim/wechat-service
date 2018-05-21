package org.pmhelper.core.domain.entity.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 图片消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageMessageReq extends BaseMessageReq {
    //图片链接
    private String PicUrl;
}
