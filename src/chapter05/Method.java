package chapter05;

import java.util.Scanner;

public class Method {
	
	//�޼����� �����ε� ���
	//�޼���1
	public void makeBread() {
		System.out.println("���� ����ϴ�.");
	}
	//�޼���2
	void makeBread(int cnt) {
		for(int a=1;a<=cnt;a++) {
			System.out.println("��"+cnt+"��");
		}
		System.out.println("��"+cnt+"���� �ϼ� �Ǿ����ϴ�.");
	
	}
	//�޼���3
	void makeBread(int cnt, String name) {
		for(int b=1;b<=cnt;b++) {
			System.out.println(name+"��"+cnt+"��");
		}
		System.out.println("��û�Ͻ� "+cnt+"���� "+name+"���� �ϼ� �Ǿ����ϴ�.");
	}
	
	
	//------------------------------
	
	void order() {
		
		boolean run=true;
		Scanner scan= new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");
			
			int input_num=Integer.parseInt(scan.nextLine());
			switch (input_num) {
			case 1: 
				System.out.print("�� ������ �Է�");
				int cnt1=Integer.parseInt(scan.nextLine());
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("�� ������ �Է�");
				int cnt2=Integer.parseInt(scan.nextLine());
				System.out.print("�� ������ �Է�");
				String breadname=scan.nextLine();
				makeBread(cnt2, breadname);
				break;
			case 3:
				System.out.println("���� ����");
				run=false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}//switch
		}//while
		System.out.println("���α׷� ����");
	}
	}

