package lab18;

public class Car {
	
	private int speed;
	private String model;
	
	public Car(String model) {
		this.speed=0;
		this.model=model;
	}
	
	public void accelerate(int seconds) {
		speed += 5*seconds;
	}
	
	public String details() {
		return String.format("Car model %s has speed %d", model, speed);
	}
	
	public void to60() {
		this.speed = 60;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
