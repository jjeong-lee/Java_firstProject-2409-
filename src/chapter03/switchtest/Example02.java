package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		����ڷκ��� ������ �Է¹޾�(1~7) �ش� ���Ͽ� � ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������:������, ȭ����:���İ�Ƽ,------,�Ͽ���:�ʹ�)-->�������� �԰������ �ƹ��ų� 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �������? ");
		System.out.println("������ ������ �Է��ϼ���: ");

		String week = scan.next();

		switch (week) {
		case "��":
			System.out.println("����");
			break;
		case "ȭ":
			System.out.println("������");
			break;
		case "��":
			System.out.println("������");
			break;
		case "��":
			System.out.println("������");
			break;
		case "��":
			System.out.println("������");
			break;
		case "��":
			System.out.println("������");
			break;
		case "��":
			System.out.println("����");
			break;

		default:
			System.err.println("\"��,ȭ,��,��,��,��,��\" �� �Է��ϼ���.");
		}// switch

	}//main

}//class
