package com.xk.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 书
 * @date 2021/5/9 - 17:08
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
