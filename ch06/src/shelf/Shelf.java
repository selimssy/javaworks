package shelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;  // 선언만 하고 객체 생성시에 만들어지도록
	
	// 객체 생성시에 어레이리스트가 생성
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	
	public ArrayList<String> getShelf(){
		return shelf;   // 리스트를 반환
	}
	
	
	
	
}
