package lab19;

public abstract class Bird extends Animal implements Consumable {

	String name;
	public Bird(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.type=AnimalType.Bird;
	}

}
