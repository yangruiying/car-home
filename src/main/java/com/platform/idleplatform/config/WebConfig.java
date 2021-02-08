package com.platform.idleplatform.config;//package com.platform.idleplatform.config;


import com.platform.idleplatform.page.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public HandlerInterceptor getTokenInterceptor(){
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(getTokenInterceptor());
        registration.addPathPatterns("/**").excludePathPatterns("/**/**.png");
        System.out.println("===========   拦截器注册完毕   ===========");
    }

}
