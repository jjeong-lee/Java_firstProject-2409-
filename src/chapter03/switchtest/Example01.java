package chapter03.switchtest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/*사용자로부터 월을 입력받아, 해당 월의 계절을 출력하는 프로그램을 작성하세요.
		 * 봄:3-5월, 여름:6-8월, 가을:9-11월, 겨울: 12-2월*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계절 계산기 : ");
		
		int month=scan.nextInt();
		String season;
		
		switch (month) {
		case 3: case 4: case 5: {
			season="봄";
			break;
		}
		case 6: case 7: case 8: {
			season="여름";
			break;
		}
		case 9: case 10: case 11: {
			season="가을";
			break;
		}
		case 12: case 1: case 2: {
			season="겨울";
			break;
		}
		default:
			season=" 존재하지 않는 계절";
			System.err.println("입력오류");
		}
		System.out.println("해당하는 계절은"+ season +"입니다.");
	}
	

}
