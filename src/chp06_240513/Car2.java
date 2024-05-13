package chp06_240513;

public class Car2 {
	// 생성자 만들어서 회사, 모델명, 색깔, 최고속도를 생성자를 통하여 초기화하도록 생성자 작성.
	// 생성자 작성후 MainClass에서 Car2 객체를 선언
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
}
