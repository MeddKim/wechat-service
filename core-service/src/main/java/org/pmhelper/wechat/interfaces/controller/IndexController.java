package org.pmhelper.wechat.interfaces.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public Object index(){
        return "wechat-service";
    }
}
