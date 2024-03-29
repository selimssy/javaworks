package array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// arraycopy() 함수 사용
		
		int[] a = {1, 2, 3, 4};
		int[] a2 = new int[4];
		int[] a3 = new int[4];
		
		
		//new로 생성하지 않고 직접 클래스이름으로 접근
		//arraycopy(대상배열, 대상배열인덱스, 복사할배열, 복사할배열 인덱스, 배열의 길이)  
		System.arraycopy(a, 0, a2, 0, 4);    // a를 a2로 복사
		for(int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");  // 1 2 3 4 
		}
		
		
		
		System.out.println();
		//clone() : Object 클래스의 메소드
		a3 = a2.clone();   // a2 배열을 a3에 복사
		
		for(int i=0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");    // 1 2 3 4 
		}
		
		
		System.out.println();
		for(int i : a3) {
			System.out.print(i + " ");    // 1 2 3 4  이것도 할 줄 알아야
		}

	}

}
