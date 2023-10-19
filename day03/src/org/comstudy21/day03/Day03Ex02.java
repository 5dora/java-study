package org.comstudy21.day03;

class Animal {
   private String name;
   
   public Animal(String name) {
      this.name = name;
   }

   public void sleep() {
      // �ڹٿ����� ���ڿ� �񱳸� == ���� �ϸ� ����!
      if("buddy".equalsIgnoreCase(name) ) {
         System.out.println("�� ���� ���� �´�!");
      }
      System.out.println(name + "�� ���� �ܴ�");
   }
}

class Dog extends Animal {
   // ��� �ʵ�(���� ����)
   // �ڹ��� ĸ��ȭ : �ʵ�� private, �޼ҵ�� public ����������
   private String name;
   
   // ������ �޼ҵ��� �̸��� Ŭ������� �����ϰ� �������� ����.
   public Dog() {
      // ����Ʈ ������
      this("�̸�����"); // �ٸ� ������ ȣ��
   }
   // ������ �����ε� (�߰�)
   public Dog(String name) {
      // �θ��� ������ ȣ��, �Ű����� ���� �θ�� ����.
      super(name);
      
      // �ʵ忡 �Ű��������� ����(����)
      // this�� ��ü �ڽ��� ����Ű�� ���� ��
      this.name = name;
   }
   
   public void bark() {
      System.out.println(name+"�̶�� ���� ¢�´�! �۸�!");
   }
}

public class Day03Ex02 {
   static Dog myDog = new Dog("Buddy"); // �����ڸ� ȣ��
   public static void main(String[] args) {
      myDog.bark();
      myDog.sleep();
   }
}