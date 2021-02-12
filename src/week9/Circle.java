package week9;
public class Circle {
	Point center;
	double radius;

	public Circle(Point center, double radius) {
		this.center = new Point(center);
		this.radius = radius;
	}

	public Circle() {
		this.center = new Point();
		this.radius = 1;
	}

	public Circle(Circle c) {
		this.center = new Point(c.center);
		this.radius = c.radius;
	}

	public double Per() {
		return Math.PI * 2 * radius;
	}

	public double Area() {
		return Math.PI * radius * radius;
	}

	public void PointPosition(Point p) {
		double dist = p.distance(this.center);
		if (dist == this.radius) {
			System.out.println("On the circle");
		} else if (dist < this.radius) {
			System.out.println("Inside the circle");
		} else {
			System.out.println("Out of the circle");
		}
	}

	public void CircleRelation(Circle c) {
		double dist = c.center.distance(this.center);
		if (dist <= (c.radius + this.radius)) {
			System.out.println("Intersection");
		} else {
			System.out.println("No relation!");
		}
	}
}
