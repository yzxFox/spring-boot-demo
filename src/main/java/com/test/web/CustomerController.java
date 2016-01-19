package com.test.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dao.SysUserMapper;
import com.test.domain.SysUser;
import com.test.service.ITestService;



@Controller
public class CustomerController {
	private static Logger log = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	private ITestService testService;
	
	@RequestMapping("/hello")  
	public String hello(Map<String, Object> model){  
		List<String> l = new ArrayList<String>();
	    l.add("哈喽，hadoop");  
	    l.add("哈喽，hbase");  
	    l.add("哈喽，hive");  
	    l.add("哈喽，pig");  
	    l.add("哈喽，zookeeper");  
	    l.add("哈喽，三劫散仙");  
	    l.add("哈喽，2222"); 
	    //将数据存放map里面，可以直接在velocity页面，使用key访问  
	    model.put("data",l);  
	    log.info("l---------"+l.toString());
	    return "hello";  
	}  
	
	@RequestMapping("/sql")  
	public String sql(Map<String, Object> model){  
		List<SysUser> l=testService.getSomeThing();
		
	    //将数据存放map里面，可以直接在velocity页面，使用key访问  
		List<String> l2= new ArrayList<String>();
		for(SysUser u:l)
		{
			l2.add(u.getUsername());
			log.info(u.getUsername());
		}
	    model.put("data",l);  
	    log.info("l---------"+l.size());
	    return "sql";  
	}  

}
