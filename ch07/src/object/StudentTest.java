package object;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		
		// HashMap의 객체 생성
		// Student 객체를 식별키로 Integer 값을 지정
		HashMap<Student, Integer> hashMap = new HashMap<>();
		
		
		// 자료 삽입
		hashMap.put(new Student("1"), 95);
		hashMap.put(new Student("2"), 95);
		
		
		// 자료 조회
		int score = hashMap.get(new Student("1"));
		int score2 = hashMap.get(new Student("2"));
		
		
		System.out.println("1번 학생의 국어 점수: " + score);    // 1번 학생의 국어 점수: 95
		System.out.println("1번 학생의 국어 점수: " + score2);   // 1번 학생의 국어 점수: 95
	} 

}
