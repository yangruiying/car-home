package com.platform.idleplatform.chat.dao;

import com.platform.idleplatform.chat.entity.ChatInfo;
import com.platform.idleplatform.chat.entity.ChatList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatDao {
    public int addChat(ChatInfo chatInfo);

    public List<ChatList> chatList(String userId);

    public List<ChatInfo> chatRecard(ChatInfo chatInfo);

    public ChatInfo getNewMsg(ChatInfo chatInfo);

    public int setRead(ChatInfo chatInfo);

    public int noReadCount(String userId);
}
