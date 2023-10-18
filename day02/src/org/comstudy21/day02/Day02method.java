package org.comstudy21.day02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day02method {
	// void�� return���� �ʰڴ�
	// return�� ������ return�Ǵ� �������� type������� ��
	// Ȥ�� ���������� ��������� ��
	   
	   int a;
	   
	   static int getDan(String message) {
	      int num = 0;
	      Scanner scan = new Scanner(System.in);
	      do {
	         while(true) {
	            try {
	            	System.out.print(message);
	               num = scan.nextInt();
	               break;
	            } catch (InputMismatchException e) {
	               scan.next(); // ���ۿ� �Էµ� �߸��� ������ ����
	               continue;
	            }
	         }
	      } while(num<1 || num>9);
	      return num;
	   }
	   
	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int startDan = 0;
	      int endDan = 0;
	      
	      startDan = getDan("���� ��: ");
	      endDan = getDan("���� ��: ");
	    		  
	      	      
	      if(startDan > endDan) {
	         int tempDan = startDan;
	         startDan = endDan;
	         endDan = tempDan;
	      }
	      
	      for(int dan=startDan; dan<=endDan; dan++) {         
	         System.out.printf("-%d��-\n", dan);
	         for(int cnt=1; cnt<=9; cnt++) {            
	            System.out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
	         }
	      }
	   }
	   
	   public static void gugudan(String[] args) {
	      // ������ ���
	      for(int cnt=1; cnt<=9; cnt++) {
	         for(int dan=2; dan<=9; dan++) {
	            System.out.printf("%d*%d=%d\t", dan, cnt, dan*cnt);
	         }
	         System.out.println();
	      }
	   }

	}
