package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest06 {

	public static void main(String[] args) {


		String str[]= {"ȫ�浿","������","����","�̼���"};
		String res="";
		
		for(int i=0;i<str.length;i++) {
			res+=str[i]+"\n"; //res=res+str[i]  //\n: ����
		}
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "[������]\n"+ res);
	}

}
