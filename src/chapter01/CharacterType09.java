package chapter01;

public class CharacterType09 {

	public static void main(String[] args) {
		// A:65 a:97 ASCII => �ڵ�
		
		int a=65;
		System.out.println(a);
		System.out.println("��Ģ����(+):"+(a+10));
		
		System.out.println("----------------");
		//����� ����ȯ  => int-> char : ������ ASCII�� ��ȯ�Ѵ� 
		System.out.println((char)a);
		System.out.println("----------------");
		//B�� ������
		System.out.println((char)(a+1));
	
		int b=66;
		System.out.println((char)b);
		System.out.println((char)66);
		//
		
		System.out.println("----------------");
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
	}

}
