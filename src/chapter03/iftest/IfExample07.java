package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {
		// IfExample06���� ��ĵ���� �����
		
		Scanner scan=new Scanner(System.in);
		
		String ID="soldesk";
		int PW=240910;
		
		System.out.println("���̵� : ");
		String id = scan.nextLine();

		if (ID.equals(id)) {
			// ��й�ȣ
			System.out.println("��й�ȣ : ");
			int pass = scan.nextInt();
			if (PW == pass) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
		}

	}

}
