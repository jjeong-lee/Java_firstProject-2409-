package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		int num, cnt=0, sum=0;
		double avg;
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			num=scan.nextInt();
			
			if(num==0) {
				break;
			}
			cnt++; //숫자가 몇개 입력되었는지 체크
			sum+=num;//sum= sum+num 누적합
		}//while
		
		avg=(double)sum/cnt;
		
		System.out.print("입력된 숫자의 갯수: "+cnt+"\n");
		System.out.print("입력된 숫자의 합계: "+sum+"\n");
		System.out.print("입력된 숫자의 평균: "+Math.round(avg*1000.0)/1000+"\n");
		System.out.printf("입력된 숫자의 평균: %.3f",avg);//소수점 셋째자리까지만 표현하는 법 %.3 f(flaot) [c언어]
		
	}//main
	

}//class
