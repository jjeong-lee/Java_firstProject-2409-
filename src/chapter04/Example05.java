package chapter04;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		//학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		boolean run=true;
		
		int studentNum=0; //학생수
		int[] score=null; //int[] score=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo= Integer.parseInt(scan.nextLine());
			if(selectNo==1) {
				System.out.println("학생수> ");
				studentNum=Integer.parseInt(scan.nextLine());
				score=new int[studentNum]; //메모리 확보 ->2
			}else if(selectNo==2) {
				/*
				if (score==null) {
					System.out.println("먼저 학생수를 입력하고 오세요.");
					continue;
				}*/
				for(int i=0;i<score.length;i++) {
					System.out.println("score["+(i+1)+"] >");
					score[i]=Integer.parseInt(scan.nextLine()); //score배열방에 요소 추가
				}
			}else if(selectNo==3) {
				/*
				if(score==null) {
					System.out.println("점수가 입력되지 않았습니다.");
					continue;
				}*/
				System.out.println("<점수 리스트>");
				for(int i=0;i<score.length;i++) {
					System.out.println((i+1)+"번 학생: "+score[i]+"점");
				}
			}else if(selectNo==4) {
				/*
				if(score==null) {
					System.out.println("입력값이 없습니다.");
					continue;
				}*/
				int sum=0;
				int max=0;
				double avg=0.0;
				
				for(int i=0;i<score.length;i++) {
					max=max<score[i]?score[i]:max; //삼항연산자 사용
					/*삼항연산자 대신 if문을 사용해도 됨
					 *  if(max<score[i]){
					 * max=score[i];
					 * }
					 */
					sum += score[i];
				} 
				avg=(double)sum/studentNum;
				System.out.println("학생들 중 최대 점수는 : "+max+"점 입니다.");
				System.out.println("학생들의 점수의 총점은 : "+sum+"점 입니다.");
				//System.out.printf("학생들의 점수의 평균은 : %.2f",avg+"점 입니다.");//옆의 방법이나, string.format사용
				System.out.println(String.format("학생들의 점수의 평균 : %.2f",avg));  //c언어 프린트f 문법
				
			}else {
				run=false;
			}//if
			
		}//while
		System.out.println("프로그램 종료");
		
	}//main

}//class
