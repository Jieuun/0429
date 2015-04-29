package shape;


public class ColorPoint extends Shape{
	String color;

	public ColorPoint(){
		System.out.println("call colorpoint");
	}
	
	public ColorPoint(int x, int y, String color){
		//setX(x);
		//setY(y);
		super(x,y);
		setColor(color);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show(){
		
		System.out.println("좌표 [x=" + getX() + ", y=" + getY()
				+ "] 에 "+getColor()+" 점을 그렸습니다. ");
		
		
	}
	
	
	

}
