package week10;


public interface GeoShape {
	// given a point ot, return wehter ot is inside the shape or not
	public boolean contains(Point ot);

	// returns the center of mass
	public Point centerOfMass();

	// returns the area
	public double area();

	// returns the perimeter
	public double perimeter();

	public void move(Point vec);
	
	public GeoShape copy();
	public String toString();
}
