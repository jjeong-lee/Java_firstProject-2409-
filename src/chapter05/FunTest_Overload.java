package chapter05;

public class FunTest_Overload {

		// �������=�ʵ�=�Ӽ�
		
		
		//������(����Ʈ ����)
		
		
		//�����ε�(�޼����� �Ű������� �ٸ��� �Ͽ� ���� ��Ī�� �޼��� ����)

	public void getResult(int a) {
		System.out.println(a+ "��(��) int �Դϴ�.");	
	}
	public void getResult(char b) {
		System.out.println(b+ "��(��) char �Դϴ�.");		
	}
	public void getResult(String c) {
		System.out.println(c+ "��(��) String �Դϴ�.");
	}
	public void getResult(int d, String e) {
		System.out.println(d+ "��(��) int�̰�, "+e+"��(��) String �Դϴ�.");
	}
	

}
