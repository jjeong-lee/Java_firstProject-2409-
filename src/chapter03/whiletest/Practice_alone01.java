package chapter03.whiletest;

public class Practice_alone01 {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자 중에서 3의 배수와 5의 배수를 모두 더하는 프로그램을 작성하세요. while문을 사용해야 합니다.
	
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
	//풀어보기

}
