//package org.comstudy21.day03;
//
//class Dog {
//	//자바의 캡슐화: 필드는 private, 메소드는 public 접근지정자 붙여야
//	//멤버 필드(전역 변수)
//	private String name;
//	
//	// 생성자 메소드의 이름은 클래스명과 동일하고 리턴형이 없다
//	//디폴트 생성자
//	public Dog() { 
//		this("이름없는"); //다른 생성자 호출
//	}
//	//생성자 오버로딩 (추가)
//	public Dog(String name){
//		//필드에 매개변수값을 전달(대입)
//		this.name = name;//this 객체 자신을 가리키는 참조 값 
//	}
//	public void bark() {
//		System.out.println(name +"이라는 개가 짖는다. 멍멍!");
//	}
//	public void sleep() {
//		System.out.println("잠을 잔다. zzz..");
//	}
//}
//
//public class Day03Ex01 {
//	static Dog myDog = new Dog("Buddy"); //생성자를 호출
//	public static void main(String[] args) {
//		myDog.bark();
//		myDog.sleep();
//	}
//}
