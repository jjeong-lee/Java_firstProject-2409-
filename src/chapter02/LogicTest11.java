package chapter02;

public class LogicTest11 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value=((i=i+2) < 10 && (num1=num1+2)<10);
		System.out.println(i);
		System.out.println(num1);
		System.out.println(value);
		
		System.out.println("===================");
		value=((i=i+2) < 10 || (num1=num1+2)<10); //or연산이기 때문에 첫번째가 False기 때문에 뒤의 값을 계산하지 않음
		System.out.println(i); //6
		System.out.println(num1); //12
		System.out.println(value); //T
	}

}
