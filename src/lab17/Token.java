package lab17;


public class Token {

	int x;
	int y;
	Map map;
	static double lim;
	
	public Token(int x, int y, Map map) {
		this.x=x;
		this.y=y;
		this.map=map;
		//this.lim=lim;
	}
	/*
	public Token(int x2, int y2, lab17.Map map2) {
		// TODO Auto-generated constructor stub
		this.x=x2;
		this.y=y2;
		this.map=map2;
	}*/

	public boolean move(int distance, double bearing) {
		
		if (distance<=lim) {
			
			int xChange = (int) (distance * Math.sin(Math.toRadians(bearing)));
			
			int yChange = (int) (distance * Math.cos(Math.toRadians(bearing)));
			
			if ((this.x+xChange<=this.map.getX() && this.x+xChange>=0 ) || (this.y+yChange<=this.map.getY()) && this.y+yChange>=0 ) {
				this.x+=xChange;
				this.y+=yChange;
				System.out.printf("the new location is (%d,%d)",this.x,this.y);
				return true;
			}
			
			else System.out.println("ERROR IN MOVE");
			return false;
		}
			
		else {
			System.out.println("OUT OF RANGE");
			return false;	
		}
		
	}
	
	
}
