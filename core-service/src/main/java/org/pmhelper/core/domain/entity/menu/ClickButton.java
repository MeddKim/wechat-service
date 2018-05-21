package org.pmhelper.core.domain.entity.menu;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * click类型按钮
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClickButton extends Button{
    private String type;
    private String key;
}
