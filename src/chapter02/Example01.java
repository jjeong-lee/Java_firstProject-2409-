package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534���� å(books)�� �л�(students) 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���
		
		int books=534;
		int students=30;
		
		//�л��� �� ���� ������ å�� ��
		int booksPerStudents=(books/students);
		System.out.println(booksPerStudents);
		//���� å�� ��
		int bookLeft=(books % students);
		System.out.println(bookLeft);

		
		//�ٸ� ����� �亯 ����
		int students1 = 30;
		int books1 = 534;
		
		System.out.println("������ å�� ���� :"+(double)(books1/students1));
		System.out.println("���� å�� ���� :"+(double)(books1%students1));
		
		
		//
		int books2 = 534;
		int students2 = 30;

		int a = books2 / students2;
		int b = books2 % students2;

		System.out.println("���� "+a+"�� �Դϴ�");
		System.out.println("�������� "+b+"�� �Դϴ�");
		
		//
		int books3 = 534;
		int students3 = 30;
		int division = books3/students3;
		double rest = books3% students3;
		System.out.println("�л��� ������ �� ��: " + division);
		System.out.println("������: " + rest);
	}

}
