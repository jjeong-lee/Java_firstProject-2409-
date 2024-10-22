package chapter06;

import java.security.PublicKey;

public class BuyCoffee {

	public static void main(String[] args) {


		//고객 2명을 생성(kim 12000원, park 10000원)
		Customer customer1=new Customer("kim", 12000);
		Customer customer2=new Customer("park", 10000);
		
		//카페 생성(카페객체 이름 -> 힘이나는 커피)
		Cafe cafe=new Cafe("힘이 나는 커피");
		
		//카페 방문(힘이나는 커피 -> kim 4000/ park 4500)

		customer1.visitCafe(cafe, 4000);
		customer2.visitCafe(cafe, 4500);
		
		//카페정보
		cafe.showInfo();
		
		//고객들의 정보
		customer1.showInfo();
		customer2.showInfo();
	}

}
