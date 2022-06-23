package loopevent;

public class Sum1to10 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계
		
		int i = 0;
		int sum = 0;
		
//		while(i < 10) {
//			i++;
//			sum += i;
//			System.out.println("i = " + i + ", sum = " + sum);
//		}
		
		
		
		// 무한반복문으로
		while(true) {
			i++;
			if(i > 10) {
				break;
			}
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		
		
	}

}
