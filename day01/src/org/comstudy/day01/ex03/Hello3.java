package org.comstudy.day01.ex03;

import java.util.Scanner;

/*
 �ǽ�
 ���, for��
 ��ȣ, ����, �̸��� , ����
 Person Ŭ������ ����� ��ü�� �����ؼ� ��ü�� �Է¹ޱ�.
 */

// �ϳ��� ���Ͽ� ���� Ŭ������ ���� �����ϴ�.

class Person {
	int id;
	String name;
	String email;
	int age;
	Person p; //�ڱ�����
}

public class Hello3 {
	static Person person = new Person();
	// NullpointException
	// static Person person; == static Person person = Null; �����ϰ� �ִ� �� ����
	// ���� ������ ��ü�� �������Ѿ� �����͸� �Է¹��� �� �ִ�.
	// �����̶�� ���� / �� ����
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("��ȣ �Է�: ");
		person.id = scan.nextInt();
		System.out.print("�̸� �Է�: ");
		person.name = scan.next();
		System.out.print("�̸��� �Է�: ");
		person.email = scan.next();
		System.out.print("���� �Է�: ");
		person.id = scan.nextInt();
		
		System.out.printf("%d, %s, %s, %d", person.id, person.name, person.email, person.age);
//		System.out.println("��ȣ = " + person.id);
//		System.out.println("�̸� = " + person.name);
//		System.out.println("�̸��� = " + person.email);
//		System.out.println("���� = " + person.age);
		
	}
}