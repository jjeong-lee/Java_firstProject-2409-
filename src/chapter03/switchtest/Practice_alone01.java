package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Practice_alone01 {

	public static void main(String[] args) {
		//Switch��
		
		System.out.println("=====����� ���� Ȯ��=====");
		System.out.println("�����ȣ �Ǿ��ڸ��� �Է��Ͻÿ�. : ");
		
		int number=Integer.parseInt(JOptionPane.showInputDialog("�����ȣ �Է�"));
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
		System.out.println("����� "+classNum+"�� ���� ���ÿ�.");
		
	}

}
