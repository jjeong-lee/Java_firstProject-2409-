package chapter03.fortest;

import java.util.Scanner;

public class Practice_alone02 {

	public static void main(String[] args) {
		// ���� n�� �־��� ��, n�� ���丮���� ����ϴ� ���α׷��� �ۼ��ϼ���.���丮���� n���� ǥ��Ǹ�,
		//n=n*(n-1)*(n-2) *...*... �Դϴ�. ��, 0!=1 �Դϴ�.
		
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
