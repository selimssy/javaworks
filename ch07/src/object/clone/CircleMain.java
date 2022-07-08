package object.clone;

public class CircleMain {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Point point = new Point(3, 4);
		System.out.println(point.toString());  // object.clone.Point@167fdd33
		
		
		//toString() 재정의 후!!   // x = 3, y = 4
		
		
		
		
		
		Circle circle = new Circle(5, 6, 4);
		System.out.println(circle.toString());   // object.clone.Circle@1e965684
		
		//toString() 재정의 후!!   /중심점은 x = 5, y = 6이고, 반지름은 4입니다.
		
		//toString() 생략해도 똑같이 나온다
		
		
		
		
		// circle 객체 복사
		Circle copyCircle = (Circle)circle.clone();
		System.out.println(copyCircle);   // 중심점은 x = 5, y = 6이고, 반지름은 4입니다.
		
		
	}

}
