package org.pmhelper.core.domain.entity.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 地理位置信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LocationMessageReq extends BaseMessageReq {
    //地理位置维度
    private String Location_X;
    //地理位置经度
    private String Location_y;
    // 地图缩放大小
    private String Scale;
    // 地理位置信息
    private String Label;
}
