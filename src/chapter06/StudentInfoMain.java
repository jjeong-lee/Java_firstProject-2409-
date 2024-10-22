package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		//생성자 오버로딩을 이용한 멤버변수 초기화(1004,"최백설", 1, "일산")
		
		StudentInfo studentchoi = new StudentInfo(1004, "최백설", 1, "일산");
		System.out.println(studentchoi.address);
		//System.out.println(stidentchoi.studentName);//private 이여서 사용 불가능
		System.out.println(studentchoi.getStudentName());
		
		//기본 생성자로 객체 생성
		StudentInfo studentlee = new StudentInfo();
		//직관적인 초기화
		studentlee.address="종로구";
		System.out.println(studentlee.address);
		
		
		//기본생성자로 객체생성
		StudentInfo studentkim = new StudentInfo();
		//getters and setters 이용 //데이터베이스 연동되어있을때 사용함
		studentkim.setStudentName("김원기");
		String sname = studentkim.getStudentName();
		System.out.println(sname);
		
	}

}
