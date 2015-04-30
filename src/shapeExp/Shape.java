package shapeExp;

public abstract class Shape implements Visible {
	String color;

	public Shape() {
	}

	public Shape(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double caculateArea();

}
