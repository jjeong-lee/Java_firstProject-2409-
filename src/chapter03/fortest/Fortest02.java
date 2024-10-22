package chapter03.fortest;

public class Fortest02 {

	public static void main(String[] args) {

		System.out.println("====1부터 100까지의 합을 출력====");

		int a;
		int sum = 0;

		for (a = 1; a <= 100; a++) {
			System.out.print(a + " ");
			sum += a;
		}

		System.out.println("");
		System.out.println("1부터 100까지의 합 : " + sum + "입니다");

	}

}
