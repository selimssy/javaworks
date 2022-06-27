package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		
		int[] array1 = {10, 20, 30, 40};
		int[] array2 = new int[4];
		
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");   // 10 20 30 40 
		}
		
		
		
		
		
		
		System.out.println();
		// 문자형 배열 복사
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];   // 복사
		char[] arr3 = new char[3];   // 역순 복사
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");   // N E T
		}
		
		
		
		System.out.println();
		// arr1을 arr3으로 역순복사
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[2-i];
		}
		
		// arr3 출력
				for(int i = 0; i < arr3.length; i++) {
					System.out.print(arr3[i] + " ");   // T E N 
				}

	}

}
