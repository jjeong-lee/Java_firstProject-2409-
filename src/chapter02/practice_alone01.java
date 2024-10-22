package chapter02;

import java.util.Scanner;

public class practice_alone01 {

	public static void main(String[] args) {
		//연습  (연산과 스캔이용)
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("반지름 : ");
		double num1=scan.nextInt();
		double pi=3.14;
		
		double result=num1*num1*pi;
		System.out.println("원의 넓이 : "+ (int)result);
		
		
		
		
	}

}
