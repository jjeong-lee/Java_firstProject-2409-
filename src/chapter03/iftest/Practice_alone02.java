package chapter03.iftest;

import javax.swing.JOptionPane;

public class Practice_alone02 {

	public static void main(String[] args) {
		// 
	
		String ID="Lee1125";
		String PW="EJ00";
		
		String id = JOptionPane.showInputDialog("아이디");

		if (ID.equals(id)) {
			System.out.println("아이디가 일치합니다.");
			String pw = JOptionPane.showInputDialog ("비밀번호");
			if (PW == pw) {
				System.out.println("로그인이 완료 되었습니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다. 다시 입력하세요.");
		}
	}

}
