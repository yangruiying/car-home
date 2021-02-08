package com.platform.idleplatform.collection.dao;

import com.platform.idleplatform.collection.entity.CollectionInfo;
import com.platform.idleplatform.favor.entity.FavorInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectionDao {
    public int addCollection(CollectionInfo collectionInfo);

    public int delCollection(CollectionInfo collectionInfo);

    public int isCollection(CollectionInfo collectionInfo);
}
