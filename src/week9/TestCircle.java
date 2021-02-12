package week9;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		Point center2=new Point("C2",4,5);
		Circle c2 = new Circle(center2,5);
		center2.x=44;//does not change the center of c2
		System.out.println(c2.center);
		c1.PointPosition(new Point("s",1,0));
	}

}
