package org.pmhelper.wechat.interfaces.controller;

import org.pmhelper.wechat.interfaces.service.CoreService;
import org.pmhelper.wechat.interfaces.utils.SignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信公众号认证
 */
@RestController
public class MainController {

    @Autowired
    private CoreService coreService;
    /**
     *
     * @param signature  微信加密签名
     * @param timestamp  时间戳
     * @param nonce      随机数
     * @param echostr    随机字符串
     */
    @GetMapping("/auth")
    public Object auth(@RequestParam String signature,
                       @RequestParam String timestamp,
                       @RequestParam String nonce,
                       @RequestParam String echostr){
        // 校验
        if(SignUtil.checkSignature(signature,timestamp,nonce)){
            return echostr;
        }else {
            return null;
        }
    }

    @PostMapping("/auth")
    public Object auth(@RequestParam String signature,
                       @RequestParam String timestamp,
                       @RequestParam String nonce,
                       HttpServletRequest request){
        //校验请求
        if(SignUtil.checkSignature(signature,timestamp,nonce)){
            //处理消息
            String respXml = coreService.processRequest(request);
            return respXml;
        }
        return null;
    }

}
