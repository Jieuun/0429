package shapeExp;

public class ShapeTest {

	/*
	 * 예제입니다 넓이 7, 높이 10인 파란색 삼각형을 만들고 넓이 출력
	 * 
	 * 반지름이 5인 초록색 원 만들기
	 * 
	 * x : 6, y : 10 에 파란색 점을 그려요 보여주세요
	 * 
	 * x : 10, y : 33 에 점 그리기 보여줘요
	 * 
	 * 넓이 85, 높이 24인 빨간색 사각형을 만들고 출력
	 * 
	 * 사각형 넓이 출력
	 * 
	 * 그린 도형 모두 지우기
	 */

	public static void main(String[] args) {

		Triangle tri = new Triangle("BLUE", 7, 10);
		Circle won = new Circle("GREEN", 5);
		ColorPoint cp = new ColorPoint(6, 10, "BLUE");
		Point jum = new Point(10, 33);
		Rect rect = new Rect("RED", 85, 24);

		tri.draw();
		double triArea = tri.caculateArea();
		System.out.println("삼각형의 넓이는 " + triArea);

		won.draw();
		cp.draw();
		jum.draw();
		rect.draw();

		System.out.println("사각형의 넓이는 " + rect.caculateArea());
		
		System.out.println();
		System.out.println("도형 지우기");

		tri.visible(false);
		won.visible(false);
		cp.visible(false);
		jum.visible(false);
		rect.visible(false);

	}

}
