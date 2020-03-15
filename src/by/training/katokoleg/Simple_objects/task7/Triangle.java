package by.htp.katokoleg.simpleclassandobject.task7;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	/*public Triangle (int a,int b,int c,int d,int e,int f) {
		pointA.setX(a);
		pointA.setY(b);
		pointB.setX(c);
		pointB.setY(d);
		pointC.setX(e);
		pointC.setY(f);
	}*/

	public Triangle (Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	
}
