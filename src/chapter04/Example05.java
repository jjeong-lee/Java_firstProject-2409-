package chapter04;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		//�л����� �Է¹޾�, ������ �Է��ϰ� ��������Ʈ�� ����ϰ� ������ ����� �м��ϴ� ������Ʈ
		boolean run=true;
		
		int studentNum=0; //�л���
		int[] score=null; //int[] score=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo= Integer.parseInt(scan.nextLine());
			if(selectNo==1) {
				System.out.println("�л���> ");
				studentNum=Integer.parseInt(scan.nextLine());
				score=new int[studentNum]; //�޸� Ȯ�� ->2
			}else if(selectNo==2) {
				/*
				if (score==null) {
					System.out.println("���� �л����� �Է��ϰ� ������.");
					continue;
				}*/
				for(int i=0;i<score.length;i++) {
					System.out.println("score["+(i+1)+"] >");
					score[i]=Integer.parseInt(scan.nextLine()); //score�迭�濡 ��� �߰�
				}
			}else if(selectNo==3) {
				/*
				if(score==null) {
					System.out.println("������ �Էµ��� �ʾҽ��ϴ�.");
					continue;
				}*/
				System.out.println("<���� ����Ʈ>");
				for(int i=0;i<score.length;i++) {
					System.out.println((i+1)+"�� �л�: "+score[i]+"��");
				}
			}else if(selectNo==4) {
				/*
				if(score==null) {
					System.out.println("�Է°��� �����ϴ�.");
					continue;
				}*/
				int sum=0;
				int max=0;
				double avg=0.0;
				
				for(int i=0;i<score.length;i++) {
					max=max<score[i]?score[i]:max; //���׿����� ���
					/*���׿����� ��� if���� ����ص� ��
					 *  if(max<score[i]){
					 * max=score[i];
					 * }
					 */
					sum += score[i];
				} 
				avg=(double)sum/studentNum;
				System.out.println("�л��� �� �ִ� ������ : "+max+"�� �Դϴ�.");
				System.out.println("�л����� ������ ������ : "+sum+"�� �Դϴ�.");
				//System.out.printf("�л����� ������ ����� : %.2f",avg+"�� �Դϴ�.");//���� ����̳�, string.format���
				System.out.println(String.format("�л����� ������ ��� : %.2f",avg));  //c��� ����Ʈf ����
				
			}else {
				run=false;
			}//if
			
		}//while
		System.out.println("���α׷� ����");
		
	}//main

}//class
