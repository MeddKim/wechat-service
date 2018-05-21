package org.pmhelper.core.domain.entity.menu;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 符合类型按钮
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ComplexButton extends Button{
    private List<Button> sub_button;
}
