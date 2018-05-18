package org.pmhelper.wechat.interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "org.pmhelper.wechat.interfaces"
        }
)
public class WechatServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WechatServerApplication.class,args);
    }
}
