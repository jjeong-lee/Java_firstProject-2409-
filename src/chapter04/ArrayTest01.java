package chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 선언방법 number1, number2, number3
		
		int number1[]=new int[5];
		int[] number2=new int[5];
		int number3[];
		number3= new int[5];
		
		//초기화
		//int number4[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] number4= {1,2,3,4,5,6,7,8,9,10};  //new int[]를 생략가능함
		int number5[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<number3.length;i++) {
			System.out.println(number3[i]=(i+1));
		}
		
		
	}

}
