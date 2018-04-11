package com.ddcs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ddcs.domain.User;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    int isHasCount(User record);
}