package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		//�� �ڸ��� ���ڸ� �Է¹޾� (scan)
		//���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)


		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�(�� �ڸ���) : ");
		int num1= scan.nextInt();
		
		boolean isresult = ((num1%2)==1);
		
		System.out.println(isresult?"Ȧ��":"¦��");
		
		//������ ��� �ٽ� �������� �����ϱ�
		
		

	}

}
