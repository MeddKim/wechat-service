package org.pmhelper.wechat.interfaces.service;

import org.pmhelper.core.domain.entity.menu.Menu;

public interface MenuService {
    /**
     * 创建菜单
     */
    Boolean createMenu(Menu menu, String accessToken);

    /**
     * 获取菜单
     */
    String getMenu(String accessToken);

    /**
     * 删除菜单
     */
    Boolean deleteMenu(String accessToken);
}
