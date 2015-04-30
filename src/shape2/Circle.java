package shape2;

public class Circle extends Shape {
	private int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	

	public void draw(){
		System.out.println("원을 그렸습니다.");
	}

	@Override
	public double caculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

}
