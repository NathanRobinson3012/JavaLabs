package lab17;

//import lab9.Map;

public class Plane extends Token {
	
	//static double lim = 360;
	int height = 0;

	public Plane(int x, int y, Map map) {
		super(x, y, map);
		this.lim=360;
		// TODO Auto-generated constructor stub
	}
	
	public void rise(int amount) {
		height += amount;
	}
	
	public void land() {
		height=0;
	}
	
	public String details() {
		return String.format("the plane is at position (%d,%d) with height %d", x,y,height);
	}

}
