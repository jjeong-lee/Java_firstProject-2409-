package chapter03.fortest;

public class Practice_alone01 {

	public static void main(String[] args) {
		// 1���� 100������ 3�� ����� 5�� ����� ����: XX�Դϴ�.
		
		int i;
		int total=0;
		
		for (i=1;i<=100;i++) {
			if ((i%3==0)||(i%5==0)) {
				total+=i;
			}
		}
		
		
		System.out.println("1���� 100������ 3�� ����� 5�� ����� ����: "+total+"�Դϴ�.");
		
	
		
	}

}
