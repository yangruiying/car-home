package com.platform.idleplatform.config;

import com.platform.idleplatform.annotation.IgnoreAuth;
import com.platform.idleplatform.user.entity.UserInfo;
import com.platform.idleplatform.util.SerializeUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Resource
    private RedisTemplate redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截成功");
        if (!(handler instanceof HandlerMethod)) {
            return false;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        IgnoreAuth ignoreAuth = handlerMethod.getMethod().getAnnotation(IgnoreAuth.class);
        if (ignoreAuth != null){
            return true;
        }
        String token = request.getHeader("token");
        byte[] bytes =(byte[])redisTemplate.opsForValue().get(token);
        System.out.println(bytes);
        if (bytes == null)
        {
            return false;
        }
        return true;
    }


}
