package shelf;

public class ShelfMain {

	public static void main(String[] args) {
		
		//BookShelf bookshelf = new BookShelf();
				
		// 인터페이스 타입으로 객체 생성
		Queue shelfQueue = new BookShelf();
		
		// 자료 삽입
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 Java");
		shelfQueue.enQueue("스프링부트");
		
		
		
		// 자료의 갯수
		System.out.println("현재 책의 수: " + shelfQueue.getSize() + "권");  // 현재 책의 수: 3권
		
		
		// 자료 삭제
		System.out.println(shelfQueue.deQueue());   // 반응형 웹
		System.out.println(shelfQueue.deQueue());   // 혼공 Java
		System.out.println(shelfQueue.deQueue());   // 스프링부트
		
		// 다사ㅣ 출력
		System.out.println("현재 책의 수: " + shelfQueue.getSize() + "권");   // 현재 책의 수: 0권
	}

}
