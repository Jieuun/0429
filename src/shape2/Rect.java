package shape2;

import shape.Drawable;

public class Rect extends Shape implements Drawable {
	
	private int width;
	private int heigh;
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}

	public void draw(){
		System.out.println("사각형을 그렸습니다.");
	}

	@Override
	public double caculateArea() {
		// TODO Auto-generated method stub
		return width*heigh;
	}


	
	

}
