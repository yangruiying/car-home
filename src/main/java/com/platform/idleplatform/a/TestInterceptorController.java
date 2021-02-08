package com.platform.idleplatform.a;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestInterceptorController {
    @GetMapping("/testinterceptor")
    public String testInterCep() {
        System.out.println("执行了TestInterceptorController的testInterCep方法");
        return "testinterceptor";

    }
}