package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {


		int javaScore[][]=new int[2][3];
		
		//java점수 3번 입력 받고, 또 점수 3번
		/*나의 답변
		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				javaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("java 점수"));
				System.out.println("javaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
			}

			System.out.println();
		}
		*/
		//다른 학생 답변
		/*
		String score;
		
		for(int i=0;i<javaScore.length;i++) {
			for(int j=0;j<javaScore[i].length;j++) {
				score = JOptionPane.showInputDialog("점수");
				javaScore[i][j] += Integer.parseInt(score);
				System.out.printf("javaScore[%d][%d]:%s  ",i,j,score);
			}System.out.println();
		}
		*/
		
		//선생님 답
		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				// 입력
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("JAVA 점수"));
				// 입력받은 점수를 대입연산을 이용하여 javaScore방에 저장
				javaScore[i][j] = jumsu;
				System.out.println("JavaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
			}

		}
	}//m
}//c
