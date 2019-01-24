package sagara;

public class Segment {
	private Point p1;
	private Point p2;
	
	public Segment(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public double getLongueur() {
		double val1 = ((p2.getX() - p1.getY()) * (p2.getX() - p1.getX()) );

		double val2 = ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()) );
		
		return Math.sqrt( val1 + val2);
		
	}

	public String toString() {
		
		String resultat;
		
		resultat = "["+ p1.toString() + " ; "+ p2.toString() + "]";
		
		return resultat;
	}
	
}























