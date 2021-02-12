package week10;


public class Point implements GeoShape {
	private double x, y;
	private String name;

	public Point() {
		this.x = 0;
		this.y = 0;
		this.name = "";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getName() {
		return name;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point(String name, double x, double y) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
		this.name = p.name;
	}

	public String toString() {
		return this.name + "(" + this.x + ", " + this.y + ")";
	}

	public double distance(Point p) {
		double dx, dy;
		dx = p.x - this.x;
		dy = p.y - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double slope(Point p) {
		double dx, dy;
		dx = p.x - this.x;
		dy = p.y - this.y;
		return dy / dx;
	}

	public int quarter() {
		if (x > 0 && y > 0) {
			return 1;
		} else if (x > 0 && y < 0) {
			return 4;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else {
			return 0;
		}
	}

	public boolean equals(Point p) {
		return ((p.x == this.x) && (p.y == this.y));
	}

	@Override
	public boolean contains(Point ot) {
		return (this.x == ot.x) && (this.y == ot.y);

	}

	@Override
	public Point centerOfMass() {
		return new Point(this);
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(Point vec) {
		this.x += vec.x;
		this.y += vec.y;
	}

	@Override
	public GeoShape copy() {
		// TODO Auto-generated method stub
		return new Point(this);
	}

	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public boolean equals(Object p) {
		if (p == null || !(p instanceof Point)) {
			return false;
		}

		Point ptr = (Point) p;
		return (this.x == ptr.x) && (this.y == ptr.y);
	}
}
