package nestedfor;

public class StarPoint {

	public static void main(String[] args) {
		// 삼각형 모양으로 별 찍기
		
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		for(i = 1; i <= 5; i++) {          // for(j = 5; j >= i; j--) 이렇게해도 된다
			for(j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		// 공백과 별을 나눠서 생각!!!★
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		// 공백과 별을 나눠서 생각!!!★
		for(i = 1; i <= 5; i++) {
			for(j = 1; j < i; j++) {      // 이래야 첫째줄에 공백이 안들어간다!!★
				System.out.print(" ");
			}
			
			for(j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
