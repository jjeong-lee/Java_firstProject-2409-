package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		//����ڿ��� �˰���� ���ڸ� 1�������� 10���� �Է� �޾�,
		//�ش� ������ �ε����� ã�� ����ϴ� ���α׷��� ���弼��.
		//��, ����ڰ� �Է��� ���� �迭 �ε����� ��Ÿ�� �� ���� ��� ã�� �� ���ٴ� ������ ����ϼ���.
		
		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6};
		int target; //�˰���� ����
		int index =-1; 
		//�迭 ������ ã�� ������ ��� �ʱ�ȭ.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ã�� ���� ���ڸ� 1���� 10���̷� �Է��ϼ���: ");
		target=scan.nextInt();
		
		
		/*���� �亯
		for (int i = 0; i < numbers.length; i++) {
			if (target == numbers[i]) {
				index = i;
				break;
			} else if (target != numbers[i]) {
				index = -1;
				System.out.println("ã�� �� ���� ���� �Դϴ�.");
			}
		}
		System.out.println("ã�� ���ڴ� " + index + "�迭�� �ֽ��ϴ�.");
		*/
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] == target) {
				index=i; //���� ���ڸ� ã���� ���� �����
				break;
			}//if
		}//for
		
		if(index != -1) {
			System.out.println(target+"��(��) "+index+"��° index�� ����.");
		}else {
			System.out.println("�����ͺ��̽��� �������� �ʴ� ���� �Դϴ�.");
		}
		
		
	}

}
