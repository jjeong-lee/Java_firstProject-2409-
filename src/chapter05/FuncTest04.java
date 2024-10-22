package chapter05;

public class FuncTest04 {
	
	//반환값이 있음 ~ return 이 들어가야한다. 자료형은 맞춰줘야함.
	public int channelUp(int volume) {
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
	}
	
	//반환값이 없음(void)
	public void channelDown(int volume) { //int volume=5;
		System.out.println("소리를 "+volume+"만큼 내립니다.");
	}
	
	

	public static void main(String[] args) {
	
		// 인스턴스 변수  tv
		FuncTest04 tv=new FuncTest04();
		
		System.out.println("소리를 "+tv.channelUp(5)+"만큼 올립니다.");
		System.out.println("==========================");
		int volume=tv.channelUp(9);
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		
		System.out.println();
		tv.channelDown(5);
		
	}

}
