package chapter03.fortest;

public class ForTest06 {

	public static void main(String[] args) {
		//1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요
		
		int i;
		int total=0;
		
		
		for (i=1;i<=33;i++) {
			total+=(i*3);
		}
		System.out.println("3의 배수의 합 : "+total);
		
	}

}
