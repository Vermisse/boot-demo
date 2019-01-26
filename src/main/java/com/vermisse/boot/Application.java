package com.vermisse.boot;

import org.mybatis.spring.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.*;

// 开启控件扫描，无须指定包
@ComponentScan
// 开启自动配置
@EnableAutoConfiguration
// 开启定时器
@EnableScheduling
//扫描Dao接口所在包，如果有多个用逗号隔开
@MapperScan("com.vermisse.boot.dao")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}