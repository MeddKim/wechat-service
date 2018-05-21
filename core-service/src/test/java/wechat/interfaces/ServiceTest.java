package wechat.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pmhelper.core.domain.entity.Token;
import org.pmhelper.core.domain.entity.menu.*;
import org.pmhelper.wechat.interfaces.WechatServerApplication;
import org.pmhelper.wechat.interfaces.service.CoreService;
import org.pmhelper.wechat.interfaces.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WechatServerApplication.class)
//@Import(WechatServerApplication.class)
public class ServiceTest {
    @Autowired
    private CoreService coreService;
    @Autowired
    private MenuService menuService;

    @Test
    public void get(){
        Token token = coreService.getToken();
        System.out.println(token);
    }

    @Test
    public void addMenu(){
        Menu menu = createMenu();
        Token appToken = coreService.getToken();
        menuService.createMenu(menu,appToken.getAccessToken());
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
