package com.ddcs.service;

import com.ddcs.domain.User;

public interface UserService {
	  int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
	    int isHasCount(User record);
}
