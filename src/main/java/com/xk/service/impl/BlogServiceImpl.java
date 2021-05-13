package com.xk.service.impl;

import com.xk.pojo.Blog;
import com.xk.mapper.BlogMapper;
import com.xk.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xkstart
 * @since 2021-05-09
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
