package lab17;

//import lab9.Map;

public class Submarine extends Token {
	//static double lim = 15;
	int depth=0;

	public Submarine(int x, int y, Map map) {
		super(x, y, map);
		this.lim=15;
		//this.depth=depth;
		
	}
	
	/*public Submarine(int x, int y, lab17.Map map, int depth2) {
		// TODO Auto-generated constructor stub
		super(x,y,map);
	}*/

	public void dive(int amount) {
		depth += amount;
	}
	public void surface() {
		depth=0;
	}
	public String details() {
		return String.format("the sub is at position(%d,%d) at depth %d",x,y,depth);
	}

}
