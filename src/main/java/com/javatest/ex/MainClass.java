package com.javatest.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		// 컨테이너 설정
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		// 컨테이너 사용
		Student student = ctx.getBean("student",Student.class);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		try {
			student.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 컨테이너 종료(빈도 같이 종료)
		ctx.close();
	}

}
