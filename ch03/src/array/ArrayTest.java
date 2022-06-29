package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 숫자를 5개 저장할 배열
		int[] num = new int[] {10, 20, 30, 40, 50};
		for(int i: num) 
			System.out.println(i);    // {} 안해도 나오넹
		
		
		// 문자열을 3개 저장할 배열
		String[] str = {"사과", "참외", "수박"};   // 다양한 배열 초기화 방식
		for(String s : str)
			System.out.println(s);
		
		//제품을 3개 저장할 배열
		Product[] product = new Product[3];
		product[0] = new Product("notebook", 1000000);   // 객채라서 new 해줘야된다
		product[1] = new Product("smartPhone", 1500000);
		product[2] = new Product("AI speaker", 2000000);
		
		// System.out.println(product[0].showInfo());
		for(int i = 0; i < product.length; i++) {
			System.out.println(product[i].showInfo());
		}
		
		// 항상 for문으로 출력
		for(Product p : product) 
			System.out.println(p.showInfo());
		
	}

}
