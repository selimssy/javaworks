package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long startTime;
		long endTime;
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));   // String.valueOf() : 정수를 문자로 반환
		}
		endTime = System.nanoTime();
		//System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");   // ArrayList 걸린시간: 12369100ns
		System.out.printf("ArrayList 걸린시간: %,dns",(endTime - startTime));   // ArrayList 걸린시간: 12,369,100ns
		
		
		
		System.out.println();
		
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		//System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");
		System.out.printf("LinkedList 걸린시간: %,dns",(endTime - startTime));          // LinkedList 걸린시간: 1,915,800ns
		
		
		
	}

}
