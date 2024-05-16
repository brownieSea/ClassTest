package chp06_240513;

public class Test {
	
	public int sum1(int[] values) {
		return 10;
	}
	
	public int sum2(Car car) {
		return 10;
	}

	public int sum3(int a) {
		if (a>10) {
			return 10;
		} else {
			return 20;
		}
	}
	
	int a = sum3(10); // 클래스 내부에서도 메소드 호출 가능. 자주 쓰이지는 않음.
	
	
	
}
