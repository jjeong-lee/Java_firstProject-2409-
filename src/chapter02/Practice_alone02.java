package chapter02;

import java.util.Scanner;

public class Practice_alone02 {

	public static void main(String[] args) {
		//
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("연간 사용금액(만원) : ");
		long total=scan.nextLong();
	
		
		boolean isGrade= total>=500;
		
	
		System.out.print("귀하의 등급은 "+ (isGrade?"VIP":"Green")+" 입니다.");
		
	}

}
