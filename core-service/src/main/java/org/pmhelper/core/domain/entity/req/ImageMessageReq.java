package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 图片消息
 */
@Data
public class ImageMessageReq extends BaseMessage {
    //图片链接
    private String picUrl;
}