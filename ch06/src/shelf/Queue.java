package shelf;

public interface Queue {
	
	// Queue(큐) : 자료구조의 한 방식 - 먼저 들어간 자료가 먼저 나온다(FIF0: First In First Out)
	
	
	//추상메서드
	void enQueue(String title);  // 리스트의 맨 뒤에서 추가함
	
	String deQueue();  // 리스트의 맨 처음 항복 반환(index 0번): 이게 나올 차례
	
	int getSize();  // 현재 Queue에 있는 요소의 개수 반환 
	
}
