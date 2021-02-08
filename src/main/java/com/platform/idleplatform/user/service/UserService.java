package com.platform.idleplatform.user.service;

import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.StringUtil;
import com.platform.idleplatform.user.dao.UserDao;
import com.platform.idleplatform.user.entity.FansInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.platform.idleplatform.page.PageUtils.getPageInfo;

@Service
public class UserService {
    @Resource
    public UserDao userDao;

    public AppResponse getUserInfo(String userId) {
        UserInfo loginInfo = userDao.getUserInfo(userId);
        return AppResponse.success("查询成功", loginInfo);
    }

    public AppResponse addFans(FansInfo fansInfo) {
        userDao.addFans(fansInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse isFans(FansInfo fansInfo) {
        int a = userDao.isFans(fansInfo);
        return AppResponse.success("查询成功", a);
    }

    public AppResponse cancelFans(FansInfo fansInfo) {
        userDao.cancelFans(fansInfo);
        return AppResponse.success("更新成功");
    }

    public AppResponse getFansNum(String userId) {
        int n = userDao.getFansNum(userId);
        return AppResponse.success("查询成功", n);
    }

    public AppResponse getAttenNum(String userId) {
        int n = userDao.getAttenNum(userId);
        return AppResponse.success("查询成功", n);
    }

    /**
     * 获取用户粉丝
     *
     * @return
     */
    public AppResponse getFans() {
        List<UserInfo> userInfos = userDao.getFans();
        return AppResponse.success("查询成功", userInfos);
    }

    public AppResponse addUser(UserInfo userInfo) {
        userInfo.setUserId(StringUtil.getCommonCode(2));
        userDao.addUser(userInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse getUserByPage() {
        List<UserInfo> userInfos = userDao.getUserByPage();
        return AppResponse.success("查询成功", getPageInfo(userInfos));
    }

    public AppResponse getFansList(String userId) {
        List<UserInfo> userInfos = userDao.getFansList(userId);
        return AppResponse.success("查询成功", userInfos);
    }

    public AppResponse getAttenList(String userId) {
        List<UserInfo> userInfos = userDao.getAttenList(userId);
        return AppResponse.success("查询成功", userInfos);
    }

    public AppResponse updateUser(UserInfo userInfo) {
        userDao.updateUser(userInfo);
        return AppResponse.success("更新成功");
    }

    public AppResponse delUser(String userId) {
        userDao.delUser(userId);
        return AppResponse.success("删除成功");
    }
}
