package chapter04;

public class Example02 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } }; // 3�� x��
		/*
		 * {95,86} 0=>1�� {83,92,96} 1=>2�� {78,83,93,87,88} 2=>3��
		 */

		double avg = 0; // �� ���� ���
		double totalavg = 0; // ��ü ����� ���
		int total = 0; // �� ���� ��
		int alltotal = 0; // ��ü
		int count = 0; // ��ü ����� ����
		// array.length : 3
		// for���� �̿� -> �� ���� �����ͼ� ������ ���� �о sum�� �����ϰ�(count++) ��ձ��� ���Ͽ� ���

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j]; // array[1][0],array[1][1],array[1][2]
				count++; // ��ü ��տ� ���� ī��Ʈ
			} // for

			alltotal += total;
			avg = (double) total / array[i].length;
			System.out.println((i + 1) + "���� ��: " + total);
			System.out.println((i + 1) + "���� ���: " + avg);
			System.out.println("==============");
			total = 0; // ���� ���� ����� ���ؼ� �����Ⱚ�� ����.

		} // for
		System.out.println("��ü ���� ��: " + alltotal);
		totalavg = (double) alltotal / count;
		System.out.println("��ü �������� ��: " + totalavg);
	}

}
