package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/* 사용자가 "no"를 입력하기 전까지 
		계속해서 메시지를 입력받고, 출력하는 프로그램을 만들어보세요.
		(do-while사용)*/
		
		Scanner scan= new Scanner(System.in);
		
		
		String inputString;
		
		/*나의 답변
		 * do {
			System.out.println("메시지를 입력하세요.");
			inputString=scan.nextLine();
			
			if(inputString=="no")
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}while(inputString!="no");
			System.out.println("종료하려면 no를 입력하세요.");
*/
		
		//선생님 답
		do {
			System.out.println("> ");
			inputString=scan.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("no"));//no입력하면 실행멈춤
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		
		//다른 학생 답변
		/*do {
			inputString = scan.next();
			System.out.println(inputString);
			
			if(inputString.equals("no")) {
				break;
			}
			
			}while(true);
			System.out.println("종료");
			}
		 */
		
	
	}//main
	

}//class
