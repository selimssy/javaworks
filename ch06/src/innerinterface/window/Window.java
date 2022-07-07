package innerinterface.window;

public class Window {
	
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		
		// 필드 초기값으로 대입
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	
	
	Window(){
		button1.setOnclickListener(listener);  // 매개값으로 필드 대입
		button2.setOnclickListener(new Button.OnClickListener() {  // 매개값으로 익명 객체 대입
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
	
}
