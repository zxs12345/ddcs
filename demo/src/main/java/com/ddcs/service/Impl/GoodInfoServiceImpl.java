package com.ddcs.service.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddcs.dao.GoodInfoMapper;
import com.ddcs.domain.GoodInfo;
import com.ddcs.domain.Img;
import com.ddcs.service.GoodInfoService;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Service
public class GoodInfoServiceImpl implements GoodInfoService{
	@Autowired
private GoodInfoMapper goodInfoMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(GoodInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(GoodInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GoodInfo selectByPrimaryKey(Integer id) {
		
		/*GoodInfo goodinfo = this.goodInfoMapper.selectByPrimaryKey(id);
		
		 List<?> detailimglist = ToList(goodinfo.getDetailimg().split(","));
		 List<?> flavorlist = ToList(goodinfo.getFlavor().split(","));
		 List<?> packinglist = ToList(goodinfo.getPacking().split(","));
		  List<?> couponlist = ToList(goodinfo.getCoupon().split(","));
		 List<Img> imgs = goodinfo.getImgs();
		// List<? extends Object> info = Arrays.asList(goodinfo.getName(),goodinfo.getDiscount(),goodinfo.getPromotionpice(),goodinfo.getOriginalprice(),goodinfo.getMonthlysales(),goodinfo.getTotalsales(),goodinfo.getTotalevaluate());
		 
	 
		 Map<String, Object> map = new HashMap<String, Object>();
		 // map.put("detailimglist", detailimglist);
		  map.put("info", goodinfo);
		  map.put("flavorlist", flavorlist);
		 map.put("packinglist", packinglist);
		 // map.put("couponlist", couponlist);
		 map.put("imgs", imgs);*/
		
		//return map;
		return  this.goodInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(GoodInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(GoodInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
