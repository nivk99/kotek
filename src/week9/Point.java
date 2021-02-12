package week9;
public class Point {
	double x, y;
	String name;

	public Point() {
		this.x = 0;
		this.y = 0;
		this.name = "";
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

	public void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
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
}
