package chapter03.iftest;

import javax.swing.JOptionPane;

public class Practice_alone02 {

	public static void main(String[] args) {
		// 
	
		String ID="Lee1125";
		String PW="EJ00";
		
		String id = JOptionPane.showInputDialog("���̵�");

		if (ID.equals(id)) {
			System.out.println("���̵� ��ġ�մϴ�.");
			String pw = JOptionPane.showInputDialog ("��й�ȣ");
			if (PW == pw) {
				System.out.println("�α����� �Ϸ� �Ǿ����ϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

}
