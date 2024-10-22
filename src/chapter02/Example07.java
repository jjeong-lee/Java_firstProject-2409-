package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		//한 자릿수 숫자를 입력받아 (scan)
		//숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)


		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오(한 자릿수) : ");
		int num1= scan.nextInt();
		
		boolean isresult = ((num1%2)==1);
		
		System.out.println(isresult?"홀수":"짝수");
		
		//선생님 답안 다시 가져가서 복습하기
		
		

	}

}
