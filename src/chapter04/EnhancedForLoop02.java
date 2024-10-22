package chapter04;

public class EnhancedForLoop02 {

	public static void main(String[] args) {


		int numbers[]= {10,20,30,40,50};
		
		for(int numb : numbers) {
			System.out.print(numb+" ");
		}
		System.out.println();
		System.out.println("==============================");
		
		int num[]= {5,10,15,20,25};
		int sum=0;
		
		for(int num2 : num) {
			System.out.print(num2+" ");
			sum+=num2;
		}
		System.out.println();
		System.out.println("гу╟Х: "+sum);
		

	}

}
