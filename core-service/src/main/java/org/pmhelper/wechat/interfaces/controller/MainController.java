package org.pmhelper.wechat.interfaces.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
        log.info("微信认证");
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
        log.info("微信请求到达！");
        //校验请求
        if(SignUtil.checkSignature(signature,timestamp,nonce)){

            //处理消息
            String respXml = coreService.processRequest(request);
            return respXml;
        }
        log.warn("请求认证未通过");
        return null;
    }

}
