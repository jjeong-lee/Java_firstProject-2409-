package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		//������ �����ε��� �̿��� ������� �ʱ�ȭ(1004,"�ֹ鼳", 1, "�ϻ�")
		
		StudentInfo studentchoi = new StudentInfo(1004, "�ֹ鼳", 1, "�ϻ�");
		System.out.println(studentchoi.address);
		//System.out.println(stidentchoi.studentName);//private �̿��� ��� �Ұ���
		System.out.println(studentchoi.getStudentName());
		
		//�⺻ �����ڷ� ��ü ����
		StudentInfo studentlee = new StudentInfo();
		//�������� �ʱ�ȭ
		studentlee.address="���α�";
		System.out.println(studentlee.address);
		
		
		//�⺻�����ڷ� ��ü����
		StudentInfo studentkim = new StudentInfo();
		//getters and setters �̿� //�����ͺ��̽� �����Ǿ������� �����
		studentkim.setStudentName("�����");
		String sname = studentkim.getStudentName();
		System.out.println(sname);
		
	}

}
