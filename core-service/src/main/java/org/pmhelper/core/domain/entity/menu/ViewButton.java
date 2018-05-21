package org.pmhelper.core.domain.entity.menu;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * view类型按钮
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ViewButton extends Button {
    private String type;
    private String url;
}
