package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		
		int age;
		int charge;
		//String person="구분";
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		
		
		//나의 답변
		/*if (age<=7) {
			charge=1000;
			person="미취학 아동";
		}else if(age<=13) {
			charge=2000;
			person="초등학생";
		}else if(age<=19) {
			charge=3500;
			person="중,고등학생";
		}else {
			charge=5000;
			person="성인";
		}
		
		System.out.println(person+" 입니다.  "+ charge+ "을 지불하세요.");
		*/
		
		//#2
		if (age <= 7) {
			charge = 1000;
			System.out.println("미취학아동 입니다.");
		} else if (age <= 13) {
			charge = 2000;
			System.out.println("초등학생 입니다.");

		} else if (age <= 19) {
			charge = 3500;
			System.out.println("중,고등학생 입니다.");

		} else {
			charge = 5000;
			System.out.println("성인 입니다.");
		}
		System.out.println(charge + "을 지불하세요.");

	}

}
