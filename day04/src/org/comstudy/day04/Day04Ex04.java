package org.comstudy.day04;


import java.util.HashMap;
import java.util.Scanner;

interface Controller {
   // �������̽��� ���� ū Ư¡�� �߻�޼���� ��� ����� ����Ѵ�. 
   public int execute(); // �߻� �޼���
}
//�Խ��� ���� Ŭ����
class BoardController implements Controller {
   Scanner scan = new Scanner(System.in);
   @Override
   public int execute() {
      System.out.println("1)��� 2)�۾��� 3)��ȸ");
      return scan.nextInt();
   }
}

//ȸ������ ���� Ŭ����
class MemberController implements Controller {
   Scanner scan = new Scanner(System.in);
   @Override
   public int execute() {
      System.out.println("1)ȸ����� 2)ȸ���߰� 3)ȸ������");
      return scan.nextInt();
   }
}

//���θ� ���� Ŭ����
class ShopController implements Controller {
   Scanner scan = new Scanner(System.in);
   @Override
   public int execute() {
      System.out.println("1)��ǰ��� 2)��ٱ��� 3)�����ȸ");
      return scan.nextInt();
   }
}

public class Day04Ex04 {
   static HashMap<String, Controller> handlerMapping = new HashMap<String, Controller>();
   // static �ʱ�ȭ ��
   static {
      handlerMapping.put("/board", new BoardController());
      handlerMapping.put("/member", new MemberController());
      handlerMapping.put("/shop", new ShopController());
   }

   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      System.out.print("���� �� ���ͷѷ� �н� �Է�(ex: /board ): ");
      String path = scan.next();
      // �н� ���� �̿��ؼ� ��Ʈ�ѷ��� �����Ѵ�.
      Controller ctrl = handlerMapping.get(path);
      if(ctrl != null) {
         int no = ctrl.execute();
         System.out.println("no => " + no);
      } else {
         System.out.println("�ش� ��Ʈ�ѷ��� �����ϴ�!");
      }
      
      main(null);
   }

}
