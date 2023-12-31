package org.comstudy.day01.ex01;

import java.util.Scanner;

/*
 클래스의 멤버에는 필드와 메서드가 있다.
 멤버에는 static과 static을 안 붙이는 것이 있다.
	- static 정적? 객체 없이 사용하겠다
	- static 붙어있는 거 클래스 만들자마자 실행된다.
Final(상수)
	- 값을 바꾸지 않겠다.
	- 어디 앞에 붙이냐에 따라 조금씩 의미는 달라
	- 클래스->상속이 안되게 / 메서드->override 안되게
	
 클래스 왜 만들어?
	 - 객체를 만들기 위해서
 main은 객체 없어 어떻게 돌아가?
 	- static 붙였기 때문에
*/

public class Hello {
	// (클래스의) 멤버 필드 변수(전역 변수)
	// 변수 선언 시 데이터 타입 표시해야 함
	static final Scanner scan = new Scanner(System.in);
	static final Scanner scanline = new Scanner(System.in);
	static String name = "홍길동";
	
	// 멤버 메서드
	public static void main(String[] args) {
		// (메서드의) 로컬 변수(지역 변수) - 초기화 필수
		String address = "서울시 중구";
		Integer age = 25;
		
		// 이름, 주소, 나이 입력 받기
		System.out.println("성명입력: "); 
		name = scan.next();
	
		System.out.println("주소 입력: ");
		address = scanline.nextLine(); //enter있으면 데이터 입력되었다고 생각
		// 1. 버퍼를 비워주고 다시 입력받기
		// 2. 새로운 변수
		
		System.out.println("나이 입력: ");
		age = scan.nextInt();
		
		System.out.println("Hello world");
		System.out.println("성명: " + name);
		System.out.println("주소: " + address);
		System.out.println("나이: " + age);

	}

}
