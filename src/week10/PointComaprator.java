package week10;


import java.util.Comparator;

public class PointComaprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int ans = 0;
		if (o1 != null && o2 != null) {
			if (o1 instanceof Point && o2 instanceof Point) {
				Point p1 = (Point) o1, p2 = (Point) o2;
				double d1, d2;
				d1 = p1.distance();
				d2 = p2.distance();
				if (d1 > d2) {
					ans = 1;
				}
				if (d2 > d1) {
					ans = -1;
				}
			}
		}
		return ans;
	}

}
