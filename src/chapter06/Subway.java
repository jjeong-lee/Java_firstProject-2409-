package chapter06;

public class Subway {

	
	//�������
	 public String lineNumber;
	 public int passengerCount;
	 public int money;
	 
	 //������ lineNumber �ʱ�ȭ
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	 
	 //take �޼���
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	 public void showInfo() {
		 System.out.println("����ö" + lineNumber+"�� �°��� "+passengerCount+	
				 			"���̰�, ������ "+money+"���Դϴ�.");
	 }
}
