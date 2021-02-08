package com.platform.idleplatform.user.controller;

import com.platform.idleplatform.annotation.IgnoreAuth;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.user.entity.FansInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import com.platform.idleplatform.user.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Resource
    public UserService userService;

    @IgnoreAuth
    @RequestMapping("getUserInfo")
    public AppResponse getUserInfo(String userId) {
        return userService.getUserInfo(userId);
    }

    @PostMapping("addFans")
    public AppResponse addFans(FansInfo fansInfo) {
        return userService.addFans(fansInfo);
    }

    @RequestMapping("isFans")
    public AppResponse isFans(FansInfo fansInfo) {
        return userService.isFans(fansInfo);
    }

    @PostMapping("cancelFans")
    public AppResponse cancelFans(FansInfo fansInfo) {
        return userService.cancelFans(fansInfo);
    }

    @RequestMapping("getFansNum")
    public AppResponse getFansNum(String userId) {
        return userService.getFansNum(userId);
    }

    @RequestMapping("getAttenNum")
    public AppResponse getAttenNum(String userId) {
        return userService.getAttenNum(userId);
    }

    @RequestMapping("getFans")
    public AppResponse getFans() {
        return userService.getFans();
    }

    @RequestMapping("addUser")
    public AppResponse addUser(UserInfo userInfo) {
        return userService.addUser(userInfo);
    }

    @RequestMapping("getUserByPage")
    public AppResponse getUserByPage() {
        return userService.getUserByPage();
    }

    @RequestMapping("getFansList")
    public AppResponse getFansList(String userId) {
        return userService.getFansList(userId);
    }

    @RequestMapping("getAttenList")
    public AppResponse getAttenList(String userId) {
        return userService.getAttenList(userId);
    }

    @RequestMapping("updateUser")
    public AppResponse updateUser(UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }

    @RequestMapping("delUser")
    public AppResponse delUser(String userId) {
        return userService.delUser(userId);
    }
}
