package switchcase;

public class Ranking {

	public static void main(String[] args) {
		// switch ~ case문
		// 순위에 따른 메달 색상 출력
		
		int rank = 5;
		String medalColor = "";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			System.out.println("메달이 없습니다.");
			medalColor = "None";
			break;
		}
		
		System.out.println("메달 색상은 " + medalColor + "입니다.");
		
		

	}

}
