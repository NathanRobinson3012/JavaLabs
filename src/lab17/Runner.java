package lab17;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new Map(300,300);
		Submarine sub = new Submarine (10,10,map);
		System.out.println(sub.details());
		sub.move(10, 45);
		sub.dive(50);
		System.out.println(sub.details());
		
		Plane plane = new Plane (20,20,map);
		plane.rise(600);
		plane.move(200, 10);
		System.out.println(plane.details());

	}

}
