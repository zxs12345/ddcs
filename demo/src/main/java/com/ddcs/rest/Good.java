package com.ddcs.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ddcs.domain.GoodInfo;
import com.ddcs.service.GoodInfoService;

@Controller
public class Good {
	@Autowired
	private GoodInfoService  goodInfoService;
	
	@RequestMapping(value="/getgood")
    public ModelAndView Getgood(@RequestParam int id) throws Exception {
		 ModelAndView modelAndView = new ModelAndView("/introduction");
		    GoodInfo goodinfo = goodInfoService.selectByPrimaryKey(id);
		    List<String> couponlist = ToList(goodinfo.getCoupon().split("，"));
		    List<String> flavorlist = ToList(goodinfo.getFlavor().split("，"));
		    List<String> packinglist = ToList(goodinfo.getPacking().split("，"));
		    List<String> detailimglist = ToList(goodinfo.getDetailimg().split("，"));
	        modelAndView.addObject("info", goodinfo);
	        modelAndView.addObject("couponlist", couponlist);
	        modelAndView.addObject("flavorlist", flavorlist);
	        modelAndView.addObject("packinglist", packinglist);
	        modelAndView.addObject("detailimglist", detailimglist);
	        return modelAndView;
	
	}
	
	@RequestMapping(value="/te")
    public ModelAndView test(@RequestParam int id) throws Exception {
		 ModelAndView modelAndView = new ModelAndView("/test");
		    GoodInfo goodinfo = goodInfoService.selectByPrimaryKey(id);
	        modelAndView.addObject("info", goodinfo);
	        List<String> couponlist = ToList(goodinfo.getCoupon().split("，"));
	      
	        modelAndView.addObject("couponlist", couponlist);
	        List<String> list=new ArrayList();
	        list.add("ad"); list.add("ad"); list.add("ad");
	        modelAndView.addObject("list", list);
	        return modelAndView;
	
	}
	/*	<li>Map循环：  
    <div th:each="mapS:${map}">  
    <div th:text="${mapS}"></div>  
    </div>  
</li>  
<li>数组循环：  
    <div th:each="arrayS:${arrays}">  
    <div th:text="${arrayS}"></div>  
    </div>  
</li>*/

	private List<String> ToList(String[] str) {
		List<String> list=new ArrayList();
		System.out.println(str.toString());
		for (String string : str) {
			list.add(string);
		}
		return list;
	} 

}

