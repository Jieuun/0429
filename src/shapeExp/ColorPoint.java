package shapeExp;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println("x : " + getX() + ", y ; " + getY() + " 에 "+getColor()+" 점을 그렸습니다.");

	}

	@Override
	public void visible(boolean visible) {

		if (visible == true) {
			draw();
		} else {
			System.out.println("x : " + getX() + ", y ; " + getY()+ " 에 점을 지웠습니다.");

		}

	}

}
