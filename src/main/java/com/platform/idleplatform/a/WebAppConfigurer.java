package com.platform.idleplatform.a;


import com.platform.idleplatform.page.PageInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //註冊TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new PageInterceptor());
        registration.addPathPatterns("/**");                    //所有路径都被拦截
        registration.excludePathPatterns("/", "/error", "/static/**");       //添加不拦截路径

    }
}