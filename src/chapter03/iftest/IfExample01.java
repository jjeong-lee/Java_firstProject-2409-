package chapter03.iftest;

public class IfExample01 {

	public static void main(String[] args) {
		
		int age=5;
		
		//삼항연산자
		//String str=age>=8?"학교에 다닙니다":"학교에 다니지 않습니다";
		
		//# if
		if(age>=8) {
			System.out.println("학교에 다닙니다");
		}
		System.out.println("학교에 다니지 않습니다");
		System.out.println("--------------------------------------------");
		
		//#2 if
		int age2=10;
		if(age2>=8) {
			System.out.println("학교에 다닙니다");
		}else { //그밖에
		System.out.println("학교에 다니지 않습니다");
		}
		
	}

}
