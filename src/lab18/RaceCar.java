package lab18;

public class RaceCar extends Car {
	
	private String driver;
	private int turbo;

	public RaceCar(String model,String driver, int turbo) {
		super(model);
		this.turbo=turbo;
		this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
	
	//@overrides car
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		this.setSpeed(this.getSpeed()*turbo);
	}
	
	public String details() {
		return String.format("the car of model %s driven by %s has speed %d and turbo factor %d",this.getModel(),this.driver,this.getSpeed(),this.turbo);
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurbo() {
		return turbo;
	}

	public void setTurbo(int turbo) {
		this.turbo = turbo;
	}

}
