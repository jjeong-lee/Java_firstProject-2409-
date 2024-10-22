package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		(월요일:떡볶이, 화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("뭐 먹을까요? ");
		System.out.println("오늘의 요일을 입력하세요: ");

		String week = scan.next();

		switch (week) {
		case "월":
			System.out.println("삼겹살");
			break;
		case "화":
			System.out.println("떡볶이");
			break;
		case "수":
			System.out.println("마라탕");
			break;
		case "목":
			System.out.println("샐러드");
			break;
		case "금":
			System.out.println("탕수육");
			break;
		case "토":
			System.out.println("감자탕");
			break;
		case "일":
			System.out.println("집밥");
			break;

		default:
			System.err.println("\"월,화,수,목,금,토,일\" 중 입력하세요.");
		}// switch

	}//main

}//class
