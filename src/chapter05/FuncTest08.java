package chapter05;

public class FuncTest08 {

	
	public static void main(String[] args) {

		int num = 10;
		System.out.println("Befor: "+ num);
		changeValue(num); //Call by Value(������ ���޵Ǵ� ���)
		System.out.println("After: "+ num);
	}
	
	
	public static void changeValue(int value) {
		value=20; //valuer���� num�̶�� �Ű������� ���纻�̹Ƿ� �������� ����� ����
		
	}
	

}
