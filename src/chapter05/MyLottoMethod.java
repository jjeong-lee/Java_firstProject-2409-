package chapter05;

import javax.swing.JOptionPane;

public class MyLottoMethod {
//���� ���� ���� ���� ���� !!!!!!!
	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���."));

		int cnt = 0;
		System.out.println("==== �̹��� �ζ� �����ȣ ====");
		while (number > cnt) {

			System.out.println("[" + (cnt + 1) + "]");
			int[] lotto = new int[6];
			int index = 0;
			
			while (index < 6) {
				int num = (int) (Math.random() * 45) + 1;
				// int res=contains(lotto, num) -> false
				if (!contains(lotto, num)) { // �ߺ�üũ�ϴ� �޼��� ȣ�� //lotto t= int[] arr, num
					lotto[index++] = num;
				} // if
			} // while
				// ���
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
			cnt++;
		} // while
	}// main

	// �ߺ�üũ���ִ� �޼ҵ�
	public static boolean contains(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) { // �迭�濡 �ִ� ����==��� ���� ����   //enhancedFor�� > i��� �濡 �迭�� �ִ� ��Ҹ� ������. �迭�� �������°� x
				return true; // �ߺ����� �ִ�
			} // if
		} // for
		return false;// �ߺ����� ����
	}// contains

}// class

/*
 * for(int i=0;i<arr.length;i++){
 * 	if(arr[i] == num)
 * 
 */
 

