package com.blog.cn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by zhangsisi on 2018/6/2.
 */
@RestController
public class BlogBatch {
	private static Logger logger = LoggerFactory.getLogger(BlogBatch.class);

	@RequestMapping("/test")
	public String test(){
		String test = "jklsdfghj";
		System.out.println("test------------"+test);
		return test;
	}
}
