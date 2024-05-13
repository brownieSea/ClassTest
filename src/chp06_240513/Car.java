package chp06_240513;

public class Car {
	
	// 클래스의 이름으로 메소드를 만들면 생성자가 된다.
	// 생성자 메소드는 리턴값의 데이터 타입을 정의해주지 않아도 된다.
	// Car class를 실행하면 자동으로 호출.
	public Car(int tire) {  // 생성자는 반환 타입이 없다.
		System.out.println("생성자 호출!");
		System.out.println("타이어 수 : " + tire);
		this.tire = tire;  // 파이썬에서 self.tire 와 같다. 생성자를 통해서 인수를 입력받아서 필드값을 초기화
	}
	
	int tire;
	String company = "현대자동차";
	String mode = "그랜저";
	String color = "검정";
	int maxspeed = 350;
	int speed; // 초기값이 없는 변수
	
	int[] price = {1000, 2000}; // 정수형 배열 --> 필드
}
