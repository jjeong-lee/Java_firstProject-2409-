package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Practice_alone01 {

	public static void main(String[] args) {
		//Switch문
		
		System.out.println("=====고사장 교실 확인=====");
		System.out.println("수험번호 맨앞자리를 입력하시오. : ");
		
		int number=Integer.parseInt(JOptionPane.showInputDialog("수험번호 입력"));
		int classNum;
		
		switch (number) {
		case 34:
			classNum=1;
			break;
		case 44:
			classNum=2;
			break;
		case 54:
			classNum=3;
			break;
		case 64:
			classNum=4;
			break;
		default:
			classNum=5;
		}
		System.out.println("고사장 "+classNum+"반 으로 가시오.");
		
	}

}
