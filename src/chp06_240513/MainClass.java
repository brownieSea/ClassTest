package chp06_240513;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calculator Class 사용해서 사칙연산 하기
		// 변수 선언할 때 만들어준 Calculator를 데이터 타입처럼 선언하듯이 선언.

		Calculator cal1 = new Calculator();
		// Calculator 클래스로 new 연산자를 사용하여 cal1 객체를 생성
		System.out.println(cal1.add(30, 20));
		System.out.println(cal1.sub(20, 30));
		System.out.println(cal1.mul(20, 30));
		System.out.println(cal1.divid(100, 30));
		System.out.println(cal1.pow(15));
		
		
		Car car = new Car(4);  // Car class로 car 라는 객체 선언
		System.out.println(car.company);
		System.out.println(car.speed);
		car.speed = 150;
		System.out.println(car.speed);
		System.out.println(car.price[0]);
		System.out.println(car.price); // 배열의 인덱스가 없으면 메모리 주소값을 출력
		
		System.out.print(car.tire);
		
		Car2 car2 = new Car2("현대자동차", "그랜저", "블랙", 150);
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxspeed);
		

	}
	
	

}
