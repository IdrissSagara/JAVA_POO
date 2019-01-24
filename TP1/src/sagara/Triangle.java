package sagara;

public class Triangle {
	private Segment c1;
	private Segment c2;
	private Segment c3;
	
	
	
	public Triangle(Point p1, Point p2, Point p3) {
		c1 = new Segment(p1, p2);
		c2 = new Segment(p2, p3);
		c3 = new Segment(p3, p1);
		
	}
	
	public void setP1(Point p) {
		c1.setP1(p);
		c3.setP2(p);
	}
	public void setP2(Point p) {
		c2.setP2(p);
		c3.setP1(p);
	}
	public void setP3(Point p) {
		c3.setP1(p);
		c1.setP2(p);
	}
	
	public void name() {
		
	}

}
