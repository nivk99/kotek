package week11;

public class Circle implements GeoShape {
	Point center;
	double radius;

	public Circle() {
		this.center = new Point();
		this.center.setName("O");
		
		this.radius = 1;
	}

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Circle other) {
		this.center = new Point(other.center);
		this.radius = other.radius;
	}

	public String toString() {
		return "[center: " + this.center + ", radius: " + this.radius + "]";
	}



	public void PointRelation(Point p) {
		double dist = p.distance(this.center);
		if (dist > this.radius) {
			System.out.println("The point " + p + " is outside the circle!");
		} else if (dist < this.radius) {
			System.out.println("The point " + p + " is inside the circle!");
		} else {
			System.out.println("The point " + p + " is on the circle!");
		}
	}

	public void CircleRelation(Circle c) {
		double dist = c.center.distance(this.center);
		double RadiiSum = c.radius + this.radius;
		if (dist > RadiiSum) {
			System.out.println("No relation between " + c + " and " + toString());
		} else if (dist < RadiiSum) {
			System.out.println(c + " and " + toString() + " are intersected.");
		} else {
			System.out.println(c + " and " + toString() + " are tangent to eachother.");
		}
	}



	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public void move(Point vec) {
		// TODO Auto-generated method stub
		this.center.move(vec);
		
	}

	@Override
	public boolean contains(Point ot) {
		// TODO Auto-generated method stub
		double dist = ot.distance(this.center);

		return (dist < radius);
	}

	@Override
	public Point centerOfMass() {
		// TODO Auto-generated method stub
		return new Point(center);
	}

	@Override
	public Circle copy() {
		// TODO Auto-generated method stub
		return new Circle(this);
	}
}
