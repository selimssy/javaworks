package ch11;

public class IntegerCompareExample {

	public static void main(String[] args) {
		
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		
		// 값의 범위가 -128 ~ 127이면 ==은 값을 비교하고 그 이외에는 번지를 비교한다!!
		System.out.println(obj1 == obj2);    // true
		System.out.println(obj3 == obj4);    // false
		
	}

}
