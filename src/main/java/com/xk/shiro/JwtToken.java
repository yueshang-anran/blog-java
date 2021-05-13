package com.xk.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author 书
 * @date 2021/5/9 - 17:05
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}
