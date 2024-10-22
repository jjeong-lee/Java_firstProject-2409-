package chapter03.fortest;

public class Practice_alone01 {

	public static void main(String[] args) {
		// 1부터 100까지의 3의 배수와 5의 배수의 합은: XX입니다.
		
		int i;
		int total=0;
		
		for (i=1;i<=100;i++) {
			if ((i%3==0)||(i%5==0)) {
				total+=i;
			}
		}
		
		
		System.out.println("1부터 100까지의 3의 배수와 5의 배수의 합은: "+total+"입니다.");
		
	
		
	}

}
