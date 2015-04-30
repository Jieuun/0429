package shapeExp;

public class Circle extends Shape implements Drawable{
	
	private int radius;
	
	public Circle(){}
	
	public Circle(String color, int radius){
		super(color);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	
	public double caculateArea() {
		
		return Math.PI*radius*radius;
		
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+ getRadius()+ " 인" +getColor()+" 원을 그렸습니다.");
		
	}


	@Override
	public void visible(boolean visible) {
		// TODO Auto-generated method stub
		if(visible ==true){
			draw();
		}else {
			System.out.println("원을 지웠습니다.");
			
		}
		
	}


}
