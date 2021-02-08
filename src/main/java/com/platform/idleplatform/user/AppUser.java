package com.platform.idleplatform.user;

import com.platform.idleplatform.user.entity.UserInfo;
import com.platform.idleplatform.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class AppUser {
    @Resource
    private RedisTemplate redisTemplate;

    @Autowired
    public HttpServletRequest httpServletRequest;

    public UserInfo getAppUser(){
        String token = httpServletRequest.getHeader("token");
        byte[] bytes = (byte[]) redisTemplate.opsForValue().get(token);
        UserInfo userInfo = (UserInfo) SerializeUtil.deserialize(bytes);
        return userInfo;
    }

}
