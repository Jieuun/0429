package shapeExp;

public class Triangle extends Shape implements Drawable {

	private int height;
	private int width;

	public Triangle(){}
	
	public Triangle(String color, int height, int width) {
		super(color);
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}


	public double caculateArea() {
		
		return (height*width/2);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("높이가 " + getHeight() + ", 길이가 " + getWidth()
				+ " 인"+getColor()+" 삼각형을 그렸습니다.");
		
	}

	@Override
	public void visible(boolean visible) {
		// TODO Auto-generated method stub
		if(visible ==true){
			draw();
		}else {
			System.out.println("사각형을 지웠습니다.");
			
		}
		
	}

}
