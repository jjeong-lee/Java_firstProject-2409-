package chapter05;

import java.util.Scanner;

public class Method {
	
	//메서드의 오버로딩 기법
	//메서드1
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}
	//메서드2
	void makeBread(int cnt) {
		for(int a=1;a<=cnt;a++) {
			System.out.println("빵"+cnt+"개");
		}
		System.out.println("빵"+cnt+"개가 완성 되었습니다.");
	
	}
	//메서드3
	void makeBread(int cnt, String name) {
		for(int b=1;b<=cnt;b++) {
			System.out.println(name+"빵"+cnt+"개");
		}
		System.out.println("요청하신 "+cnt+"개의 "+name+"빵이 완성 되었습니다.");
	}
	
	
	//------------------------------
	
	void order() {
		
		boolean run=true;
		Scanner scan= new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			
			int input_num=Integer.parseInt(scan.nextLine());
			switch (input_num) {
			case 1: 
				System.out.print("빵 개수를 입력");
				int cnt1=Integer.parseInt(scan.nextLine());
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("빵 개수를 입력");
				int cnt2=Integer.parseInt(scan.nextLine());
				System.out.print("빵 종류를 입력");
				String breadname=scan.nextLine();
				makeBread(cnt2, breadname);
				break;
			case 3:
				System.out.println("종료 선택");
				run=false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}//switch
		}//while
		System.out.println("프로그램 종료");
	}
	}

