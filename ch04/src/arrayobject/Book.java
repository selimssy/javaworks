package arrayobject;

public class Book {
	// 필드
	private String bookName; // 책 제목
	private String author;  // 저자
	
	
	// 생성자
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	
	
	// 메서드
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	
	
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
	
	
}
