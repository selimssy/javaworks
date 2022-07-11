package jdbcproject;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		
		// 자료 삽입
		/*Person p1 = new Person();
		p1.setUserId("sky");
		p1.setUserPw("sky11");
		p1.setName("하늘");
		p1.setAge(21);    	
		dao.insertPerson(p1);  // 이걸 해줘야 추가된다!!(추가메서드)    */
		
		
		
		// 자료 수정
		Person p2 = new Person();
		p2.setUserId("today");      // 아이디는 변경불가!(primary key)
		p2.setUserPw("today11");    // 비밀번호 수정
		p2.setName("오늘");      // 이름 수정
		p2.setAge(35);
		dao.updatePerson(p2);    // 이걸 해줘야 수정된다!!(수정메서드)    
		
		
		
		
		
		// 자료 삭제
		Person deleteOne = new Person();
		deleteOne.setUserId("sky");
		dao.deletePerson(deleteOne);   // 이걸 해줘야 삭제된다!!(삭제메서드)  
		
		
		
		
		
		// 특정한 1명 조회
		
		/*Person selectOne = dao.getPerson("cloud");
		//System.out.println(selectOne);
		System.out.println("아이디: " + selectOne.getUserId());
		System.out.println("비밀번호: " + selectOne.getUserPw());
		System.out.println("이름: " + selectOne.getName());
		System.out.println("나이: " + selectOne.getAge());*/
		
		// 함수 이용해서 출력
		Person selectOne = dao.getPerson("cloud");
		printPerson(selectOne);
		System.out.println("===================================");
		
		
		
		// 전체 조회
		/*personList = dao.getPersonList();
		for(int i = 0; i < personList.size(); i++) {
			Person person =  personList.get(i);
			System.out.println("아이디: " + person.getUserId());
			System.out.println("비밀번호: " + person.getUserPw());
			System.out.println("이름: " + person.getName());
			System.out.println("나이: " + person.getAge());
			System.out.println("==================================");
		} */
		
		// 함수 이용해서 출력
		personList = dao.getPersonList();
		for(int i = 0; i < personList.size(); i++) {
			Person person =  personList.get(i);
			printPerson(person);
		} 
		
		
		
		
		
		
		
		
		
	}//main() 닫기
	
	
	public static void printPerson(Person person) {
		System.out.println("아이디: " + person.getUserId());
		System.out.println("비밀번호: " + person.getUserPw());
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
	}
	
	
	
}
