package com.zhou.spring.demo.entity;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Classname Student
 * @Description
 * @Date 2022/3/6 20:53
 * @author zhou
 */
public class Student implements InitializingBean {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student class afterPropertiesSet");
	}

	public Student() {
		System.out.println("Student class noConstructor");
	}

	public void initMethod(){
		System.out.println("Student initMehtod");
		this.name = "赵六";
	}

	public void testA(){
		System.out.println("Student testA");
	}

}
