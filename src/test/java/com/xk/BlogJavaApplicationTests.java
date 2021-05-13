package com.xk;

import cn.hutool.crypto.SecureUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogJavaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        System.out.println(SecureUtil.md5("123456"));
    }
}
