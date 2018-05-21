package org.pmhelper.core.domain.entity.event;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 扫描二维码事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QRCodeEvent extends BaseEvent {
    //事件KEY值
    private String eventKey;
    //用于换取二维码
    private String ticket;
}
