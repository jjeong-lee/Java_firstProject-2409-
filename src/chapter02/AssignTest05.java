package chapter02;

public class AssignTest05 {

	public static void main(String[] args) {
		// 전위연산
		System.out.println("===전위연산===");
		int gameScore = 150;
		
		//int lastScore=gameScore+1;
		//lastScore1=gameScore+1 | ++gameScore =>gameScore+=1;
		int lastScore1=++gameScore; //++gameScore = gameScore-=1;
		System.out.println(gameScore); //151
		System.out.println(lastScore1); //151
		System.out.println("------------------");
		//lastScore2=gameScore-1 | --gameScore =>gameScore-=1;
		int lastScore2=--gameScore; //lastScore2=gameScore-1
		System.out.println(gameScore); //150
		System.out.println(lastScore2); //150
		
		//후위연산   - 대입을 먼저 한 후 연산을 해야할 경우에 사용 예)50만원 사용시 5만원 포인트 지급
		System.out.println("===후위연산===");
		//lastScore3=gameScore-1 | gameScore++ =>gameScore+=1;
		int lastScore3=gameScore++;
		System.out.println(lastScore3); //150
		System.out.println(gameScore); //151
		System.out.println("------------------");
		int lastScore4=gameScore--;
		System.out.println(lastScore4); //151
		System.out.println(gameScore); //150
		
	}

}
