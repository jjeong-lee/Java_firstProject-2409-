package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		int cnt, num;
		boolean run = true;
		String str = "";
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");
			
			num=Integer.parseInt(scan.nextLine());
			switch(num) {
			case 1: 
				System.out.println("�� ���� �Է� : ");
				cnt=Integer.parseInt(scan.nextLine());
				for(int a=1;a<=cnt;a++) {
					System.out.println("��"+cnt+"��");
				}
				System.out.println("��"+cnt+"���� �ϼ� �Ǿ����ϴ�.");
				break;
			
			case 2: 
				System.out.println("���� ���� �Է� : ");
				cnt=Integer.parseInt(scan.nextLine());
				System.out.println("���� ���� ���� : ");
				str=scan.nextLine();
				for(int b=1;b<=cnt;b++) {
					System.out.println(str+"��"+cnt+"��");
				}
				System.out.println("��û�Ͻ� "+cnt+"���� "+str+"���� �ϼ� �Ǿ����ϴ�.");
				break;
			
			case 3: 
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				run=false;
				break;
			
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		}//w
		

	}//main

}//class
