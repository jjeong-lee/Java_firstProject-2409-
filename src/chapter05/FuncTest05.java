package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	//EduStep �޼��� ����
	public static void EduStep(int num) {
		if(num==1) {
			System.out.println("����� �ܰ�� ���Դϴ�.");
		}else if(num==2) {
			System.out.println("����� �ܰ�� ���Դϴ�.");
		}else if(num==3) {
			System.out.println("����� �ܰ�� ���Դϴ�.");
		}else
			System.out.println("1~3�߿� �Է��ϼ���.");
 		}//if

	public static void main(String[] args) {
		
		////����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scan= new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number=scan.nextInt();
		
		EduStep(number); //number�� �� �Ű�����
		
	}

}
