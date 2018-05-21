package org.pmhelper.core.domain.entity.event;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 上报地理位置消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LocationEvent extends BaseEvent{
    //地理位置纬度
    private String latitude;
    //地理位置经度
    private String longitude;
    //地理位置精度
    private String precision;
}
