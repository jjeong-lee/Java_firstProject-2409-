package chapter03.whiletest;

public class Practice_alone01 {

	public static void main(String[] args) {
		// 1���� 100������ ���� �߿��� 3�� ����� 5�� ����� ��� ���ϴ� ���α׷��� �ۼ��ϼ���. while���� ����ؾ� �մϴ�.
	
		int i=1;
		int sum=0;
		
		while (i<=100) {
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	
	
	}
	//Ǯ���

}
