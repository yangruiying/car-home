package com.platform.idleplatform.sort.dao;

import com.platform.idleplatform.sort.entity.SortInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SortDao {
    List<SortInfo> getFirstSort();

    List<SortInfo> getSecondSort(SortInfo sortInfo);

    List<SortInfo> getCarSort(String sortId);

    List<SortInfo> getTopCar();

    List<SortInfo> searchCar(SortInfo sortInfo);
}
