package chapter04;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		char []alpa=new char[26]; //��� ����. ��, �ʱ�ȭ �ȵǾ� ����.
		char ch='A'; //65
		/*
		for(int i=0;i<alpa.length;i++) {
			//alpa[i]+=(ch+i); //alpa[i]=alpa[i]+(ch+1)
			alpa[i]=ch;
			ch++; //ch=ch+1;
			System.out.print("("+alpa[i]+")"+" ");
			
		}//for
		*/
		//������ �ι��� �����ϴ�. ch++�� Ȱ���Ͽ� �ϴ¹�
		for(int i=0;i<alpa.length;i++,ch++) {
			alpa[i]=ch;
			System.out.print("("+alpa[i]+", "+(int)(alpa[i])+") ");
		}//for
		
		

	}

}
