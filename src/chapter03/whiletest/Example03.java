package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		boolean run=true;
		int balance=0; //����(+), ���(-)

		Scanner scan=new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����>");
			
			//nextLine()�� ������ ���ͷ� �߻��Ǵ� ���� ����
			int menuNum=Integer.parseInt(scan.nextLine());
			//nextInt()�� ������ �������� ���͸� �Է��ϸ� ������ ���ڿ����� �Էµ�
			//int menuNum=scan.nextInt(); //int�� enter���� �Բ� �ν��ع���.
			
			
			switch (menuNum) {
			case 1:
				System.out.println("���ݾ� > ");
				int money=Integer.parseInt(scan.nextLine());
				balance+=money;
				break;
			case 2:
				System.out.println("��ݾ� > ");
				int money2=Integer.parseInt(scan.nextLine());
				balance-=money2;
				break;
			case 3:
				System.out.println("�ܰ� > ");
				System.out.print(balance);
				break;
			case 4:
				run=false;
				break;
				
			}//switch
			System.out.println();

		}//while
		System.out.println("���α׷��� �����մϴ�.");
	}//main

}//class
