package chapter02;

public class Example02 {

	public static void main(String[] args) {
		/*soldesk 과수원
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 */
		
		//나의 답--->샘2번 답과 동일
		int pear=5;
		int apple=7;
		int orange=5;
		
		int allFruits=pear+apple+orange;
		float average=allFruits/24f;
		
		System.out.println("======솔데스크 과수원=======");
		System.out.println("하루에 생산되는 총 과일 갯수 : " +allFruits+"ea");
		System.out.println("시간당 평균 생산 갯수 : " +average+"ea");
		
		System.out.println("===============================================");
		////샘 답
		
		int pear1=5;
		int apple1=7;
		int orange1=5;
		
		System.out.println("하루에 생산되는 총 과일의 갯수: "+(pear1+apple1+orange1)+"개");
		System.out.println("시간 당 전체 과일의 평균 생산 갯수: "+((float)(pear1+apple1+orange1)/24f)+"개");
		
		
		//#2
		int fruitTotal=pear1+apple1+orange1;
		System.out.println("하루에 생산되는 총 과일의 갯수: "+fruitTotal+"개");
		
		float fruitAvg=fruitTotal/24f;
		System.out.println("시간 당 전체 과일의 평균 생산 갯수: "+fruitAvg+"개");
	}

}
