package org.pmhelper.core.domain.entity.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 链接消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LinkMessageReq extends BaseMessageReq{
    //消息标题
    private String Title;
    //消息描述
    private String Description;
    //消息链接
    private String Url;
}
