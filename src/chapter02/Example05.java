package chapter02;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/* �����濡 51�� ����(������ : number)
		 �� ���� ������� ���θ� �Ǻ��ϴ� ���α׷�
		 �����濡 ����� ���� ����� "����Դϴ�"
		 �׷��� ���� ��� "���� �Ǵ� 0�Դϴ�."��� ����� �Ǿ���� 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		//���� �ʱ�ȭ
		System.out.println("�Է� : " );
		int number= scan.nextInt();
		//������� ���θ� �Ǻ� isPositive
		boolean isPositive=number>0;
		//���׿�����
		//String result=(number>0)?"����Դϴ�.":"���� �Ǵ� 0�Դϴ�.";�� ����
		String result=isPositive?"����Դϴ�.":"���� �Ǵ� 0�Դϴ�.";
		System.out.println(result);
		System.out.println("----------------------------");
		//
		int _num=-5;
		String numResult=(_num>0)?"����Դϴ�.":"���� �Ǵ� 0�Դϴ�.";
		System.out.println(numResult);
		
	}

}
