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
		
		int a;
		double b;
		a = cal1.add(100, 200);
		b = cal1.divid(10, 3);
		System.out.println("-------------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------------------------------");
		
		
		Car car = new Car(4);  // Car class로 car 라는 객체 선언
		System.out.println(car.company);
		System.out.println(car.speed);
		car.speed = 150;
		System.out.println(car.speed);
		System.out.println(car.price[0]);
		System.out.println(car.price); // 배열의 인덱스가 없으면 메모리 주소값을 출력
		
		System.out.println(car.tire);
		
		Car car1 = new Car(2);
		
		Car2 car2 = new Car2("현대자동차", "그랜저", "블랙", 150);
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxspeed);
		
		Car2 car3 = new Car2("기아자동차", "k5", "Gray");  // 매개변수가 3개인 Car2 객체 호출
		System.out.println(car3.company);
		
		
		
		Test test = new Test();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car1);
		
		
		System.out.println();
		
	
// --------------------------------------------------------------------------------

		System.out.println("-------------------------------");
		MemberService log1 = new MemberService();
		// boolean result1;
		// result1 = log1.login("hong", "12345");
		System.out.println(log1.login("hong", "12345"));
		
		log1.logout("hong");

//--------------------------------------------------------------------------------
		System.out.println("-------------------------------");
		Printer printer = new Printer();
		printer.println(10);
		printer.println("홍길동");
		printer.println(true);
		printer.println(63.14);
		
		
		
		
		
	}

}
