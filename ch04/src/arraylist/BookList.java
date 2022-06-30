package arraylist;

import java.util.ArrayList;

import arrayobject.Book;

public class BookList {

	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<>();
		
		// 객체를 먼저 만들고 객체를 ArrayList에 넣는방법
		
		
		// Book 객체 생성
//		Book book1 = new Book("혼공 자바", "신용권");
//		Book book2 = new Book("반응형 웹", "조혜경");
//		Book book3 = new Book("스프링부트", "채규태");
//		
//		
//		// ArrayList에 자료 저장
//		bookList.add(book1);
//		bookList.add(book2);
//		bookList.add(book3);
		
		
		
		// 한번에 넣는방법
		bookList.add(new Book("혼공 자바", "신용권"));
		bookList.add(new Book("반응형 웹", "조혜경"));
		bookList.add(new Book("스프링부트", "채규태"));
		
		
		
		// 전체 출력
		for(int i = 0; i < bookList.size(); i++) {
			Book a = bookList.get(i);  // 저 앞에 Book은 자료형 자리다!(근데 객체니까 Book를 써준다)
			a.showInfo();
			//bookList.get(i).showInfo(); // 이거랑 똑같은거
		}
		

	}

}
