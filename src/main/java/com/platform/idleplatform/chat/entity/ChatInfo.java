package com.platform.idleplatform.chat.entity;

import javax.xml.crypto.Data;

public class ChatInfo {
    public String user1;
    public String user2;
    public String msg;
    public String goodsId;
    public Data chatTime;

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Data getChatTime() {
        return chatTime;
    }

    public void setChatTime(Data chatTime) {
        this.chatTime = chatTime;
    }
}
