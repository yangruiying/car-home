package com.platform.idleplatform.user.dao;

import com.platform.idleplatform.user.entity.FansInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 获取用户信息
     *
     * @param userId
     * @return
     */
    UserInfo getUserInfo(String userId);

    int addFans(FansInfo fansInfo);

    int isFans(FansInfo fansInfo);

    int cancelFans(FansInfo fansInfo);

    int getFansNum(String userId);

    int getAttenNum(String userId);

    List<UserInfo> getFans();

    int addUser(UserInfo userInfo);

    List<UserInfo> getUserByPage();

    List<UserInfo> getFansList(String userId);

    List<UserInfo> getAttenList(String userId);

    int updateUser(UserInfo userInfo);

    int delUser(String userId);

}
