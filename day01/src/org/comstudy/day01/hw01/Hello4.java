package org.comstudy.day01.hw01;

import java.util.Scanner;

/* ����
5���� �����͸� �ݺ��ؼ� �޾Ƽ� ����ϱ�
*/

class Person {
	int id;
	String name;
	String email;
	int age;
}


// �迭�� ������ ��ü�� ������
public class Hello4 {
	static Person[] person = null;
	// �������� �����̳� �ʵ念���� �������
	static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		person = new Person[5];
		// �� ������ �迭�̳� ��ü�� ��ġ�� ����־�
		// �ּ� ������ ǥ�õǾ��־� 4byte
		// ��ü�� ������ �� �ִ� �������� 5�� (4byte * 5��)

		for(int i=0; i<person.length; i++) {
			// ������ �Է� �� �迭�� ��ҷ� ���� ��ü �����ϱ�
			person[i] = new Person();
			
			System.out.printf("------------- %d��°�� �Է�----------\n", i);
			System.out.print("person" + (i+1) +"�� ��ȣ �Է�: ");
			person[i].id = scan.nextInt();
			System.out.print("person" + (i+1) +"�� �̸� �Է�: ");
			person[i].name = scan.next();
			System.out.print("person" + (i+1) +"�� �̸��� �Է�: ");
			person[i].email = scan.next();
			System.out.print("person" + (i+1) +"�� ���� �Է�: ");
			person[i].id = scan.nextInt();
			System.out.println();
			
		}
		System.out.printf("------------- ��� ----------");
		for(int i=0; i<5; i++) {
		System.out.printf("person" + (i+1) + " = %d, %s, %s, %d \n", person[i].id, person[i].name, person[i].email, person[i].age);
		}
		
		
//		for(int i=0; i<5; i++) {
//			person[i] = new Person();
//			System.out.print("person" + (i+1) +"�� ��ȣ �Է�: ");
//			person[i].id = scan.nextInt();
//			System.out.print("person" + (i+1) +"�� �̸� �Է�: ");
//			person[i].name = scan.next();
//			System.out.print("person" + (i+1) +"�� �̸��� �Է�: ");
//			person[i].email = scan.next();
//			System.out.print("person" + (i+1) +"�� ���� �Է�: ");
//			person[i].id = scan.nextInt();
//			System.out.println();
//			
//		}
//		for(int i=0; i<5; i++) {
//		System.out.printf("person" + (i+1) + " = %d, %s, %s, %d \n", person[i].id, person[i].name, person[i].email, person[i].age);
//		}
	}
}
