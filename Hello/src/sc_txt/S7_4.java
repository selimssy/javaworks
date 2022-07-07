package sc_txt;

public class S7_4 {
/*
 * 
 * polymorphism 패키지(animal 패키지, child패키지)

static 패키지(Calculator, CalculatorTest, Student)

singleton패키지(Singleton, SingletonExample)

customer 패키지★ 

protectedex 패키지★(pack1, pack2)

virtualmethod 패키지

taketrans 패키지★  

fruit 패키지★

casting패키지 : (강제형변환)


shelf 패키지
innerinterface.window 패키지 - 내부 인터페이스해야ㅠㅠ
ch07 object 패키지  .....???
HashMap..............?




<exer패키지>
A
B
P268
CellPhone
CellPhone_Dmb
CellPhone_Test
FinalEx
FinalEx_Define
FinalEx_USING
FinalEx_MyUSING
P330_Parent
P330_Child
P330_TEST
p/335 해보쟈ㅠ

abstractex.phone패키지
abstractex.animal패키지
exer snow패키지
Service패키지......?
interfaceex패키지(인터페이스) - 이중에서 remotecontrol 모르겟다,,
tire 패키지
template_method 다시ㅠ
gamelevel 패키지











final: 변수 앞에 오면 상수
final class 이렇게 클래스 앞에 오면:  상속 불가
final method() 이렇게 메소드 앞에 오면: 메소드 재정의 불가




자식 객체가 생성될 때에는 무조건 부모객체의 생성자를 먼저 초기화한 후
자식객체가 생성된다. 때문에 자식클래스의 생성자에 super()메소드가 없더라도
컴파일러가 자동으로 super()를 넣어 실행하게 된다
때문에 super()가 없더라도 부모의 생성자부터 초기화된다



추상클래스



}else {
	System.out.println("지원되지 않는 기능입니다.");
	return;   // 강제 종료
}

return 강제종료 기억하자!


템플릿 메서드





인터페이스로 구현 객체를 사용하는 방법
1.필드
2.생성자의 매개변수
3.매서드의 지역변수
4.메서드의 매개변수





system 12345

확장자  .sql



column1 CHAR(10),       -- 고정 길이
column2 VARCHAR2(10),   -- 가변 길이



-- 오라클에서는 문자 무조건 홀따옴표!



--현재 날짜: SYSDATE, 시분초까지: SYSTIMESTAMP


-- 테이블의 구조
DESC member;


-- INSERT INTO ex3 VALUES('Hello', '');   -- ORA-01400: NULL을 ("SYSTEM"."EX3"."COL_NOT_NULL") 안에 삽입할 수 없습니다
(즉 not null 조건에 위배)
즉, ' ' 만 넣어도 null에 해당한다!!






DDL - CREATE ALTER DROP

DML - SELECT INSERT UPDATE DELETE 






UPDATE member
SET regDate = '22/05/15', salary = 1500000
WHERE userId = 'sky2022';
--이렇게 콤마로 여러 개 한꺼번에 수정할 수도 있다!!★






DELETE member;

ROLLBACK;
--commit 잘 해주면 실수로 delete해도 롤백하면 복구된다!★








-- 테이블 복사
-- CREATE TABLE  새테이블명 AS
SELECT * FROM 원본테이블




ALTER TABLE USER MODIFY(member NUMBER(3));  
이런식으로 수정


https://wookoa.tistory.com/80             static 관련 오류 해결
https://kingofbackend.tistory.com/131    static 의미
https://passiflore.tistory.com/entry/Casting-Instanceof-%EA%B0%95%EC%A0%9C%ED%83%80%EC%9E%85%EB%B3%80%ED%99%98%EA%B3%BC-%EA%B0%9D%EC%B2%B4-%ED%83%80%EC%9E%85-%ED%99%95%EC%9E%85
https://velog.io/@duswls3913/JAVA-%EC%83%81%EC%86%8D%EC%97%90%EC%84%9C%EC%9D%98-%EC%83%9D%EC%84%B1%EC%9E%90
 * */
}
