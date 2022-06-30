package arrayobject;

public class BookArray {

	public static void main(String[] args) {
		
		
		Book[] library = new Book[3];
		
		// 배열 입력 전 출력하면
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // 전부 null로 출력
		}
		
		// 입력(저장)
		library[0] = new Book("혼공 자바", "신용권");
		library[1] = new Book("반응형 웹", "나잘난");
		library[2] = new Book("스프링부트", "이강산");
		
		
		// 출력
		library[0].showInfo();  // 혼공 자바, 신용권

		// 전체 출력
		for(int i = 0; i < library.length; i++) {
			library[i].showInfo();
		}
		
		
		
		//System.out.println(library[0].bookName);  // 혼공 자바(필드 bookName에 private 없을 때만 이렇게 접근해서 출력가능)
		 
		//데이터 수정
		library[0].setBookName("혼자 공부하는 JAVA");
		library[1].setAuthor("김광수");
		
		
		//향상된 for문으로 출력
		for(Book b: library) {  // 각각이 Book이니까 이렇게해야!
			b.showInfo();
		}

	}

}
