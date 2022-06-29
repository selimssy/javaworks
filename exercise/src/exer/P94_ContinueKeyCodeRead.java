package exer;

import java.io.IOException;

public class P94_ContinueKeyCodeRead {

	public static void main(String[] args) throws IOException {
		int KeyCode;
		
		System.out.print("여러개의 문자를 입력하세요");
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);
			if(KeyCode == 113) {
				System.out.println("종료");
				break;
			}
		}

	}

}
