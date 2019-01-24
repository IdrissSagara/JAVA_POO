package sagara;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point origine = new Point(0,0);
		System.out.println("Origine:" + origine.toString());
		
		Point p = new Point(3.4 , 8.6);
		System.out.println("Point: " + p.toString());
		

		Point p2 = new Point(1.4 , 1.6);
		
		Segment s = new Segment(p, p2);
		System.out.println("Segment: "+ s.toString());

	}

}
