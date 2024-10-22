package chapter03.iftest;

import java.util.Scanner;

public class Practice_alone01 {
	
	public static void main(String[] arg) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("당신의 점수를 입력하시오 : ");
		int score=scan.nextInt();
		char grade;

		if (score >= 90) {
			System.out.println("최우수 학생입니다.");
			grade = 'A';
		} else if (score >= 80) {
			System.out.println("우수 학생입니다.");
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 점수는 " + grade + " 입니다.");
	}

}
