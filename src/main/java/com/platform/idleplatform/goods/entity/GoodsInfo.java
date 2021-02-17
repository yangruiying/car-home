package com.platform.idleplatform.goods.entity;

import lombok.Data;

import java.util.List;

@Data
public class GoodsInfo {
    private String goodsId;
    private String title;
    private String intro;
    private float price;
    private float iniPrice;
    private float shipping;
    public List<String> url;
    private String indexPath;
    private String sortId;
    private String userId;
    private String imagePath;
    private String userName;
    private String firstSort;
    private String secondSort;
    private String own;
    private String message;
    private String lId;
    private String parentId;
    private List<GoodsInfo> recoverList;
    private String recoverName;
    private String cityName;
    private String firstSortName;
    private String secondSortName;
    private String updateTime;
    private int state;
    /**
     * 第几页
     */
    private int pageNum;
    /**
     * 每页显示条数
     */
    private int pageSize;

    private String carIcon;

}
