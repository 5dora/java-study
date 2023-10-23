package org.comstudy.day04;

import java.util.HashMap;

public class Day04Ex03 {
	public static void main(String[] args) {
		// HashMap ����
		HashMap<String, Integer> studentGrades = new HashMap<>();
		// �� �߰�
		studentGrades.put("Alice", 85);
		studentGrades.put("Bob", 90);
		studentGrades.put("Charlie", 78);
		System.out.println(studentGrades); // {Alice=85, Bob=90, Charlie=78}
		// �ߺ��� Ű�� �� �߰� �õ�
		studentGrades.put("Alice", 88); // "Alice"�� ������ 88�� ������Ʈ
		System.out.println(studentGrades); // {Alice=88, Bob=90, Charlie=78}
		// Ű�� �� �˻�
		int aliceGrade = studentGrades.get("Alice"); // 88
		// Ű�� ���� ���� Ȯ��
		boolean hasBob = studentGrades.containsKey("Bob"); // true
		// ���� ���� ���� Ȯ��
		boolean hasGrade85 = studentGrades.containsValue(85); // false, because Alice's grade was updated to 88
		// Ű/�� ����
		studentGrades.remove("Bob");
		System.out.println(studentGrades); // {Alice=88, Charlie=78}
		// ��� Ű�� ���� ���
		for (String key : studentGrades.keySet()) {
		System.out.println(key + ": " + studentGrades.get(key));
		}
		
	}
}
