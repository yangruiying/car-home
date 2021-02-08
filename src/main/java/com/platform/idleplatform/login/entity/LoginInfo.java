package com.platform.idleplatform.login.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginInfo implements Serializable {
    private String userId;
    private String account;
    private String password;
    private String imagePath;
    private String userName;
    private String token;

}
