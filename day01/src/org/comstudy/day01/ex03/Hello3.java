package org.comstudy.day01.ex03;

import java.util.Scanner;

/*
 실습
 제어문, for문
 번호, 성명, 이메일 , 나이
 Person 클래스를 만들고 객체를 선언해서 객체에 입력받기.
 */

// 하나의 파일에 여러 클래스를 선언 가능하다.

class Person {
	int id;
	String name;
	String email;
	int age;
	Person p; //자기참조
}

public class Hello3 {
	static Person person = new Person();
	// NullpointException
	// static Person person; == static Person person = Null; 참조하고 있는 게 없어
	// 참조 변수에 객체를 참조시켜야 데이터를 입력받을 수 있다.
	// 스택이라는 공간 / 힙 공간
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("번호 입력: ");
		person.id = scan.nextInt();
		System.out.print("이름 입력: ");
		person.name = scan.next();
		System.out.print("이메일 입력: ");
		person.email = scan.next();
		System.out.print("나이 입력: ");
		person.id = scan.nextInt();
		
		System.out.printf("%d, %s, %s, %d", person.id, person.name, person.email, person.age);
//		System.out.println("번호 = " + person.id);
//		System.out.println("이름 = " + person.name);
//		System.out.println("이메일 = " + person.email);
//		System.out.println("나이 = " + person.age);
		
	}
}
