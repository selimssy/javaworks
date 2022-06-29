package exer;

import java.io.IOException;

public class P93_keycode {

	public static void main(String[] args) throws IOException {
		int KeyCode;
		
		System.out.print("한 개의 문자를 입력하세요");
		KeyCode = System.in.read();   // 문자 입력
		System.out.println("KeyCode: " + KeyCode);
		
		KeyCode = System.in.read();   // 문자 입력
		System.out.println("KeyCode: " + KeyCode);
		
		KeyCode = System.in.read();   // 문자 입력
		System.out.println("KeyCode: " + KeyCode);
	}

}
