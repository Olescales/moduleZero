package by.htp.katokoleg.simpleclassandobject.task7;

public class TriangleLogic {

	public double findSide (Point pointA, Point pointB) {
		double side;
		side = Math.hypot(pointA.getX() - pointB.getX(), pointA.getY() - pointB.getY());
		return side;
	}
	
	public double findPerimetr (Point pointA, Point pointB, Point pointC) {
		double side1;
		double side2;
		double side3;
		
		double perimetr;
		
		side1 = Math.hypot(pointA.getX() - pointB.getX(), pointA.getY() - pointB.getY());
		side2 = Math.hypot(pointA.getX() - pointC.getX(), pointA.getY() - pointC.getY());
		side3 = Math.hypot(pointB.getX() - pointC.getX(), pointB.getY() - pointC.getY());
		 
		perimetr = side1 + side2 + side3;
		
		return perimetr;
	}
	
	public double findSquare (Point pointA, Point pointB, Point pointC) {
	
		double square;
		double side1;
		double side2;
		double side3;
		
		double semiper;
		
		side1 = Math.hypot(pointA.getX() - pointB.getX(), pointA.getY() - pointB.getY());
		side2 = Math.hypot(pointA.getX() - pointC.getX(), pointA.getY() - pointC.getY());
		side3 = Math.hypot(pointB.getX() - pointC.getX(), pointB.getY() - pointC.getY());
		 
		semiper = (side1 + side2 + side3) / 2;
		
		square = Math.sqrt(semiper * (semiper - side1) * (semiper - side2) * (semiper - side3));
		return square;
	}
	
	public Point findCentreOfHeaviness (Point pointA, Point pointB, Point pointC) {
		
		Point pointD = new Point();
		double centreX;
		double centreY;
		
		centreX = (pointA.getX() + pointB.getX() + pointC.getX()) / 3;
		centreY = (pointA.getY() + pointB.getY() + pointC.getY()) / 3;
		 
		pointD.setX(centreX);
		pointD.setY(centreY);
		
		return pointD;
	}
	
}
