package loopevent;

public class While1to10 {

	public static void main(String[] args) {
		
		// 1부터 10까지 출력
		int n = 0;
//		while(n < 10) {
//			n++;
//			System.out.println(n);
//		}
		
		
		while(true) {    // 무한반복(빠져나오려면 while 안에 조건써서 break해야)
			n++;
			if(n > 10) {
				break;
			}
			System.out.println(n);			
			
		}
		
	}

}
