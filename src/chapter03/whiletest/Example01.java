package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/* ����ڰ� "no"�� �Է��ϱ� ������ 
		����ؼ� �޽����� �Է¹ް�, ����ϴ� ���α׷��� ��������.
		(do-while���)*/
		
		Scanner scan= new Scanner(System.in);
		
		
		String inputString;
		
		/*���� �亯
		 * do {
			System.out.println("�޽����� �Է��ϼ���.");
			inputString=scan.nextLine();
			
			if(inputString=="no")
				System.out.println("���α׷��� �����մϴ�.");
				break;
			
			}while(inputString!="no");
			System.out.println("�����Ϸ��� no�� �Է��ϼ���.");
*/
		
		//������ ��
		do {
			System.out.println("> ");
			inputString=scan.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("no"));//no�Է��ϸ� �������
		
		System.out.println();
		System.out.println("���α׷� ����");
		
		
		//�ٸ� �л� �亯
		/*do {
			inputString = scan.next();
			System.out.println(inputString);
			
			if(inputString.equals("no")) {
				break;
			}
			
			}while(true);
			System.out.println("����");
			}
		 */
		
	
	}//main
	

}//class
