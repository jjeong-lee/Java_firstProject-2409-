package chapter07;

public class ThisExample {

	public static void main(String[] args) {
		//생성자의 초기화
		ThisEx birth1 = new ThisEx();
		//setter
		birth1.printThis(); //객체의 주소 반환
		birth1.setYear(2024);
		birth1.setMonth(10);
		birth1.setDay(7);
	
		System.out.println("생년월일: "+birth1.year +"."+ birth1.month +"."+ birth1.day);
		
		//생성자의 초기화
		ThisEx birth2 = new ThisEx(25,11,1997);
		birth2.printThis();
		System.out.println("생년월일: "+birth2.year +"."+ birth2.month +"."+ birth2.day);
		
		//생성자의 초기화
		ThisEx birth3 = new ThisEx(25,11,1997);
		birth3.printThis();
		System.out.println("getter 이용 ");
		System.out.print("생년월일: ");
		System.out.print(birth3.getYear());
		System.out.print(birth3.getMonth());
		System.out.print(birth3.getDay());
	}
}
