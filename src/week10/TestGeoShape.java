package week10;


import java.util.Arrays;

public class TestGeoShape {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeoShape[] shapes = new GeoShape[5];
		shapes[0] = new Point("A", 3, 5);
		shapes[1] = new Circle(new Point("B", -5, 6), 5.6);
		shapes[2] = new Point("C", -3, 59);
		shapes[3] = new Circle(new Point("O_1", 3, 4), 3);
		shapes[4] = new Circle();
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		System.out.println(shapes[0].equals(shapes[1]));
		Arrays.sort(shapes,new PointComaprator());
		System.out.println(Arrays.toString(shapes));
	}

}
