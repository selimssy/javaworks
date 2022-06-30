package exer;

import java.util.Scanner;

public class P127 {

	public static void main(String[] args) {
		//1
		byte b = 5;
		// b = -b;  // -b가 -5가 되면서 int형으로 바뀜
		
		
		
		
		//2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31
		System.out.println(x); // 11    
		System.out.println(y); // 19
		
		
		
		
		//3
		boolean stop = false;
		while(!stop) {  // stop == false 이것도 똑같긴하다
			System.out.println("실행");
			break;
		}
		
		
		
		
		
		//5
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;  // 여기도 우변이 int로 되서 2.0이 된다!
		System.out.println(var3);   // 2.0
		int var4 = (int)(var3 * var2);
		System.out.println(var4);   // 4
		
		
		
		
		//6
		int value = 356;
		System.out.println(value / 100);  //3 역시 int라서 3.56 중 소수점 버리고 3만 출력
		System.out.println(value / 100 * 100);  // 300
		
		
		
		
		
		
		//7
		float v1 = 10f;
		float v2 = v1 / 100;
		if(v2 == 0.1) {
			System.out.println("10%입니다.");
		}
		else {
			System.out.println("10%가 아닙니다.");    // 실행하면 10%가 아니라고 뜬다(float 0.1f는 정확히 0.1이 아니기 때문에!)
		}
		
		
		
		
		
		
		//8
		int lengthTop = 5;
		int lengthBottom =10;
		int height = 7;
		double area = (double)(0.5 * (lengthTop + lengthBottom) * height);
		System.out.println(area);
		
		
		
		
		
		
		
		//9
		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 수: ");
		//double num1 = sc.nextDouble();
//		double num1 = Double.parseDouble(sc.nextLine());  // 이 방법이  다른데서도 잘 통하고 효율적이랭 
//		System.out.print("두 번째 수: ");
		//double num2 = sc.nextDouble();
//		double num2 = Double.parseDouble(sc.nextLine());
		//if(num2 == 0.0) {  // double로 선언해서 0을 입력해도 0.0으로 변환될거라 그냥 이것만 해도 될것같다
//		if(num2 == 0 || num2 ==0.0) {
//			System.out.println("결과: 무한대");
//		}
//		else {
//			System.out.println("결과: " + (num1 / num2));
//		}
		
		
		
		
		
		
		//10
		int r = 10;
		int s1 = 3;
		int s2 = 14;
		double PI = Double.parseDouble((s1 + "." + s2));
		double d = r * r * PI;
		System.out.println(d);
		
		
		
		
		
		// 11
		System.out.print("아이디: ");
		String name = sc.nextLine();
		
		System.out.print("패스워드 ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		
		

	}

}
