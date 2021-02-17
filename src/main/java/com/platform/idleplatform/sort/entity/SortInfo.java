package com.platform.idleplatform.sort.entity;

import lombok.Data;

import java.util.List;

@Data
public class SortInfo {
    public String sortId;
    public String name;
    public String parentId;
    private String firstChar;
    public List<GoodsListInfo> goodsList;
    public List <SortInfo> firstSortList;
    public String carIcon;
    public String carSort;
    public String status;
    private String isTop;
    private Double minPrice;
    private Double maxPrice;
    private Integer orderType;
}
