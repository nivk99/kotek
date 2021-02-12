package week11;
public class Point implements GeoShape{//, Comparable<Point> {
	private double x, y;
	private String name;
	static int counter = 0;

	public Point(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
		counter++;
	}

	public Point() {
		this("", 0, 0);
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point(Point other) {
		this.name = other.name;
		this.x = other.x;
		this.y = other.y;
		Point.counter++;
	}

	public String toString() {
		return this.name + "(" + this.x + ", " + this.y + ")";
	}

	public double distance(Point p) {
		double dx, dy;
		dx = p.x - this.x;
		dy = p.y - this.y;
		return Math.sqrt(dx * dx + dy * dy);// square root
	}

	public double slope(Point p) {
		double dx, dy;
		dx = p.x - this.x;
		dy = p.y - this.y;
		return dy / dx;
	}

	public double Angle_Deg() {
		return Math.atan(this.y / this.x) * 180 / Math.PI;
	}

	public static void printCounter() {
		System.out.println(counter);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(Point vec) {
		// TODO Auto-generated method stub
		this.x += vec.x;
		this.y += vec.y;
	}

	@Override
	public boolean contains(Point ot) {
		// TODO Auto-generated method stub
		return (this.x == ot.x) && (this.y == ot.y);
	}

	@Override
	public Point centerOfMass() {
		// TODO Auto-generated method stub
		return new Point(this);
	}

	@Override
	public Point copy() {
		// TODO Auto-generated method stub
		return new Point(this);
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

//	@Override
//	public int compareTo(Point ot) {
//		double d1, d2;
//		d1 = this.distance();
//		d2 = ot.distance();
//		if (d1 > d2) {
//			return 1;
//		}
//		if (d1 < d2) {
//			return -1;
//		}
//		return 0;
//	}
}
