package org.comstudy.day04;

import java.util.HashSet;
import java.util.Random;

public class Day04Ex02 {
	public static void main(String[] args) {
		// Set을 이용해서 로또번호 생성기 만들기
		// Random클래스와 HashSet을 이용해서 로또번호 생성기를 만들어 본다.
		Random rand = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();

		// lotto.size가 6이 될 때까지 1~45의 값을 저장한다.
//		int num1 = rand.nextInt(46);
//		System.out.println(num1);

		while (lotto.size() < 6) {
			lotto.add(1 + rand.nextInt(45));
		}
		System.out.println(lotto);
	}

	public static void test(String[] args) {
		// HashSet 생성
		HashSet<String> animals = new HashSet<>();
		// 추가
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Bird");
		System.out.println(animals); // [Cat, Bird, Dog] 순서는 보장되지 않습니다.
		// 중복된 아이템 추가 시도
		animals.add("Dog");
		System.out.println(animals); // 중복된 "Dog"는 추가되지 않습니다.
		// 포함 여부 확인
		boolean hasCat = animals.contains("Cat"); // true
		// 삭제
		animals.remove("Bird");
		System.out.println(animals); // [Cat, Dog]
		// 크기 확인
		int size = animals.size(); // 2
	}

}
