package com.zhou.spring.demo;

import com.zhou.spring.demo.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname TestA
 * @Description
 * @Date 2022/3/6 20:51
 * @Created by zhou
 */
public class TestA {

	@Test
	public void test(){
//		System.out.println("1");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zhou/spring/demo/applicationContrext.xml");
		System.out.println((Student)context.getBean("test"));
	}

}
