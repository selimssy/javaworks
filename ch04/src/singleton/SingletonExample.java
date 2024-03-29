package singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		/* Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();   */   // 컴파일에러(싱글톤이라 new로 생성 불가)
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		// 출력 결과: 같은 Singleton 객체입니다.(하나만 존재)
		
	}

}
