package chapter06;

import java.util.Scanner;

public class UpDownMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//객체생성
		
		Updown updown=new Updown();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			
			select =scan.nextInt();
			check=updown.check(select);
			
			if(check.equals("SUCCESS")) {
				break;
			}
		}
		

	}

}
