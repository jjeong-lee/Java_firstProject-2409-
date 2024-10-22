package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	//EduStep 메서드 구현
	public static void EduStep(int num) {
		if(num==1) {
			System.out.println("당신은 단계는 상입니다.");
		}else if(num==2) {
			System.out.println("당신의 단계는 중입니다.");
		}else if(num==3) {
			System.out.println("당신의 단계는 하입니다.");
		}else
			System.out.println("1~3중에 입력하세요.");
 		}//if

	public static void main(String[] args) {
		
		////사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scan= new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number=scan.nextInt();
		
		EduStep(number); //number는 실 매개변수
		
	}

}
