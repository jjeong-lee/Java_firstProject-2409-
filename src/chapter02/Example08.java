package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오 : ");
		int num1=scan.nextInt();
		System.out.println("위의 수를 제외한 두번째 숫자를 입력하시오 : ");
		int num2=scan.nextInt();
		
		boolean bigger=num1>num2;
		
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가? "+bigger);
		
		//나의 답(삼항연산자 활용)   System.out.println(bigger?"크다":"작다");
		
		
	}

}
