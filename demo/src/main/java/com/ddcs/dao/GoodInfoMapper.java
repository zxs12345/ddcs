package com.ddcs.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ddcs.domain.GoodInfo;
@Mapper
public interface GoodInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodInfo record);

    int insertSelective(GoodInfo record);

    GoodInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodInfo record);

    int updateByPrimaryKey(GoodInfo record);
}