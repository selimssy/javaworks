package array;

public class ArrayCars {

	public static void main(String[] args) {
		// 문자형 배열 선언과 사용
		
//		String[] cars = new String[4];
		
		// 자료 입력
//		cars[0] = "Morning";
//		cars[1] = "Sonata";
//		cars[2] = "Sportage";
//		cars[3] = "K7";
		
		String[] cars = {"Moring", "Sonata", "Sportage", "K7"};
		
		
		
		// 전체 조회(인덱스방식)
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");  // Morning Sonata Sportage K7
		}
		
		
		System.out.println();
		// 수정(Sportage > BMW)
		cars[2] = "BMW";
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");  // Morning Sonata BMW K7
		}
		
		
		System.out.println();
		// 향상된 for(객체방식)
		for(String c : cars) {   // for(자료형 변수 : 배열이름)   // 변수는 내맘대로 지정
			System.out.print(c + " ");   // Moring Sonata BMW K7 
		}
		

	}

}
