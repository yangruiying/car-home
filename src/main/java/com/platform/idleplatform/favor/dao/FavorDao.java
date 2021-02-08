package com.platform.idleplatform.favor.dao;

import com.platform.idleplatform.favor.entity.FavorInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavorDao {
    public int addFavor(FavorInfo favorInfo);

    public int delFavor(FavorInfo favorInfo);

    public int isFavor(FavorInfo favorInfo);
}
