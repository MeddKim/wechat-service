package org.pmhelper.core.domain.entity.event;

import lombok.Data;

/**
 * 自定义菜单点击事件
 */
@Data
public class MenuEvent extends BaseEvent {
    //事件KEY值，与自定义菜单接口中的KEY值对应
    private String eventKey;
}
