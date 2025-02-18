package chapter06;

public class StdInfo {

	//멤버변수=필드
	public String studentName;
	public int grade;
	public int money;//1400
	
	//생성자 오버로딩(studentName, money)
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	//버스
	public void takeBus(Bus bus) {
		bus.take(1400);//버스회사 수입과 승객증가
		this.money-=1400;//학생지출
	}
	//지하철
	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money-=1800;
	}
	
	//잔액
	public void showInfo() {
		System.out.println(studentName+"님의 남은 잔액은: "+money+"원 입니다.");
	}
	
	
}
