package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {


		int javaScore[][]=new int[2][3];
		
		//java���� 3�� �Է� �ް�, �� ���� 3��
		/*���� �亯
		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				javaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("java ����"));
				System.out.println("javaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
			}

			System.out.println();
		}
		*/
		//�ٸ� �л� �亯
		/*
		String score;
		
		for(int i=0;i<javaScore.length;i++) {
			for(int j=0;j<javaScore[i].length;j++) {
				score = JOptionPane.showInputDialog("����");
				javaScore[i][j] += Integer.parseInt(score);
				System.out.printf("javaScore[%d][%d]:%s  ",i,j,score);
			}System.out.println();
		}
		*/
		
		//������ ��
		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				// �Է�
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("JAVA ����"));
				// �Է¹��� ������ ���Կ����� �̿��Ͽ� javaScore�濡 ����
				javaScore[i][j] = jumsu;
				System.out.println("JavaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
			}

		}
	}//m
}//c
