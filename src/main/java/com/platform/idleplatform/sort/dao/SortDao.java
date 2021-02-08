package com.platform.idleplatform.sort.dao;

import com.platform.idleplatform.sort.entity.SortInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SortDao {
    public List<SortInfo> getFirstSort();

    public List<SortInfo> getSecondSort(String sortId);
}
