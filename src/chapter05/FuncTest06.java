package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int num) {
		String step1 = "";
		
		switch (num) {
		case 1:
			step1= "�ʱ�";
			break;
		case 2:
			step1 = "�߱�";
			break;
		case 3:
			step1 = "���";
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			step1="�������� �ʴ� �ܰ�";
			break;
		}//switch
		return step1;
	}//method

public static void main(String[] args) {
		
		////����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scan= new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number=scan.nextInt();//2
		//1:�ʱ�, 2:�߱�, 3:���
		
		String step=EduStep(number); //number�� �� �Ű�����
		System.out.println("���� ���� �ܰ�� "+step+"�Դϴ�.");
		
	}

}
