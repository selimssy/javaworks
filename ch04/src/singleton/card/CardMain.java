package singleton.card;

public class CardMain {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		System.out.println("card1: " +  card1.getCardNumber());  // 10001
		
		Card card2 = company.createCard();
		System.out.println("card2: " +  card2.getCardNumber());  // 10001
		
		Card card3 = company.createCard();
		System.out.println("card3: " +  card3.getCardNumber());  // 10001
		
		
		
	}

}
