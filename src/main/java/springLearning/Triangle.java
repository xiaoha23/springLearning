package springLearning;

import java.util.List;

public class Triangle {

	private List<Point> points;
	
	
	
	/*private Point pointA;
	private Point pointB;
	private Point pointC;
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
	}*/
	
	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw() {
		points.forEach( point->{
			System.out.println("Point is " + point.toString());
		});
		/*System.out.println("PointA is " + pointA.toString());
		System.out.println("PointB is " + pointB.toString());
		System.out.println("PointC is " + pointC.toString());*/
	}
}
