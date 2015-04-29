package shape;
public class Shape {

	int x;
	int y;

	public Shape() {
		System.out.println("call shape()");
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("좌표 [x=" + getX() + ", y=" + getY()
				+ "] 에 점을 그렸습니다. ");
	}

	public void show(boolean visible) {

		if (visible == true) {
			show();
		} else {
			
			System.out.println("좌표 [x=" + getX() + ", y=" + getY()
					+ "] 에 점을 지웠습니다. ");
			
		}
	}

}
