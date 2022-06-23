package scannerEx;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		// 보너스 포인트 = 가격(price) * 보너스적립율(5%)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객의 이름을 입력하세요:");
		String name = sc.nextLine();
		
		System.out.print("구매 금액을 입력하세요:");
		
		int price = sc.nextInt();  // 가격 입력
		int bonusPoint = 0;
		double bonusRatio = 0.05;   // 보너스 적립율
		
		// 연산
		bonusPoint = (int)(price * bonusRatio);    // 형 맞춰줘야!
		
		// 출력
//		System.out.println(name + "님의 보너스 포인트는 " + bonusPoint + "점 입니다.");
		System.out.printf("%s님의 보너스 포인트는 %,d점 입니다.", name, bonusPoint);
		// d앞에 , 붙이면 1000단위로 출력된다!
		
		sc.close();
	}

}
