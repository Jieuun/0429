package shape;


public class ShapeTest {
	public static void main(String[] args) {
		
		Shape shape1 = new Shape();
		shape1.setX(2);
		shape1.setY(5);
		
		
		Shape shape2 = new Shape();
		shape2.setX(10);
		shape2.setY(23);
		
		
		Shape shape3 = new Shape(50, 50);
		
		shape1.show();
		shape2.show();
		shape3.show(false);
		
		
		ColorPoint po = new ColorPoint(10,40,"RED");
		
		/*po.setX(10);
		po.setY(50);
		po.setColor("red");*/
		po.show();
	}

}
