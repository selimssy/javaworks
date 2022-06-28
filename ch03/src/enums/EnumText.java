package enums;


enum Level{    // 열겨형 상수(문자아님 주의!)
	LOW,
	MEDIUM,
	HIGH
}


public class EnumText {

	public static void main(String[] args) {
		Level level = Level.HIGH;    //상수이므로 new를 사용하지 않는다
		
		switch(level) {
		case LOW:
			System.out.println("Low level");
			break;
			
		case MEDIUM:
			System.out.println("Midium level");
			break;
		
		case HIGH:
			System.out.println("High level");
			break;
			
		default:
			System.out.println("레벨이 없습니다.");
			break;
			
		}
	}

}
