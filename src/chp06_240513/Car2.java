package chp06_240513;

public class Car2 {
	// 생성자 만들어서 회사, 모델명, 색깔, 최고속도를 생성자를 통하여 초기화하도록 생성자 작성.
	// 생성자 작성후 MainClass에서 Car2 객체를 선언
	// 생성자는 매개변수의 갯수를 다르게 해서 같은 이름의 생성자를 여러개 만들 수 있다.
	
	// 3개의 생성자가 매개변수 수만 달리해서 만들어졌고, 이런 식으로 만드는 것을 <생성자 오버로딩>이라고 한다.
	
	public Car2() { // 기본생성자 -> 매개변수 없는 경우.
		
	}

	public Car2(String company, String model, String color) {  
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

	public Car2(String company, String model, String color, int maxspeed) {  // 생성자는 반환 타입이 없다.
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	String company;
	String model;
	String color;
	int maxspeed;
	Car car; // 다른 클래스로 만든 객체 --> 필드로 사용 가능
}
