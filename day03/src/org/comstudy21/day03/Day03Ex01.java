//package org.comstudy21.day03;
//
//class Dog {
//	//�ڹ��� ĸ��ȭ: �ʵ�� private, �޼ҵ�� public ���������� �ٿ���
//	//��� �ʵ�(���� ����)
//	private String name;
//	
//	// ������ �޼ҵ��� �̸��� Ŭ������� �����ϰ� �������� ����
//	//����Ʈ ������
//	public Dog() { 
//		this("�̸�����"); //�ٸ� ������ ȣ��
//	}
//	//������ �����ε� (�߰�)
//	public Dog(String name){
//		//�ʵ忡 �Ű��������� ����(����)
//		this.name = name;//this ��ü �ڽ��� ����Ű�� ���� �� 
//	}
//	public void bark() {
//		System.out.println(name +"�̶�� ���� ¢�´�. �۸�!");
//	}
//	public void sleep() {
//		System.out.println("���� �ܴ�. zzz..");
//	}
//}
//
//public class Day03Ex01 {
//	static Dog myDog = new Dog("Buddy"); //�����ڸ� ȣ��
//	public static void main(String[] args) {
//		myDog.bark();
//		myDog.sleep();
//	}
//}
