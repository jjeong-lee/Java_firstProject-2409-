package chapter02;

import java.util.Scanner;

public class Example03 {
	
	//�������� ����ϴ� ������ ����
	public static void main(String[] args) {
		
		//#1
		//���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		//�׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		//����?����:����
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("score : ");
		int score = scan.nextInt();
		String pass = (score>=60) ? "�հ�":"���հ�";
		System.out.println(pass+"�Դϴ�.");
		
		
		//#2
				//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
				//score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		
		System.out.print("Score: ");
		int score2= scan.nextInt();
		
		
		char grade =(score2>90)?'A':(score2>80)?'B':'C';
		System.out.println(grade + "�Դϴ�.");
		
		//�ΰ������� ���� �����ڸ� ���� ���������, �� �̻��� ���ǹ��� ����Ѵ�.(������ ������)
		
		
		
		//�����غ���
		System.out.print("Score: ");
		int score3=scan.nextInt();
		
	    String result=(score3>90)?"��":((score3>70)?"��":"��");
	    System.out.println("��� = "+result);
	
	}

}
