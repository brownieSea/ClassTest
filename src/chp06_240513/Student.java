package chp06_240513;

public class Student {
	
	// 생성자 오버로딩
	// 이클립스에서 자동으로 생성자 만들기.
	// 현재 행 위치에서 오른쪽 마우스 > Source(Alt+Shift+S) > Generate constructor from superclass... 
	public Student() {
		super(); // 부모클래스의 생성자 호출
	}
	
	// 현재 행 위치에서 오른쪽 마우스 > Source(Alt+Shift+S) > Generate constructor using field...
	public Student(String name, String hakbun) {
		super();
		this.name = name;
		this.hakbun = hakbun;
	}

	public Student(String name, String hakbun, int age, String grade, String address) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}

	String name;
	String hakbun;
	int age;
	String grade;
	String address;
	
	public void printName() {  // 리턴값이 없는 메소드 --> void
		System.out.println("학생이름: " + this.name);
	}
}
