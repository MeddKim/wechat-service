package org.pmhelper.wechat.interfaces.controller;


import org.pmhelper.core.domain.entity.menu.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@RequestMapping("/menu")
public class MenuController {

    @GetMapping("/add")
    public Object addMenu(){
        return null;
    }

    public Menu createMenu(){
        ClickButton btn1 = new ClickButton();
        btn1.setName("今日歌曲");
        btn1.setKey("click");
        btn1.setKey("V1001_TODAY_MUSIC");

        ViewButton btn2 = new ViewButton();
        btn2.setName("歌手简介");
        btn2.setType("view");
        btn2.setUrl("http://www.qq.com/");

        ClickButton btn31 = new ClickButton();
        btn31.setName("Hello World");
        btn31.setType("click");
        btn31.setKey("V1001_HELLO_WORLD");

        ClickButton btn32 = new ClickButton();
        btn32.setName("赞一下我们");
        btn32.setType("click");
        btn32.setKey("V1001_GOOD");

        ComplexButton btn3 = new ComplexButton();
        btn3.setName("菜单");
        Button[] btnArr = {btn31,btn32};
        btn3.setSub_button(Arrays.asList(btnArr));

        Menu menu = new Menu();
        Button[] buttons = {btn1,btn2,btn3};
        menu.setButton(Arrays.asList(buttons));

        return menu;
    }
}
