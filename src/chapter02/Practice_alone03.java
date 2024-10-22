package chapter02;

public class Practice_alone03 {

	public static void main(String[] args) {
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기

		int book = 534;
		int students = 30;

		int result1 = book / students;
		int result2 = book % students;

		System.out.println("학생당 가질 수 있는 책권수 : " + result1 +"권");
		System.out.println("남는 책권수 : " + result2 +"권");
	}

}
