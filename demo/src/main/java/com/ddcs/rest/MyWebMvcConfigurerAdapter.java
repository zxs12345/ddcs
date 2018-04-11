package com.ddcs.rest;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import java.util.List;
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
	 @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/toRegister").setViewName("register");
	        registry.addViewController("/toLogin").setViewName("login");
	        registry.addViewController("/test").setViewName("test");
	        registry.addViewController("/").setViewName("index");
	        
	        super.addViewControllers(registry);
	    }
	 /**
	 * 拦截器
	 * @param registry
	 */
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
	     // addPathPatterns 用于添加拦截规则
	     // excludePathPatterns 用户排除拦截
		 //.excludePathPatterns("/","/toLogin","/login","/toRegister","/add","/addyx","/GetCode","/tofood")
	     registry.addInterceptor(new MyInterceptor()).addPathPatterns("/sdfsd");
	     super.addInterceptors(registry);
	 }
	 /**
	     * 配置fastJson 
	     * @param converters
	     */
	   @Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		   FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
	        FastJsonConfig fastJsonConfig = new FastJsonConfig();
	        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	        fastConverter.setFastJsonConfig(fastJsonConfig);
	        converters.add(fastConverter);
		super.configureMessageConverters(converters);
	}
}
