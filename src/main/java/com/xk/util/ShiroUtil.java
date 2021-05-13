package com.xk.util;

import com.xk.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author 书
 * @date 2021/5/11 - 19:56
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
