package org.pmhelper.core.domain.entity.req;

import lombok.Data;

/**
 * 地理位置信息
 */
@Data
public class LocationMessageReq extends BaseMessageReq {
    //地理位置维度
    private String location_X;
    //地理位置经度
    private String location_y;
}
