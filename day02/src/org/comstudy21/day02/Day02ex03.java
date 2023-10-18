package org.comstudy21.day02;

public class Day02ex03 {
	public static void main(String[] args) {
		for(int cnt=1; cnt<=9; cnt++) {
			for(int dan =2; dan<=9; dan++) {
				System.out.printf("%d * %d = %d\t", dan, cnt, dan*cnt);
			}
			System.out.println("");
		}
	}

}
