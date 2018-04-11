package com.ddcs.rest;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ddcs.domain.User;
import com.ddcs.service.UserService;
import com.ddcs.utill.ServletUtil;
import com.ddcs.utill.StringUtil;
import com.ddcs.utill.ValidatorUtil;





@Controller
public class LoginAndRegister {
	@Autowired
	private UserService userService;
	String confirmcode="";
	/**
	 * 用户登入
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response){
       Map<String,Object> map =new HashMap<String,Object>();
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        User user =new User(userName,password);
        if(userService.isHasCount(user)==1){
            request.getSession().setAttribute("user",user);
            request.getSession().setAttribute("username",user.getUsername());
            map.put("result","1");
        }else{
            map.put("result","0");
        }
        return map;
    }
	@RequestMapping(value = "/GetCode",method = RequestMethod.POST)
	   @ResponseBody
    public String GetCode(HttpServletRequest request, HttpServletResponse response){
	
        String phone=request.getParameter("phone");
        
        confirmcode="666";
       
        
       return "验证码发送成功，请注意接收短信。";
       
    }
	 /**
     * 用户注册(手机注册)
     * @param request
     * @param response
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public void addphone(HttpServletRequest request , HttpServletResponse response){
        JSONObject result=new JSONObject();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String code = request.getParameter("code");
        String repassword = request.getParameter("recode");
        String readme = request.getParameter("readme");
        if(StringUtil.isNull(userName)){
            result.put("message","用户名不能为空!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
       if(!StringUtil.isNull(userName))
        {
        	if(!ValidatorUtil.isMobile(userName))
        	{
        		 result.put("message","请输入正确的手机号!");
                 result.put("flag",false);
                 ServletUtil.createSuccessResponse(200, result, response);
                 return;
        	}
        	
        }
        if(StringUtil.isNull(password)){
            result.put("message","密码不能为空!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        if(StringUtil.isNull(code)){
            result.put("message","验证码不能为空!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        if(!StringUtil.isNull(code)){
           if(!code.equals(confirmcode)) {
	  result.put("message","验证码不正确!");
      result.put("flag",false);
      ServletUtil.createSuccessResponse(200, result, response);
      return;
                    }

        }
        
        if(!password.equals(repassword)){
            result.put("message","密码不一致!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        if(!"true".equals(readme)){
            result.put("message","注册必须接受服务条款！");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        User user = new User(userName,password);
     
        int index = 0;
       try {
        index=userService.insert(user);}
       catch (Exception e) {
    	   result.put("message","此用户已被注册!");
           result.put("flag",false);
           ServletUtil.createSuccessResponse(200, result, response);
           return;
	}
        if(index>0){
            result.put("message","恭喜注册成功!去登入？");
            result.put("flag",true);
            confirmcode="";
            
        }else{
            result.put("message","服务器迷路啦!");
            result.put("flag",false);
        }
        ServletUtil.createSuccessResponse(200, result, response);
    }
   
    /**
     * 用户注册(邮箱注册)
     * @param request
     * @param response
     */
    @RequestMapping(value = "/addyx",method = RequestMethod.POST)
    @ResponseBody
    public void addEmial(HttpServletRequest request , HttpServletResponse response){
        JSONObject result=new JSONObject();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String readme = request.getParameter("readme");
        if(StringUtil.isNull(userName)){
            result.put("message","用户名不能为空!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
       if(!StringUtil.isNull(userName))
        {
        	if(!ValidatorUtil.isEmail(userName))
        	{
        		 result.put("message","请输入正确的邮箱!");
                 result.put("flag",false);
                 ServletUtil.createSuccessResponse(200, result, response);
                 return;
        	}
        	
        }
        if(StringUtil.isNull(password)){
            result.put("message","密码不能为空!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        
        
        if(!password.equals(repassword)){
            result.put("message","密码不一致!");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        if(!"true".equals(readme)){
            result.put("message","注册必须接受服务条款！");
            result.put("flag",false);
            ServletUtil.createSuccessResponse(200, result, response);
            return;
        }
        User user = new User(userName,password);
     
        int index = 0;
       try {
        index=userService.insert(user);}
       catch (Exception e) {
    	   result.put("message","此用户已被注册!");
           result.put("flag",false);
           ServletUtil.createSuccessResponse(200, result, response);
           return;
	}
        if(index>0){
            result.put("message","恭喜注册成功!去登入？");
            result.put("flag",true);
            confirmcode="";
            
        }else{
            result.put("message","服务器迷路啦!");
            result.put("flag",false);
        }
        ServletUtil.createSuccessResponse(200, result, response);
    }    
	
}
