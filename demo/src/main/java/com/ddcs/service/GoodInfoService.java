package com.ddcs.service;

import java.util.Map;

import com.ddcs.domain.GoodInfo;
import com.ddcs.domain.Img;

public interface GoodInfoService {
	  int deleteByPrimaryKey(Integer id);

	    int insert(GoodInfo record);

	    int insertSelective(GoodInfo record);

	    GoodInfo selectByPrimaryKey(Integer id) throws Exception;

	    int updateByPrimaryKeySelective(GoodInfo record);

	    int updateByPrimaryKey(GoodInfo record);
	    
	  
}
