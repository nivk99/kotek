package week11;
import java.util.Comparator;

public class PointComparator2 implements Comparator<Point> {
	private int flag;// 0 - distance from (0,0), 1- x, 2-y

	public PointComparator2(int flag) {
		this.flag = flag;
	}

	@Override
	public int compare(Point o1, Point o2) {
		if (flag == 0) {
			double d1 = o1.distance();
			double d2 = o2.distance();
			if (d1 > d2)
				return 1;
			if (d2 > d1)
				return -1;
			return 0;
		} else if (flag == 1) {
			if (o1.getX() > o2.getX()) {
				return 1;
			}
			if (o1.getX() < o2.getX()) {
				return -1;
			}
			return 0;
		}else if(flag == 2) {
			if (o1.getY() > o2.getY()) {
				return 1;
			}
			if (o1.getY() < o2.getY()) {
				return -1;
			}
			return 0;
			
		}else {
			return 0;
		}

	}

}
