package chapter02;

import java.util.Scanner;

public class Practice_alone02 {

	public static void main(String[] args) {
		//
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("���� ���ݾ�(����) : ");
		long total=scan.nextLong();
	
		
		boolean isGrade= total>=500;
		
	
		System.out.print("������ ����� "+ (isGrade?"VIP":"Green")+" �Դϴ�.");
		
	}

}
