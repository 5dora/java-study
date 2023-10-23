package org.comstudy.day04;

import java.util.ArrayList;
// Bean������ ����� ��ü
// �����ڿ� ���� �����־�� �Ѵ�.
// DTO or VO
class Person {
	private int no;
	private String id;
	private String phone;

	// ���߿��� �Һ�? ���
	//������, setter, getter
	public Person() {
		//default������
	}
	//������ �����ε�
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
	
	// �̸����� �˻��ǵ��� hashCode�� equals�� �� �����Ѵ�.
	// => arrayList�� ���� �÷��ǿ��� indexOf�� ��밡���ϰ� �Ѵ�.
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
		//Person��ü�� �����ϴ� ArrayList ����
		ArrayList<Person> personList = new ArrayList<Person>();
		
		// person ������ 3�� �߰�
		personList.add(new Person(1,"KIM","010-1234-1234"));
		personList.add(new Person(2,"LEE","010-1234-1234"));
		personList.add(new Person(3,"PARK","010-1234-1234"));
		System.out.println(personList);
		// �� person ������ ����
		personList.add(1, new Person(4, "HONG", "010-0000-0000"));
//		for(Person p : personList) {
//			System.out.println(p);
//		}
		// person ������ ����
			personList.remove(2);
			for(Person j : personList) {
				System.out.println(j);				
		}
		// person ������ �˻�(�̸����� �˻�)
//			int idx = -1;
//			for(int i=0;i<personList.size(); i++) {
//				if("HONG".equals(personList.get(i).getId())) {
//					idx = i;
//					break;
//				};
//			}
//			System.out.println("HONG person�� ��ġ : " + idx);
			
			// ��ü�� ������ List�� VO��ü�� hashCode�� equals�� �������ؾ� indexOf ��� ����
			int idx = personList.indexOf(new Person(0, "HONG", null));
			System.out.println("Find index : " + idx);
			
			
	}
	
	public static void test(String[] args) {
		// ArrayList ����
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
