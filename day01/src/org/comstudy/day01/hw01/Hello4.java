package org.comstudy.day01.hw01;

import java.util.Scanner;

/* 과제
5명의 데이터를 반복해서 받아서 출력하기
*/

class Person {
	int id;
	String name;
	String email;
	int age;
}


// 배열도 일종의 객체기 때문에
public class Hello4 {
	static Person[] person = null;
	static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		person = new Person[5];
		
		for(int i=0; i<5; i++) {
			person[i] = new Person();
			System.out.print("person" + (i+1) +"의 번호 입력: ");
			person[i].id = scan.nextInt();
			System.out.print("person" + (i+1) +"의 이름 입력: ");
			person[i].name = scan.next();
			System.out.print("person" + (i+1) +"의 이메일 입력: ");
			person[i].email = scan.next();
			System.out.print("person" + (i+1) +"의 나이 입력: ");
			person[i].id = scan.nextInt();
			System.out.println();
			
		}
		for(int i=0; i<5; i++) {
		System.out.printf("person" + (i+1) + " = %d, %s, %s, %d \n", person[i].id, person[i].name, person[i].email, person[i].age);
		}
	}
}
