package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		//학생 2명 생성(studentJames, studentTom)
		StdInfo studentJames = new StdInfo("James",15000);
		StdInfo studentTom = new StdInfo("Tom",12000);
		
		//버스 타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);//13600
		//James  정보보기
		studentJames.showInfo();
		bus100.showinfo();
		System.out.println("==================================");
		
		//버스타기(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		//Tom 정보보기
		studentTom.showInfo();
		bus999.showinfo();
		System.out.println("==================================");
		
		//지하철 타기
		Subway subway4=new Subway("4호선"); 
		studentJames.takeSubway(subway4);
		//정보확인
		studentJames.showInfo();
		subway4.showInfo();
		System.out.println("==================================");
		
		Subway subway2=new Subway("2호선");
		studentTom.takeSubway(subway2);
		studentTom.showInfo();
		subway2.showInfo();
		
		
	}

}
