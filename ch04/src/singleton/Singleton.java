package singleton;

public class Singleton {
	
	// 싱글톤 만드는 코드
	/* private static 클래스이름 singleton = new 클래스이름();
	 * 
	 *private 클래스이름(){}
	 * 
	 * static 클래스이름 getIntstance(){
	 * return singleton;
	 * }
	 */
	
	
	
	
	
	
	//singleton객채 생성(new로 생성하지 않음)
	private static Singleton singleton = new Singleton();
	
	// 생성자
	private Singleton() {}
	
	//getInstance() 메서드
 	static Singleton getInstance() {
		return singleton;
	}
}
