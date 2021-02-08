package com.platform.idleplatform.address.controller;

import com.platform.idleplatform.address.entity.AddressInfo;
import com.platform.idleplatform.address.service.AddressService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {
    @Resource
    AddressService addressService;

    @PostMapping("/addAddress")
    public AppResponse addAddress(AddressInfo addressInfo) {
        return addressService.addAddress(addressInfo);
    }

    /**
     * 省市区下拉查询
     *
     * @return
     */
    @RequestMapping(value = "listArea")
    public AppResponse listArea(String id) {
        try {
            return addressService.listArea(id);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }

    @RequestMapping("userAddress")
    public AppResponse userAddress(String userId) {
        return addressService.userAddress(userId);
    }
}
