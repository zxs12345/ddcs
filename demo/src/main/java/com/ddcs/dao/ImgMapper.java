package com.ddcs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ddcs.domain.Img;
@Mapper
public interface ImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}