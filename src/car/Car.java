package car;
public class Car {

	String name;
	int speed;
	static int numberOfCars;

	public Car() {
		name = "MyCar";
		speed = 0;
		numberOfCars++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(int s) {
		this.speed = s;
	}

	public int getSpeed() {
		return speed;
	}

}
