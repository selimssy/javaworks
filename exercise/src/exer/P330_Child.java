package exer;

public class P330_Child extends P330_Parent{
	
	private String name;
	
	public P330_Child() {
		this("홍길동");
		System.out.println("P330_Child() call");
	}
	
	public P330_Child(String name) {
		this.name = name;
		System.out.println("P330_Child(String name) call");
	}
	
}
