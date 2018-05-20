package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 视频消息
 */
@Data
public class VideoMessageReq extends BaseMessageReq {
    //视频消息媒体ID
    private String MediaId;
    //视频消息缩略图的媒体ID
    private String ThumbMediaId;
}
