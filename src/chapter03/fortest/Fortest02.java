package chapter03.fortest;

public class Fortest02 {

	public static void main(String[] args) {

		System.out.println("====1���� 100������ ���� ���====");

		int a;
		int sum = 0;

		for (a = 1; a <= 100; a++) {
			System.out.print(a + " ");
			sum += a;
		}

		System.out.println("");
		System.out.println("1���� 100������ �� : " + sum + "�Դϴ�");

	}

}
