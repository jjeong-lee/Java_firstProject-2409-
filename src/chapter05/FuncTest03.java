package chapter05;

import javax.swing.JOptionPane;

public class FuncTest03 {
//�����Բ� �����ؼ� ���غ���
	//Display1(stack), Display2(data ����) �޼���� ���
	
	public void Display1(String A[]) {
		String res=""; //�󹮼�
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

		//stack���� ȣ�� 
		FuncTest03 obj = new FuncTest03();
		obj.Display1(str);
		

		System.out.println("====================================");
		
		//static�޼��� ȣ��
		Display2(str);
		
	}

}
