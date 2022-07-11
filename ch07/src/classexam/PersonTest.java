package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		System.out.println("클래스 이름 가져오기");
		Class<?> pClass1 = person.getClass();
		System.out.println(pClass1.getName());   // classexam.Person   // 이건 클래스이름 모를때 사용
		
		
		//forName() : 물리적인 클래스 파일명을 인자로 넣어주면 이에 해당하는 클래스를 반환해줍니다.
		//forName() 사용시 예외처리 해줘야!
		Class<?> pClass2 = Class.forName("classexam.Person");
		System.out.println(pClass2.getName());   // classexam.Person   // 이건 클래스이름 알고있을 때 사용!
		
		
		
		
		System.out.println("***** 필드 정보 가져오기 *****");
		Field[] fields = pClass1.getDeclaredFields();
		for(Field f: fields) {
			System.out.println(f);
		}
		
		
		
		
		System.out.println("***** 생성자 정보 가져오기 *****");
		Constructor<?>[] cons = pClass1.getConstructors();
		for(Constructor<?> c : cons) {
			System.out.println(c);
		}
		
		
		
		
		
		System.out.println("***** 메소드 정보 가져오기 *****");
		Method[] methods = pClass1.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		
	}

}
