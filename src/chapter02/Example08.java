package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��°(num1) ���ڰ� �� ��°(num2) ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ� : ");
		int num1=scan.nextInt();
		System.out.println("���� ���� ������ �ι�° ���ڸ� �Է��Ͻÿ� : ");
		int num2=scan.nextInt();
		
		boolean bigger=num1>num2;
		
		System.out.println("ù��° ���ڰ� �ι�° ���ں��� ū��? "+bigger);
		
		//���� ��(���׿����� Ȱ��)   System.out.println(bigger?"ũ��":"�۴�");
		
		
	}

}
