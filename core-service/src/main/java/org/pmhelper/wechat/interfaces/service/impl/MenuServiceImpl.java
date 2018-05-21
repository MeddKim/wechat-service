package org.pmhelper.wechat.interfaces.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.pmhelper.core.domain.entity.menu.Menu;
import org.pmhelper.wechat.interfaces.service.MenuService;
import org.pmhelper.wechat.interfaces.utils.CommonUtil;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MenuServiceImpl implements MenuService {

    // 菜单创建（POST）
    public final static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    // 菜单查询（GET）
    public final static String menu_get_url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
    // 菜单删除（GET）
    public final static String menu_delete_url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";

    @Override
    public Boolean createMenu(Menu menu, String accessToken) {
        Boolean result = false;
        String url = menu_create_url.replace("ACCESS_TOKEN",accessToken);

        String menuStr = new Gson().toJson(menu);

        JsonObject jsonObject = CommonUtil.httpsRequest(url,"POST",menuStr);

        if(null != jsonObject){
            int errorCode = jsonObject.get("errcode").getAsInt();
            String errorMsg = jsonObject.get("errmsg").getAsString();
            if (0 == errorCode) {
                result = true;
            } else {
                result = false;
                log.error("创建菜单失败 errcode:{} errmsg:{}", errorCode, errorMsg);
            }
        }
        return result;
    }

    @Override
    public String getMenu(String accessToken) {
        String result = null;
        String requestUrl = menu_get_url.replace("ACCESS_TOKEN", accessToken);
        // 发起GET请求查询菜单
        JsonObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);

        if (null != jsonObject) {
            result = jsonObject.toString();
        }
        return result;
    }

    @Override
    public Boolean deleteMenu(String accessToken) {
        boolean result = false;
        String requestUrl = menu_delete_url.replace("ACCESS_TOKEN", accessToken);
        // 发起GET请求删除菜单
        JsonObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);

        if (null != jsonObject) {
            int errorCode = jsonObject.get("errcode").getAsInt();
            String errorMsg = jsonObject.get("errmsg").getAsString();
            if (0 == errorCode) {
                result = true;
            } else {
                result = false;
                log.error("删除菜单失败 errcode:{} errmsg:{}", errorCode, errorMsg);
            }
        }
        return result;
    }
}
