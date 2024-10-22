package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받고,
				// 총점과 평균을 구하시오.(단, 평균은 실수로 출력할 것)

		//자료 참고
		
		
				Scanner scan = new Scanner(System.in);

				int i, sum = 0, cnt = 0, score;
				double avg = 0;

				System.out.print("몇 명의 성적을 알고 싶으신가요? ");
				
				//cnt=scan.nextInt();// 몇 명
				
				for(i=1;i<=scan.nextInt();i++) {
					System.out.println(i+"번째 성적 입력");
					score=scan.nextInt();
				}
			

	}

}
