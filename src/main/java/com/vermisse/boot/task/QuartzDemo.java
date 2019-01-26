package com.vermisse.boot.task;

import java.text.*;
import java.util.*;

import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

@Component
public class QuartzDemo {

	@Scheduled(cron = "0/10 * * * * ?")
	public void current() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println("定时器执行：" + sdf.format(new Date()));
	}
}