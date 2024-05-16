package chp06_240513;


// 사칙연산 함수가 들어있는 클래스
public class Calculator {
	// 클래스 내에 선언된 변수 = 속성 or 필드 라고 한다.
	int firstNum;
	int secondNum;
	
	// method (함수) 선언
	// def add(firstNum, secondNum): --> 파이썬 문법
	//		return firstNum + secondNum
	// add(10,20) --> 30을 반환
	
	// 접근 지정자 --> 해당 함수를 사용할 수 있는 권한설정. public 으로 하면 모두 사용 가능.
	public int add(int first, int second) { 
	// 함수명 앞에는 리턴되는 값의 데이터 타입 선언.
	// 매개변수도 데이터 타입 선언. 
		return first + second;
	}

	public int sub(int first, int second) { 
		return first - second;
	}
	
	public int mul(int first, int second) { 
		return first * second;
	}

	public double divid(double first, double second) { 
		return first / second;
	}

	public int pow(int number) { 
		return number*number;
	}

	public int pow(int number, int number2) {  // 매개변수를 달리해서 같은 이름의 클래스를 사용할 수 있다. 메소드 오버로딩 
		return number*number;
	}

}
