package chapter05;

public class MethodTest04 {

	public static void main(String[] args) {

		int sum = add(5,10);
		double sumDouble = add(3.5,7.2);
		
		System.out.println("�հ�(int): "+sum);
		System.out.println("�հ�(Double): "+sumDouble);

	}
	//�����ε�
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static double add(double a, double b) {
		return a+b; //int sum�� ���� �ʰ� �ٷ� �ϴ� ���
	}
	

}
