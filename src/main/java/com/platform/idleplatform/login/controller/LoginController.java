package com.platform.idleplatform.login.controller;

import com.platform.idleplatform.annotation.IgnoreAuth;
import com.platform.idleplatform.exceptionConfig.BaseException;
import com.platform.idleplatform.login.entity.LoginInfo;
import com.platform.idleplatform.login.service.LoginService;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.user.AppUser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("auth")
public class LoginController extends AppUser {
    @Resource
    private LoginService loginService;

    @IgnoreAuth
    @RequestMapping("form")
    private AppResponse login(LoginInfo loginInfo) throws BaseException{
//        throw new BaseException("aaa");
        return loginService.login(loginInfo);
    }
}
