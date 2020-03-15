package by.htp.katokoleg.simpleclassandobject.task7;

public class Main {

	public static void main(String[] args) {
		
		Point pointA = new Point(10,2);
		Point pointB = new Point(3,4);
		Point pointC = new Point(5,10);
		
		Triangle tri = new Triangle(pointA, pointB, pointC);
		
		TriangleLogic tl = new TriangleLogic();
		
		System.out.println("Perimetr: " + tl.findPerimetr(pointA, pointB, pointC));
		System.out.println("Square: " + tl.findSquare (pointA, pointB, pointC));
		System.out.println("Centre of Heaviness: " + tl.findCentreOfHeaviness(pointA, pointB, pointC));
		
	
		

	}

}
