package org.pmhelper.wechat.interfaces.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.pmhelper.core.domain.entity.Token;
import org.pmhelper.core.domain.entity.resp.TextMessageResp;
import org.pmhelper.wechat.interfaces.service.CoreService;
import org.pmhelper.wechat.interfaces.utils.CommonUtil;
import org.pmhelper.wechat.interfaces.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class CoreServiceImpl implements CoreService {

    // 第三方用户唯一凭证
    private static String appId = "wx3d949a21fdc84689";
    // 第三方用户唯一凭证密钥
    private static String appSecret = "e670cb3e0bcc2d8ac333f1f404036639";

    //redis key
    private static String APPTOKEN_KEY = "tokenKey";

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String processRequest(HttpServletRequest request) {

        //xml格式的消息数据
        String respXml = null;
        //默认返回的消息文本
        String respContent = "未知消息类型！";
        try {
            Map<String,String> requestMap = MessageUtil.parseXml(request);
            //发送方账号
            String fromUserName = requestMap.get("FromUserName");
            //开发者微信号
            String toUserName = requestMap.get("ToUserName");
            //消息类型
            String msgType = requestMap.get("MsgType");

            log.info("消息类型是----"+msgType);

            //回复文本消息
            TextMessageResp textMessageResp = new TextMessageResp();
            textMessageResp.setToUserName(fromUserName);
            textMessageResp.setFromUserName(toUserName);
            textMessageResp.setCreateTime(new Date().getTime());
            textMessageResp.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

            // 文本消息
            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
                respContent = "您发送的是文本消息！";
            }
            // 图片消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
                respContent = "您发送的是图片消息！";
            }
            // 语音消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
                respContent = "您发送的是语音消息！";
            }
            // 视频消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
                respContent = "您发送的是视频消息！";
            }
            // 地理位置消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
                respContent = "您发送的是地理位置消息！";
            }
            // 链接消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
                respContent = "您发送的是链接消息！";
            }
            // 事件推送
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
                // 事件类型
                String eventType = requestMap.get("Event");
                // 关注
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
                    respContent = "谢谢您的关注！";
                }
                // 取消关注
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
                    // TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
                }
                // 扫描带参数二维码
                else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
                    // TODO 处理扫描带参数二维码事件
                }
                // 上报地理位置
                else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
                    // TODO 处理上报地理位置事件
                }
                // 自定义菜单
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
                    // 处理菜单点击事件
                    this.processClickMenu(requestMap.get("EventKey"));
                }
            }
            textMessageResp.setContent(respContent);
            log.info(respContent);
            respXml = MessageUtil.messageToXml(textMessageResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("返回给用户-------");
        log.info(respXml);
        log.info("返回给用户--------");
        return respXml;
    }

    @Override
    public Token getToken() {
        Token token = (Token) redisTemplate.opsForValue().get(APPTOKEN_KEY);
        if(null == token){
            token = CommonUtil.getToken(appId,appSecret);
            if(token != null){
                redisTemplate.opsForValue().set(APPTOKEN_KEY,token);
                redisTemplate.expire(APPTOKEN_KEY,7200, TimeUnit.SECONDS);
            }
        }
        return token;
    }

    /**
     * 按钮ID
     * @param EventKey
     * @return
     */
    private String processClickMenu(String EventKey){
        if(EventKey.equals("ZX00000_1")){
            //TODO 具体操作
        }
        return null;
    }
}
