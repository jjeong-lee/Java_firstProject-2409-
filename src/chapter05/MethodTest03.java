package chapter05;

public class MethodTest03 {

	public static void main(String[] args) {
		
		int result = add(5,7); //실매개변수
		System.out.println("Result : "+result);
	}
	
	public static int add(int a, int b) {//int a=5, int b=7
		int sum = a+b;
		//return a+b;
		return sum;  //return 0; 하면 끝나서 종료한다는 의미이다.
	}
	

}
