package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		//�л� 2�� ����(studentJames, studentTom)
		StdInfo studentJames = new StdInfo("James",15000);
		StdInfo studentTom = new StdInfo("Tom",12000);
		
		//���� Ÿ��
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);//13600
		//James  ��������
		studentJames.showInfo();
		bus100.showinfo();
		System.out.println("==================================");
		
		//����Ÿ��(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		//Tom ��������
		studentTom.showInfo();
		bus999.showinfo();
		System.out.println("==================================");
		
		//����ö Ÿ��
		Subway subway4=new Subway("4ȣ��"); 
		studentJames.takeSubway(subway4);
		//����Ȯ��
		studentJames.showInfo();
		subway4.showInfo();
		System.out.println("==================================");
		
		Subway subway2=new Subway("2ȣ��");
		studentTom.takeSubway(subway2);
		studentTom.showInfo();
		subway2.showInfo();
		
		
	}

}
