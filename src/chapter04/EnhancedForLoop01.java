package chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {

		String strArray[]= {"Java","Oracle","HTML5","CSS","JSP","Spring","Python"};
		//일반 for문
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+ " ");
		}

		System.out.println();
		//확장 for문
		for(String lang:strArray) {
			System.out.print(lang+ " ");
		}
	}

}
