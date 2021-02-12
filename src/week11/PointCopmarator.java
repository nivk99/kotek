package week11;
import java.util.Comparator;

public class PointCopmarator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Point p1, p2;
		if (o1 != null) {
			if (o1 instanceof Point) {
				p1 = (Point) o1;
			} else if (o1 instanceof Circle) {
				p1 = ((Circle) o1).center;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
		if (o2 != null) {
			if (o2 instanceof Point) {
				p2 = (Point) o2;
			} else if (o2 instanceof Circle) {
				p2 = ((Circle) o2).center;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
		double d1, d2;
		d1 = p1.distance();
		d2 = p2.distance();
		return (d1 > d2) ? 1 : (d2 > d1 ? -1 : 0);

	}

}
