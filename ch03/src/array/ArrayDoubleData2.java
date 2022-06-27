package array;

public class ArrayDoubleData2 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		
		double[] data = new double[5];
		int size = 0;
		
		//입력
		data[0] = 10.0;
		size++;    // size = 1
		data[1] = 20.0;
		size++;    // size = 2
		data[2] = 30.0;
		size++;	   // size = 3
		// 5개로 정의했는데 3, 4번 초기화하지 않으면 자동으로 0.0이 들어간다
		
		
		
		
		// 출력
		for(double i : data) {
			System.out.print(i + "  ");   // 10.0  20.0  30.0  0.0  0.0  
		}
		
		
		// 유효한 값만 출력
		System.out.println();
		for(int i = 0; i < size; i++) {
			System.out.print(data[i] + "  ");    // 10.0  20.0  30.0  
		}

	}

}
