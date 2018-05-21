package org.pmhelper.core.domain.entity;

import lombok.Data;

@Data
public class Token {
    // 接口访问凭证
    private String accessToken;
    // 凭证有效期，单位：秒
    private int expiresIn;
}
