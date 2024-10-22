package chapter02;

import java.util.Scanner;

public class Bit_Test15 {

	public static void main(String[] args) {
		// 키보드 입력값 받기
		Scanner scan=new Scanner(System.in);

		System.out.print("첫번째 숫자 입력: ");
		int num1=scan.nextInt();  //0101 입력
		
		System.out.print("두번째 숫자 입력: ");
		int num2=scan.nextInt(); //1010
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		int andResult=num1&num2;  //0
		int orResult=num1|num2;  //15
		int xorResult=num1^num2; //15
		
		System.out.println("비트 And 결과: "+andResult);
		System.out.println("비트 OR 결과: "+orResult);
		System.out.println("비트 XOR 결과: "+xorResult);
	}

}
