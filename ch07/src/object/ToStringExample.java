package object;

public class ToStringExample {

	public static void main(String[] args) {
		
		
		// String의 name 객체
		String name = new String("오상식");
		System.out.println(name);   // 오상식 (객체주소가 아니라 값이 나온다)
		
		//toString() : 객체의 정보를 문자열로 출력하는 함수 / Object 클래스꺼다
		System.out.println(name.toString());  //오상식 
		
		
		
		Book book = new Book(12, "개미"); 
		System.out.println(book);  // object.Book@167fdd33 이건 주소가 나온다
		System.out.println(book.toString());   // object.Book@167fdd33
		
		
		
		
		// << Book클래스에서 toString() @Override 해준 후>> (Book클래스에서 toString() 재정의)
		
		System.out.println(book);  // object.Book@167fdd33 이건 주소가 나온다
		System.out.println(book.toString());   // object.Book@167fdd33
		
	}

}
