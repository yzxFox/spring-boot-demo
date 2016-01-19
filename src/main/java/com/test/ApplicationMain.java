package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;  
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
  
@Configuration//配置控制  
@EnableAutoConfiguration//启用自动配置  
@ComponentScan//组件扫描  
public class ApplicationMain {  

	  
    public static void main(String[] args) throws Exception {  
        //启动Spring Boot项目的唯一入口  
        SpringApplication.run(ApplicationMain.class, args);  
  
    }  
  
}  