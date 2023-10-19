package homework.day02;

import java.util.ArrayList;
import java.util.Scanner;

class Person {
	private String name;
	private int age;
	private String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

// Getters and Setters 추가
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Address: " + address;
	}
}

class AddressBook {
	private ArrayList<Person> persons;

	public AddressBook() {
		this.persons = new ArrayList<>();
		this.persons.add(new Person("홍길동", 25, "서울시 종로구"));
	}

	public void addPerson() {
		System.out.println("------연락처 추가------");
		// 
		
	}

	public void displayPersons() {
		System.out.println("------목록 출력------");
		// for문 이용해서 돌리기
		// for each
		for(int i=0; i<this.persons.size();i++) {
			System.out.println(this.persons.get(i).toString());
		}

	}

	public void searchPerson() {
		System.out.println("------검색------");

	}

	public void editPerson() {
		System.out.println("------수정------");

	}

	public void deletePerson() {
		System.out.println("------삭제------");
	}
}

public class Day02Hw {
	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===================== MENU ======================");
			System.out.println("(1)연락처 추가 (2) 목록 출력 (3) 검색 (4) 수정 (5) 삭제 (6) 종료");
			System.out.print("선택: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline
			switch (choice) {
			case 1:
				addressBook.addPerson();
				break;
			case 2:
				addressBook.displayPersons();
				break;
			case 3:
				addressBook.searchPerson();
				break;
			case 4:
				addressBook.editPerson();
				break;
			case 5:
				addressBook.deletePerson();
				break;
			case 6:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please choose again.");
			}
		}
	}
}