package shape2;

import shape.Drawable;



public class ShapeTest {
	public static void main(String[] args) {
		
		
		Shape rect = new Rect();
		Shape circle = new Circle();
		
		
		rect.draw();
		circle.draw();
		
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		//System.out.println(c instanceof Rect); //상속관계가 아니라 오류 
		
		Shape s = c;
		
		System.out.println(s instanceof Rect);
	}

}
