package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*���ð��� ������ ������ �Ƶ��� 1000�� ->7
		���ð��� ������ �ʵ��л��� 2000��->13
		���ð��� ������ ��,����л��� 3500�� ->19
		���ð��� ������ ������ 5000��*/
		
		int age;
		int charge;
		//String person="����";
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		
		
		
		//���� �亯
		/*if (age<=7) {
			charge=1000;
			person="������ �Ƶ�";
		}else if(age<=13) {
			charge=2000;
			person="�ʵ��л�";
		}else if(age<=19) {
			charge=3500;
			person="��,����л�";
		}else {
			charge=5000;
			person="����";
		}
		
		System.out.println(person+" �Դϴ�.  "+ charge+ "�� �����ϼ���.");
		*/
		
		//#2
		if (age <= 7) {
			charge = 1000;
			System.out.println("�����оƵ� �Դϴ�.");
		} else if (age <= 13) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");

		} else if (age <= 19) {
			charge = 3500;
			System.out.println("��,����л� �Դϴ�.");

		} else {
			charge = 5000;
			System.out.println("���� �Դϴ�.");
		}
		System.out.println(charge + "�� �����ϼ���.");

	}

}
