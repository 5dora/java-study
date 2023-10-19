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

// Getters and Setters �߰�
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Address: " + address;
	}
}

class AddressBook {
	private ArrayList<Person> persons;

	public AddressBook() {
		this.persons = new ArrayList<>();
		this.persons.add(new Person("ȫ�浿", 25, "����� ���α�"));
	}

	public void addPerson() {
		System.out.println("------����ó �߰�------");
		// 
		
	}

	public void displayPersons() {
		System.out.println("------��� ���------");
		// for�� �̿��ؼ� ������
		// for each
		for(int i=0; i<this.persons.size();i++) {
			System.out.println(this.persons.get(i).toString());
		}

	}

	public void searchPerson() {
		System.out.println("------�˻�------");

	}

	public void editPerson() {
		System.out.println("------����------");

	}

	public void deletePerson() {
		System.out.println("------����------");
	}
}

public class Day02Hw {
	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===================== MENU ======================");
			System.out.println("(1)����ó �߰� (2) ��� ��� (3) �˻� (4) ���� (5) ���� (6) ����");
			System.out.print("����: ");
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