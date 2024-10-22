package chapter05;

import javax.swing.JOptionPane;

public class FuncTest03 {
//선생님꺼 참고해서 비교해보기
	//Display1(stack), Display2(data 영역) 메서드로 출력
	
	public void Display1(String A[]) {
		String res=""; //빈문서
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void Display2(String B[]) {
		for(int j=0;j<B.length;j++) {
			System.out.println(B[j]);
			}
	}
		
	
	
	public static void main(String[] args) {
		
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};

		//stack에서 호출 
		FuncTest03 obj = new FuncTest03();
		obj.Display1(str);
		

		System.out.println("====================================");
		
		//static메서드 호출
		Display2(str);
		
	}

}
