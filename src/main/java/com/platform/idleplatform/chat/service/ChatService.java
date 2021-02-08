package com.platform.idleplatform.chat.service;

import com.platform.idleplatform.chat.dao.ChatDao;
import com.platform.idleplatform.chat.entity.ChatInfo;
import com.platform.idleplatform.chat.entity.ChatList;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChatService {
    @Resource
    ChatDao chatDao;

    public AppResponse addChat(ChatInfo chatInfo) {
        chatDao.addChat(chatInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse chatList(String userId) {
        List<ChatList> chatList = chatDao.chatList(userId);
        return AppResponse.success("查询成功", chatList);
    }

    public AppResponse chatRecard(ChatInfo chatInfo) {
        List<ChatInfo> chatInfos = chatDao.chatRecard(chatInfo);
        return AppResponse.success("查询成功", chatInfos);
    }

    public AppResponse getNewMsg(ChatInfo chatInfo) {
        ChatInfo chatInfos = chatDao.getNewMsg(chatInfo);
        return AppResponse.success("查询成功", chatInfos);
    }

    public AppResponse setRead(ChatInfo chatInfo) {
        int n = chatDao.setRead(chatInfo);
        return AppResponse.success("更新成功", n);
    }

    public AppResponse noReadCount(String userId) {
        int n = chatDao.noReadCount(userId);
        return AppResponse.success("查询成功", n);
    }
}
