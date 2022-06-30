package singleton.card;

public class CardCompany {
	
	// 싱글톤 패턴
	private static CardCompany instance;
	
	private CardCompany() {}   // 생성자 막아놨다
	
	// 외부에서 CardCompany 호출(참조)할 수 있도록 메서드 정의
	public static CardCompany getInstance() {
		if(instance == null) 
			instance = new CardCompany();
		return instance;
		
	}
	
	
	// 차를 생성하는 메서드
	public Card createCard() {
		Card card = new Card();
		return card;
	}
	
	
}
