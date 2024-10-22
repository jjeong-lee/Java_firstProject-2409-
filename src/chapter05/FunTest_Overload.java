package chapter05;

public class FunTest_Overload {

		// 멤버변수=필드=속성
		
		
		//생성자(디폴트 생략)
		
		
		//오버로딩(메서드의 매개변수를 다르게 하여 같은 명칭의 메서드 생성)

	public void getResult(int a) {
		System.out.println(a+ "은(는) int 입니다.");	
	}
	public void getResult(char b) {
		System.out.println(b+ "은(는) char 입니다.");		
	}
	public void getResult(String c) {
		System.out.println(c+ "은(는) String 입니다.");
	}
	public void getResult(int d, String e) {
		System.out.println(d+ "은(는) int이고, "+e+"은(는) String 입니다.");
	}
	

}
