package chapter06;

import java.security.PublicKey;

public class BuyCoffee {

	public static void main(String[] args) {


		//�� 2���� ����(kim 12000��, park 10000��)
		Customer customer1=new Customer("kim", 12000);
		Customer customer2=new Customer("park", 10000);
		
		//ī�� ����(ī�䰴ü �̸� -> ���̳��� Ŀ��)
		Cafe cafe=new Cafe("���� ���� Ŀ��");
		
		//ī�� �湮(���̳��� Ŀ�� -> kim 4000/ park 4500)

		customer1.visitCafe(cafe, 4000);
		customer2.visitCafe(cafe, 4500);
		
		//ī������
		cafe.showInfo();
		
		//������ ����
		customer1.showInfo();
		customer2.showInfo();
	}

}
