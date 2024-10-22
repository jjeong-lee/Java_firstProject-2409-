package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		boolean run=true;
		int balance=0; //예금(+), 출금(-)

		Scanner scan=new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			
			//nextLine()로 받으면 엔터로 발생되는 줄을 무시
			int menuNum=Integer.parseInt(scan.nextLine());
			//nextInt()로 받으면 정수지만 엔터를 입력하면 한줄의 문자열까지 입력됨
			//int menuNum=scan.nextInt(); //int는 enter까지 함께 인식해버림.
			
			
			switch (menuNum) {
			case 1:
				System.out.println("예금액 > ");
				int money=Integer.parseInt(scan.nextLine());
				balance+=money;
				break;
			case 2:
				System.out.println("출금액 > ");
				int money2=Integer.parseInt(scan.nextLine());
				balance-=money2;
				break;
			case 3:
				System.out.println("잔고 > ");
				System.out.print(balance);
				break;
			case 4:
				run=false;
				break;
				
			}//switch
			System.out.println();

		}//while
		System.out.println("프로그램을 종료합니다.");
	}//main

}//class
