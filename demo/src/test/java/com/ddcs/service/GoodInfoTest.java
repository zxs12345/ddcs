package com.ddcs.service;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodInfoTest {
	@Autowired
	GoodInfoService gService;
	@Test
	public void name() throws Exception {
		//Map<String, List<?>> goodInfo = gService.selectByPrimaryKey(1);
	//System.out.println(goodInfo.get("packinglist").get(0));
		
	}

}
