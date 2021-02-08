package com.platform.idleplatform.test.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    public int getNum();
}
