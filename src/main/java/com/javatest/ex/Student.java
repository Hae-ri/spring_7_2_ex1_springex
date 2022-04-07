package com.javatest.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public void destroy() throws Exception {
		// 소멸 과정(소멸 직전)에서 생성
		System.out.println("destroy 메소드 호출");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// 초기화 과정(호출된 직후)에서 생성
		System.out.println("afterPropertiesSet 메소드 호출");
	}

}
