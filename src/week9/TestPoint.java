package week9;
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		System.out.println(p1.quarter());
		Point p2 = new Point("B", 0.5, -5);
		Point p3 = new Point("B", 0.5, -5);
		System.out.println(p3.hashCode());
		System.out.println(p2.hashCode());
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
		//p1.translate(3, -2);
		//p1.name = "A_0";
		//System.out.println(p1);
		//System.out.println(p2.distance(p3));
		//System.out.println(p1.slope(p3));
		//System.out.println(p2.quarter());
		

	}

}
