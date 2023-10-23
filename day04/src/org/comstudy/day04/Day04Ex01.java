package org.comstudy.day04;

import java.util.ArrayList;
// Bean빈으로 사용할 객체
// 생성자와 게터 세터있어야 한다.
// DTO or VO
class Person {
	private int no;
	private String id;
	private String phone;

	// 나중에는 롬복? 사용
	//생성자, setter, getter
	public Person() {
		//default생성자
	}
	//생성자 오버로드
	public Person(int no, String id, String phone) {
		super();
		this.no = no;
		this.id = id;
		this.phone = phone;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [no=" + no + ", id=" + id + ", phone=" + phone + "]";
	}
	
	// 이름으로 검색되도록 hashCode와 equals를 재 정의한다.
	// => arrayList와 같은 컬렉션에서 indexOf를 사용가능하게 한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

public class Day04Ex01 {
	public static void main(String[] args) {
		//Person객체를 저장하는 ArrayList 생성
		ArrayList<Person> personList = new ArrayList<Person>();
		
		// person 데이터 3개 추가
		personList.add(new Person(1,"KIM","010-1234-1234"));
		personList.add(new Person(2,"LEE","010-1234-1234"));
		personList.add(new Person(3,"PARK","010-1234-1234"));
		System.out.println(personList);
		// 새 person 데이터 삽입
		personList.add(1, new Person(4, "HONG", "010-0000-0000"));
//		for(Person p : personList) {
//			System.out.println(p);
//		}
		// person 데이터 제거
			personList.remove(2);
			for(Person j : personList) {
				System.out.println(j);				
		}
		// person 데이터 검색(이름으로 검색)
//			int idx = -1;
//			for(int i=0;i<personList.size(); i++) {
//				if("HONG".equals(personList.get(i).getId())) {
//					idx = i;
//					break;
//				};
//			}
//			System.out.println("HONG person의 위치 : " + idx);
			
			// 객체를 저장한 List는 VO객체의 hashCode와 equals를 재정의해야 indexOf 사용 가능
			int idx = personList.indexOf(new Person(0, "HONG", null));
			System.out.println("Find index : " + idx);
			
			
	}
	
	public static void test(String[] args) {
		// ArrayList 생성
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println(fruits);
		
		fruits.add(1,"Mango");
		System.out.println(fruits);
		
		System.out.println(fruits.indexOf("Banana"));
		
		fruits.remove("Banana");
		System.out.println(fruits);
		
		fruits.remove(1);
		System.out.println(fruits);
	}

}
