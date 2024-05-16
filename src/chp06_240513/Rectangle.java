package chp06_240513;

public class Rectangle {
	
	// 오버로딩

	public int areaRectangle(int width) { // 정사각형
		return width * width;
	}
	
	public int areaRectangle(int width, int height) { //직사각형
		return width * height;
	}
}

