package com.zhou.spring.demo;

import com.zhou.spring.demo.config.MyTestConfig;
import com.zhou.spring.demo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Classname TestApplication
 * @Description
 * @Date 2022/3/6 21:04
 * @Created by zhou
 */
@ComponentScan(basePackages = "com.zhou")
public class TestApplication {

	/**
	 * BeanFactoryProcessor 在Bean对象实例化之前 修改Bean的定义属性
	 * 			org.springframework.context.support.AbstractApplicationContext#invokeBeanFactoryPostProcessors
	 * BeanPostProcessor（InitializingBean、init-Method）	在Bean实例化之后执行，修改其属性
	 * 			org.springframework.context.support.AbstractApplicationContext#finishBeanFactoryInitialization
	 *
	 * MyBeanFactoryProcessor noConstructor
	 *  MyBeanFactoryProcessor 修改
	 * MyBeanPostProcessor noConstructor
	 * Student class noConstructor
	 * MyBeanPostProcessor Before
	 * Student class afterPropertiesSet
	 * Student initMehtod  init-Mehthod
	 * MyBeanPostProcessor After
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContrext.xml");
//		ApplicationContext context = new AnnotationConfigApplicationContext("com.zhou.spring");
		Student student = (Student) context.getBean("test");
		student.testA();
	}


}
