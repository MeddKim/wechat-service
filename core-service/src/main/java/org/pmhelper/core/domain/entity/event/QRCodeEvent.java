package org.pmhelper.core.domain.entity.event;

import lombok.Data;

/**
 * 扫描二维码事件
 */
@Data
public class QRCodeEvent extends BaseEvent {
    //事件KEY值
    private String eventKey;
    //用于换取二维码
    private String ticket;
}
