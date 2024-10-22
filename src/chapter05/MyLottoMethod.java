package chapter05;

import javax.swing.JOptionPane;

public class MyLottoMethod {
//복습 복습 복습 복습 복습 !!!!!!!
	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요."));

		int cnt = 0;
		System.out.println("==== 이번주 로또 예상번호 ====");
		while (number > cnt) {

			System.out.println("[" + (cnt + 1) + "]");
			int[] lotto = new int[6];
			int index = 0;
			
			while (index < 6) {
				int num = (int) (Math.random() * 45) + 1;
				// int res=contains(lotto, num) -> false
				if (!contains(lotto, num)) { // 중복체크하는 메서드 호출 //lotto t= int[] arr, num
					lotto[index++] = num;
				} // if
			} // while
				// 출력
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
			cnt++;
		} // while
	}// main

	// 중복체크해주는 메소드
	public static boolean contains(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) { // 배열방에 있는 숫자==방금 받은 숫자   //enhancedFor문 > i라는 방에 배열에 있던 요소만 가져옴. 배열을 가져오는것 x
				return true; // 중복값이 있다
			} // if
		} // for
		return false;// 중복값이 없다
	}// contains

}// class

/*
 * for(int i=0;i<arr.length;i++){
 * 	if(arr[i] == num)
 * 
 */
 

