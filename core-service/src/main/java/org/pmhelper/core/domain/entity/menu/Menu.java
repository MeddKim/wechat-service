package org.pmhelper.core.domain.entity.menu;

import lombok.Data;

import java.util.List;

/**
 * 菜单类型
 */
@Data
public class Menu {
    private List<Button> button;
}
