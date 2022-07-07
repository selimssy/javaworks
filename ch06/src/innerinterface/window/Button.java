package innerinterface.window;

public class Button {
	
	 // 인터페이스 타입 필드
	OnClickListener listener;  
	
	
	
	void setOnclickListener(OnClickListener listener) {            // 매개변수의 다형성
		this.listener = listener;
	}
	
	
	
	void touch() {
		listener.onClick();    //구현 객체의 onClick() 메소드 호출
	}
	
	
	
	// 내부(중첩) 인터페이스
	static interface OnClickListener{
		void onClick();
	}
	
	
}
