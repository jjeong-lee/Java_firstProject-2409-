package chapter05;

public class Example02 {

	/*�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����ϴ� �޼ҵ带 �����غ�����.*/
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2=20;
		//��ȯ���� �ִ� �޼���
		int total = sum1(num1, num2);
		System.out.println(total);
	
		//��ȯ���� ����
		sum2(num1, num2);
		
		//int sum=a+b;
		
		
	}//main
	
	public static int sum1(int a, int b) {
		return a+b;
	}
	public static void sum2(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	
}//class
