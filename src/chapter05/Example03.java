package chapter05;

public class Example03 {

	//�ִ밪�� �޼ҵ�� ����

	public static int findMax(int[] arr) { //int[] arr={7,2,9,1,5};
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}//for
		return max;
		/*
		//���  for
		for(int num : arr) {
			if(num>max) {
				max=num;
			}
		}
		*/
	}
	
	public static void main(String[] args) {
		int[] numbers = {7,2,9,1,5};
		int maxnum = findMax(numbers);
		System.out.println("�ִ밪: "+maxnum);

	}//main
	
	

}
