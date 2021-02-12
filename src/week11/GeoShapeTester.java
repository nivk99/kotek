package week11;
import java.util.Arrays;

public class GeoShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GeoShape p = new Point("A", 3, 4);
//		GeoShape c = new Circle();
//		System.out.println(p);
//		System.out.println(c);
//		GeoShape[] shapes = new GeoShape[7];
//		shapes[0] = new Point("A", 3, 5);
//		shapes[1] = new Point("B", -3, 5);
//		shapes[2] = new Point("C", 1, 2);
//		shapes[3] = new Point("D", 1, 0);
//		shapes[4] = new Point("E", 4, 2);
//		shapes[5] = new Circle(new Point("M1", 0.3, -2), 3);
//		shapes[6] = new Circle(new Point("M2", 3, 2), 5);
//		System.out.println(Arrays.toString(shapes));
//		PointCopmarator pctr=new PointCopmarator();
//		System.out.println(Arrays.toString(shapes));
//		Arrays.sort(shapes,pctr);
//		System.out.println(Arrays.toString(shapes));

		
		Point[] pts = new Point[5];
		pts[0] = new Point("A", 3, 5);
		pts[1] = new Point("B", -3, 5);
		pts[2] = new Point("C", 1, 2);
		pts[3] = new Point("D", 1, 0);
		pts[4] = new Point("E", 4, 2);
		PointComparator2 ptcr2=new PointComparator2(2);
		System.out.println(Arrays.toString(pts));
		Arrays.sort(pts,ptcr2);
		System.out.println(Arrays.toString(pts));

		
	}

}
