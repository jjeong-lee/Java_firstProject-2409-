package chapter03.switchtest;

public class SwitchCase05 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10) + 1; //0부터 시작되서 +1을 추가
		
		switch (num) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: {
			System.out.println(num + "점 획득");
			break;
		}
	
		default:
			System.out.println("잘못된 숫자입니다.");
		}//switch
	}

}
