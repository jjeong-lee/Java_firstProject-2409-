package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է� �ް�,
				// ������ ����� ���Ͻÿ�.(��, ����� �Ǽ��� ����� ��)

		//�ڷ� ����
		
		
				Scanner scan = new Scanner(System.in);

				int i, sum = 0, cnt = 0, score;
				double avg = 0;

				System.out.print("�� ���� ������ �˰� �����Ű���? ");
				
				//cnt=scan.nextInt();// �� ��
				
				for(i=1;i<=scan.nextInt();i++) {
					System.out.println(i+"��° ���� �Է�");
					score=scan.nextInt();
				}
			

	}

}
