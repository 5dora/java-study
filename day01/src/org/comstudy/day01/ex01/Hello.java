package org.comstudy.day01.ex01;

import java.util.Scanner;

/*
 Ŭ������ ������� �ʵ�� �޼��尡 �ִ�.
 ������� static�� static�� �� ���̴� ���� �ִ�.
	- static ����? ��ü ���� ����ϰڴ�
	- static �پ��ִ� �� Ŭ���� �����ڸ��� ����ȴ�.
Final(���)
	- ���� �ٲ��� �ʰڴ�.
	- ��� �տ� ���̳Ŀ� ���� ���ݾ� �ǹ̴� �޶�
	- Ŭ����->����� �ȵǰ� / �޼���->override �ȵǰ�
	
 Ŭ���� �� �����?
	 - ��ü�� ����� ���ؼ�
 main�� ��ü ���� ��� ���ư�?
 	- static �ٿ��� ������
*/

public class Hello {
	// (Ŭ������) ��� �ʵ� ����(���� ����)
	// ���� ���� �� ������ Ÿ�� ǥ���ؾ� ��
	static final Scanner scan = new Scanner(System.in);
	static final Scanner scanline = new Scanner(System.in);
	static String name = "ȫ�浿";
	
	// ��� �޼���
	public static void main(String[] args) {
		// (�޼�����) ���� ����(���� ����) - �ʱ�ȭ �ʼ�
		String address = "����� �߱�";
		Integer age = 25;
		
		// �̸�, �ּ�, ���� �Է� �ޱ�
		System.out.println("�����Է�: "); 
		name = scan.next();
	
		System.out.println("�ּ� �Է�: ");
		address = scanline.nextLine(); //enter������ ������ �ԷµǾ��ٰ� ����
		// 1. ���۸� ����ְ� �ٽ� �Է¹ޱ�
		// 2. ���ο� ����
		
		System.out.println("���� �Է�: ");
		age = scan.nextInt();
		
		System.out.println("Hello world");
		System.out.println("����: " + name);
		System.out.println("�ּ�: " + address);
		System.out.println("����: " + age);

	}

}