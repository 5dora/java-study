package org.comstudy21.day03;

class Animal {
   private String name;
   
   public Animal(String name) {
      this.name = name;
   }

   public void sleep() {
      // 자바에서는 문자열 비교를 == 으로 하면 오류!
      if("buddy".equalsIgnoreCase(name) ) {
         System.out.println("니 개는 버디가 맞다!");
      }
      System.out.println(name + "가 잠을 잔다");
   }
}

class Dog extends Animal {
   // 멤버 필드(전역 변수)
   // 자바의 캡슐화 : 필드는 private, 메소드는 public 접근지정자
   private String name;
   
   // 생성자 메소드의 이름은 클래스명과 동일하고 리턴형이 없다.
   public Dog() {
      // 디폴트 생성자
      this("이름없는"); // 다른 생성자 호출
   }
   // 생성자 오버로딩 (추가)
   public Dog(String name) {
      // 부모의 생성자 호출, 매개변수 값을 부모로 전달.
      super(name);
      
      // 필드에 매개변수값을 전달(대입)
      // this는 객체 자신을 가리키는 참조 값
      this.name = name;
   }
   
   public void bark() {
      System.out.println(name+"이라는 개가 짖는다! 멍멍!");
   }
}

public class Day03Ex02 {
   static Dog myDog = new Dog("Buddy"); // 생성자를 호출
   public static void main(String[] args) {
      myDog.bark();
      myDog.sleep();
   }
}