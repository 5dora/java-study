package org.comstudy21.day02;

import static org.comstudy21.day02.Day02method.getDan;


public class Day02gugudan {
	
	      
	public static void main(String[] args) {
		int startDan = 0;
		int endDan = 0;
		
//		startDan = Day02method.getDan("���� ��: ");
//		endDan = Day02method.getDan("���� ��: ");
		startDan = getDan("���� ��: ");
		endDan = getDan("���� ��: ");
		
		for(int dan=startDan; dan<=endDan; dan+=3) {
			for(int cnt=0; cnt<3 && dan+cnt<10 && dan+cnt<=endDan; cnt++) {
				System.out.printf("***%d��***\t", dan+cnt);

			}
			System.out.println();
			for(int num=1; num<=9; num++) {
				for(int cnt=0; cnt<3 && dan+cnt<10 && dan+cnt<=endDan; cnt++) {
					System.out.printf("%d * %d = %d\t", dan+cnt, num, (dan+cnt)*num);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
