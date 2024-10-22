package chapter03.fortest;

import java.util.Scanner;

public class Practice_alone02 {

	public static void main(String[] args) {
		// 정수 n이 주어질 때, n의 팩토리얼을 계산하는 프로그램을 작성하세요.팩토리얼은 n으로 표기되며,
		//n=n*(n-1)*(n-2) *...*... 입니다. 단, 0!=1 입니다.
		
		Scanner scan=new Scanner(System.in);
		
		int n= scan.nextInt();
		int i=1;
		int sum=0;
		
		for (i=(n-1);i==1;i--) {
			System.out.print(n+"="+n+"*"+i);
			sum*=i;
		}
		System.out.println(sum);
	
		
	
		
		
		
		
		
	}

}
