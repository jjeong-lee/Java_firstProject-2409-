package chapter03.iftest;

import java.util.Scanner;

public class Practice_alone01 {
	
	public static void main(String[] arg) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("����� ������ �Է��Ͻÿ� : ");
		int score=scan.nextInt();
		char grade;

		if (score >= 90) {
			System.out.println("�ֿ�� �л��Դϴ�.");
			grade = 'A';
		} else if (score >= 80) {
			System.out.println("��� �л��Դϴ�.");
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + " �Դϴ�.");
	}

}
