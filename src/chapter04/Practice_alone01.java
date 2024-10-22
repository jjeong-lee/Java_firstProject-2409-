package chapter04;

public class Practice_alone01 {

	public static void main(String[] args) {
		
		char space[]=new char[5];
		char alpa='A';
		
		for(int i=0;i<space.length;i++) {
			space[i]=alpa;
			alpa++;
			System.out.print(space[i]+" ( ) ");
			alpa++;
		}
		
		
		
	}

}
