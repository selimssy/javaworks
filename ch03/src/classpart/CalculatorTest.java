package classpart;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 사용
		
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 20;
		
		
		// 메서드 호출
		int addresult = calc.add(10, 20);
		System.out.println(addresult);   // 30
			
		
		int subresult = calc.sub(10, 20);
		System.out.println(subresult);   // -10
		
		int add = calc.add(num1, num2);
		int sub = calc.sub(num1, num2);
		int mul = calc.mul(num1, num2);
		double div = calc.div(num1, num2);   // 나눗셈은 double로! 주의
				
		
		System.out.println(add);   // 30
		System.out.println(sub);   // -10
		System.out.println(mul);   // 200
		System.out.println(div);   // 0.5 (return n1 / (double)n2;) 여기에도 double 안해주면 0.0으로 나온다!

	}

}
