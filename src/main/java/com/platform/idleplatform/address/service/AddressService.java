package com.platform.idleplatform.address.service;

import com.platform.idleplatform.address.dao.AddressDao;
import com.platform.idleplatform.address.entity.AddressInfo;
import com.platform.idleplatform.address.entity.DictionariesInfo;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressService {
    @Resource
    AddressDao addressDao;

    public AppResponse addAddress(AddressInfo addressInfo) {
        addressInfo.setAddressId(StringUtil.getCommonCode(2));
        addressDao.addAddress(addressInfo);
        return AppResponse.success("新增成功");
    }

    /**
     * 省市区下拉查询
     *
     * @return
     */
    public AppResponse listArea(String id) {
        List<DictionariesInfo> provinceList = addressDao.listArea(id);
        return AppResponse.success("查询成功", provinceList);
    }

    public AppResponse userAddress(String userId) {
        List<AddressInfo> addressInfos = addressDao.userAddress(userId);
        return AppResponse.success("查询成功", addressInfos);
    }
}
