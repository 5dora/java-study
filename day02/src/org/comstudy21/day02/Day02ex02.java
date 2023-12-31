package org.comstudy21.day02;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Day02ex02 {

	   public static void main(String[] args) {
		      Scanner scan = new Scanner(System.in);
		      int startDan = 0;
		      int endDan = 0;
		      
		      do {
		         while(true) {
		            try {
		               System.out.print("시작 단: ");
		               startDan = scan.nextInt();
		               break;
		            } catch (InputMismatchException e) {
		               scan.next(); // 버퍼에 입력된 잘못된 데이터 제거
		               continue;
		            }
		         }
		      } while(startDan<1 || startDan>9);
		      do {
		         while(true) {
		            try {
		               System.out.print("종료 단: ");
		               endDan = scan.nextInt();
		               break;
		            } catch (InputMismatchException e) {
		               scan.next(); // 버퍼에 입력된 잘못된 데이터 제거
		               continue;
		            }
		         }
		      } while(endDan<1 || endDan>9);
		      
		      if(startDan > endDan) {
		         int tempDan = startDan;
		         startDan = endDan;
		         endDan = tempDan;
		      }
		      
		      for(int dan=startDan; dan<=endDan; dan++) {         
		         System.out.printf("-%d단-\n", dan);
		         for(int cnt=1; cnt<=9; cnt++) {            
		            System.out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
		         }
		      }
		   }
		   
		   public static void gugudan(String[] args) {
		      // 구구단 출력
		      for(int cnt=1; cnt<=9; cnt++) {
		         for(int dan=2; dan<=9; dan++) {
		            System.out.printf("%d*%d=%d\t", dan, cnt, dan*cnt);
		         }
		         System.out.println();
		      }
		   }
		}
