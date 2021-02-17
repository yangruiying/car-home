package com.platform.idleplatform.sort.controller;

import com.platform.idleplatform.sort.dao.SortDao;
import com.platform.idleplatform.sort.entity.SortInfo;
import com.platform.idleplatform.sort.service.SortService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sort")
@CrossOrigin
public class SortController {
    @Resource
    public SortService sortService;

    @Resource
    public SortDao sortDao;
    @RequestMapping("getFirstSort")
    public AppResponse getFirstSort() {
        return sortService.getFirstSort();
    }

    @RequestMapping("getSecondSort")
    public AppResponse getSecondSort(SortInfo sortInfo) {
        return sortService.getSecondSort(sortInfo);
    }

    @RequestMapping("getCarSort")
    public AppResponse getCarSort(String sortId){
        List<SortInfo> carSort = sortDao.getCarSort(sortId);
        return AppResponse.success("查询成功",carSort);
    }

    @RequestMapping("getTopCar")
    public AppResponse getTopCar(){
        List<SortInfo> carSort = sortDao.getTopCar();
        return AppResponse.success("查询成功",carSort);
    }

    @RequestMapping("searchCar")
    public AppResponse searchCar(SortInfo sortInfo){
        List<SortInfo> carSort = sortDao.searchCar(sortInfo);
        return AppResponse.success("查询成功",carSort);
    }



}
