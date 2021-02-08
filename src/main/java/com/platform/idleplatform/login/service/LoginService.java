package com.platform.idleplatform.login.service;

import com.auth0.jwt.interfaces.Claim;
import com.platform.idleplatform.login.dao.LoginDao;
import com.platform.idleplatform.login.entity.LoginInfo;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.user.dao.UserDao;
import com.platform.idleplatform.user.entity.UserInfo;
import com.platform.idleplatform.userInfomation.dao.UserInfomationDao;
import com.platform.idleplatform.util.JwtUtil;
import com.platform.idleplatform.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class LoginService {
    @Resource
    private LoginDao loginDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private UserDao userDao;

    public AppResponse login(LoginInfo loginInfo){
        LoginInfo login = loginDao.login(loginInfo);
        if (login != null) {
            try {
                String token = JwtUtil.createToken(login.getUserId(), login.getUserName());
                login.setToken(token);
                UserInfo userInfo = userDao.getUserInfo(login.getUserId());
                byte[] serizlize = SerializeUtil.serizlize(userInfo);
                UserInfo userInfo1 =(UserInfo)SerializeUtil.deserialize(serizlize);
                redisTemplate.opsForValue().set(token,serizlize);
            }catch (Exception e){
                e.printStackTrace();
            }

            return AppResponse.success("查询成功", login);
        }else {
            return AppResponse.bizError("用户名或密码错误");
        }
    }


}
