package org.comstudy.day01.ex02;

import java.util.Scanner;

// id, ����, �̸��� , ����
public class Hello2 {
	static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String id = "";
		String name = "";
		String email = "";
		Integer age = 0;
		
		System.out.println("���̵� �Է�: ");
		id = scan.next();
		
		System.out.println("�̸� �Է�: ");
		name = scan.next();
		
		System.out.println("�̸��� �Է�: ");
		email = scan.next();
		
		System.out.println("���� �Է�: ");
		age = scan.nextInt();
		
		System.out.println("���̵�: " + id);
		System.out.println("�̸�: " + name);
		System.out.println("�̸���: " + email);
		System.out.println("����: " + age);
	}

}
