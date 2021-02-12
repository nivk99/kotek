package week10;
public class Circle implements GeoShape {
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

	public boolean isInside(Point p) {
		double dist = p.distance(this.center);
		return (dist < this.radius);
	}

	public void CircleRelation(Circle c) {
		double dist = c.center.distance(this.center);
		if (dist <= (c.radius + this.radius)) {
			System.out.println("Intersection");
		} else {
			System.out.println("No relation!");
		}
	}

	@Override
	public boolean contains(Point ot) {
		// TODO Auto-generated method stub
		double dist = ot.distance(this.center);
		return (dist < this.radius);
	}

	@Override
	public Point centerOfMass() {
		// TODO Auto-generated method stub
		return new Point(center);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public void move(Point vec) {
		center.move(vec);

	}

	@Override
	public GeoShape copy() {
		// TODO Auto-generated method stub
		return new Circle(this);
	}

	public String toString() {
		return "[" + this.center + ", " + this.radius + "]";
	}
}
