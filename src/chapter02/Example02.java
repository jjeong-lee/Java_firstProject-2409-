package chapter02;

public class Example02 {

	public static void main(String[] args) {
		/*soldesk ������
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ��� ������ Ÿ���� float)�� �����Ѵ�.
		 */
		
		//���� ��--->��2�� ��� ����
		int pear=5;
		int apple=7;
		int orange=5;
		
		int allFruits=pear+apple+orange;
		float average=allFruits/24f;
		
		System.out.println("======�ֵ���ũ ������=======");
		System.out.println("�Ϸ翡 ����Ǵ� �� ���� ���� : " +allFruits+"ea");
		System.out.println("�ð��� ��� ���� ���� : " +average+"ea");
		
		System.out.println("===============================================");
		////�� ��
		
		int pear1=5;
		int apple1=7;
		int orange1=5;
		
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����: "+(pear1+apple1+orange1)+"��");
		System.out.println("�ð� �� ��ü ������ ��� ���� ����: "+((float)(pear1+apple1+orange1)/24f)+"��");
		
		
		//#2
		int fruitTotal=pear1+apple1+orange1;
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����: "+fruitTotal+"��");
		
		float fruitAvg=fruitTotal/24f;
		System.out.println("�ð� �� ��ü ������ ��� ���� ����: "+fruitAvg+"��");
	}

}
