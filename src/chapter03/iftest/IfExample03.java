package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {


		char grade;
		int jumsu;
		
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("Java ����"));
		
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
			System.out.println("�ֿ�� �л��Դϴ�.");
			System.out.println("����� ������ : A �Դϴ�.");
		}else if(jumsu>=80) {
			System.out.println("��� �л��Դϴ�.");
			System.out.println("����� ������ : B �Դϴ�.");
		}else if(jumsu>=70) {
			System.out.println("����� ������ : C �Դϴ�.");
		}else if(jumsu>=60) {
			System.out.println("����� ������ : D �Դϴ�.");
		}else {
			System.out.println("����� ������ : F �Դϴ�.");
			System.err.println("����� ���");
		}
		*/
		
		if(jumsu>100) {
			System.out.println("�߸��� �����Դϴ�.");
		}
		else if(jumsu >= 90) {
			System.out.println("�ֿ�� �л��Դϴ�.");
			grade = 'A';
		}else if (jumsu >= 80) {
			System.out.println("��� �л��Դϴ�.");
			grade = 'B';
		}else if (jumsu >= 70) {
			grade = 'C';
		}else if (jumsu >= 60) {
			grade = 'D';
		}else {
			System.err.println("����� ���");
			grade = 'F';
		}//if���ǹ� ��
		
		System.out.println("����� ������ " + jumsu + " �Դϴ�.");
		
	}
}
