package chapter06;

import java.util.Calendar;

public class EnumWeekMain {

	public static void main(String[] args) {

		Week today = null;  //static 
		Calendar cal = Calendar.getInstance(); //한국의 현재 요일 static으로 이미 만들어져 있음.
		int week = cal.get(Calendar.DAY_OF_WEEK);//1~7
		
		switch (week) {
		case 1: {
			today=Week.SUNDAY;
			break;
		}
		case 2: {
			today=Week.MONDAY;
			break;
		}
		case 3: {
			today=Week.TUESDAY;
			break;
		}
		case 4: {
			today=Week.WEDNESDAY;
			break;
		}
		case 5: {
			today=Week.THURSDAY;
			break;
		}
		case 6: {
			today=Week.FRIDAY;
			break;
		}
		case 7: {
			today=Week.SATURDAY;
			break;
		}
		}//switch
		System.out.println("오늘의 요일: "+today);
		
		if(today==Week.SATURDAY) {
			System.out.println("설이랑 놀기");
		}else {
			System.out.println("정처기 공부");
		}
		
	}

}
