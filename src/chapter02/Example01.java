package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
		
		int books=534;
		int students=30;
		
		//학생당 한 명이 가지는 책의 수
		int booksPerStudents=(books/students);
		System.out.println(booksPerStudents);
		//남은 책의 수
		int bookLeft=(books % students);
		System.out.println(bookLeft);

		
		//다른 사람들 답변 모음
		int students1 = 30;
		int books1 = 534;
		
		System.out.println("가져간 책의 갯수 :"+(double)(books1/students1));
		System.out.println("남은 책의 갯수 :"+(double)(books1%students1));
		
		
		//
		int books2 = 534;
		int students2 = 30;

		int a = books2 / students2;
		int b = books2 % students2;

		System.out.println("몫은 "+a+"개 입니다");
		System.out.println("나머지는 "+b+"개 입니다");
		
		//
		int books3 = 534;
		int students3 = 30;
		int division = books3/students3;
		double rest = books3% students3;
		System.out.println("학생당 가지는 권 수: " + division);
		System.out.println("나머지: " + rest);
	}

}
