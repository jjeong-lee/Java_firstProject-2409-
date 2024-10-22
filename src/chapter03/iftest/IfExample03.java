package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {


		char grade;
		int jumsu;
		
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		
		//#1
		/*
		if(jumsu>=90) {
			System.out.println('A');
		}else if(jumsu>=80) {
			System.out.println('B');
		}else if(jumsu>=70) {
			System.out.println('C');
		}else if(jumsu>=60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		*/
		
		/*
		if(jumsu>=90) {
			System.out.println("최우수 학생입니다.");
			System.out.println("당신의 점수는 : A 입니다.");
		}else if(jumsu>=80) {
			System.out.println("우수 학생입니다.");
			System.out.println("당신의 점수는 : B 입니다.");
		}else if(jumsu>=70) {
			System.out.println("당신의 점수는 : C 입니다.");
		}else if(jumsu>=60) {
			System.out.println("당신의 점수는 : D 입니다.");
		}else {
			System.out.println("당신의 점수는 : F 입니다.");
			System.err.println("재시험 요망");
		}
		*/
		
		if(jumsu>100) {
			System.out.println("잘못된 점수입니다.");
		}
		else if(jumsu >= 90) {
			System.out.println("최우수 학생입니다.");
			grade = 'A';
		}else if (jumsu >= 80) {
			System.out.println("우수 학생입니다.");
			grade = 'B';
		}else if (jumsu >= 70) {
			grade = 'C';
		}else if (jumsu >= 60) {
			grade = 'D';
		}else {
			System.err.println("재시험 요망");
			grade = 'F';
		}//if조건문 끝
		
		System.out.println("당신의 점수는 " + jumsu + " 입니다.");
		
	}
}
