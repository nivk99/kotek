package week11;
public interface GeoShape {
//returns the perimeter of the shape.
	public double perimeter();

//returns the area of the shape.
	public double area();

	public void move(Point vec);

	public boolean contains(Point ot);

	public Point centerOfMass();

	public GeoShape copy();

}
