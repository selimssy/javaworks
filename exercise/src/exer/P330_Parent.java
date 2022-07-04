package exer;

public class P330_Parent {
	
	public String nation;
	
	
	public P330_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public P330_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
	
}
