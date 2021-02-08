package com.platform.idleplatform.address.dao;

import com.platform.idleplatform.address.entity.AddressInfo;
import com.platform.idleplatform.address.entity.DictionariesInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {
    public int addAddress(AddressInfo addressInfo);

    /**
     * 省市区下拉查询
     *
     * @param id
     * @return
     */
    List<DictionariesInfo> listArea(String id);

    List<AddressInfo> userAddress(String userId);
}
