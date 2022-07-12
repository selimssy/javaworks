package generic.box2;

public class Box {
	
	// 비제네릭 방식
	
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	
	
	public Object get() {
		return obj;
	}
	
	
}
