package chapter03.fortest;

public class Fortest04 {

	public static void main(String[] args) {
		System.out.println("===0���� 100������ �� �� Ȧ���� ���� ���===");

		//�����Բ��� �ٽ� ���� ���ϱ�!
		int num;
		int total = 0;

		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				continue;// �׳� ������(����)
			}
		}
		System.out.print(num);
		total += num;

		System.out.println();
		System.out.println("0���� 100������ �� �� Ȧ���� ��: " + total);

		/*
		 * int num; int total = 0;
		 * 
		 * for (num = 0; num <= 100; num++) { if (num % 2 == 1) { total += num; } }
		 * System.out.println(total);
		 * 
		 */

	}

}
