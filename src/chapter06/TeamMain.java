package chapter06;

public class TeamMain {

	public static void main(String[] args) {

		TeamGroup team = new TeamGroup();
		
		team.init(); //���� ���� �Է� 
		team.Disp(); //���
		
		TeamMember t=new TeamMember();
		t.setName("�����");
		System.out.println("�����̸�: "+t.getName());
		t.setmPhone("010-1234-5678");
		System.out.println("������ȭ��ȣ: "+t.getmPhone());
		t.setsName("������");
		System.out.println("�������̸�: "+t.getsName());
		t.setName("������");
		System.out.println("�����̸�: "+t.getName());
		t.setName("���ڼ�");
		System.out.println("�����̸�: "+t.getName());
		t.setName("�����");
		System.out.println("�����̸�: "+t.getName());
		

	}

}
