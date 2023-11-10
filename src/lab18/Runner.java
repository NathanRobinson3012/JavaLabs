package lab18;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car[] vehicles = {new Car("car 1"),new Car("car2"),new RaceCar("Car 3","Me",5),new RaceCar("Car 4","You",3)};
		
		for(Car c : vehicles) {
			c.to60();
			c.accelerate(2);
			System.out.println(c.details());
		}

	}

}
