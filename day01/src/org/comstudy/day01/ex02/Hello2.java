package org.comstudy.day01.ex02;

import java.util.Scanner;

// id, 성명, 이메일 , 나이
public class Hello2 {
	static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String id = "";
		String name = "";
		String email = "";
		Integer age = 0;
		
		System.out.println("아이디 입력: ");
		id = scan.next();
		
		System.out.println("이름 입력: ");
		name = scan.next();
		
		System.out.println("이메일 입력: ");
		email = scan.next();
		
		System.out.println("나이 입력: ");
		age = scan.nextInt();
		
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println("나이: " + age);
	}

}
