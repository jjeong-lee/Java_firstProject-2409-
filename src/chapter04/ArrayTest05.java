package chapter04;

public class ArrayTest05 {

	public static void main(String[] args) {
		//ArrayTest04�� ������ size�� �̿��Ͽ��� �ϴ¹�
		
		double[] data = new double[5];
		int size=0;

		// 3���� ���Կ���
		data[0] = 10.0;
		size++;//0
		data[1] = 20.0;
		size++;//1
		data[2] = 30.0;
		size++;//2
		

		double total = 1.0;
		
		//System.out.println(size);;//3
		for (int i = 0; i < size; i++) { //data[0]data[1]data[2]
			System.out.println(data[i]);
			total *= data[i];
		}
		System.out.println("total: " + total);

	}

}
