package chapter06;

public class BookArrayCopy2 {

	public static void main(String[] args) {
		// 깊은 복사
		Book[] bookArray1= new Book[3]; //선언
		Book[] bookArray2= new Book[3]; 
		
		bookArray1[0]=new Book("데미안","헤르만 헤세");
		bookArray1[1]=new Book("불안","알랭드 보통");
		bookArray1[2]=new Book("연애의 행방","히가시노 게이고");
		
		bookArray2[0] =new Book();
		bookArray2[1] =new Book();
		bookArray2[2] =new Book();
		
		System.out.println("============bookArray1 원본============");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
			}
		System.out.println("============bookArray2 원본============");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("========bookarray2 복사========");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray2[i].getAuthor());
		}
		
		System.out.println();
		//==================================================
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("============bookArray1 원본============");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
			}
		System.out.println("============bookArray2 원본============");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		
	}

}
