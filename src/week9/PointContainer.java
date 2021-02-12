package week9;
public class PointContainer {
	Point[] container;
	int LastIndex = -1;

	public PointContainer(int maxSize) {
		container = new Point[maxSize];
	}

	public boolean Add(String name, double x, double y) {
		Point p = new Point(name, x, y);
		if (this.LastIndex == this.container.length - 1) {
			return false;
		}
		this.LastIndex++;
		this.container[this.LastIndex] = p;
		return true;
	}

	public boolean Add(Point p) {
		Point p1 = new Point(p);
		if (this.LastIndex == this.container.length - 1) {
			return false;
		}
		this.LastIndex++;
		this.container[this.LastIndex] = p1;
		return true;
	}

	public int Search(Point p) {
		for (int i = 0; i <= this.LastIndex; i++) {
			if (this.container[i].equals(p)) {
				return i;
			}
		}
		return -1;
	}

	public void Remove(Point p) {
		int j = Search(p);
		if (j != -1) {
			for (int i = j + 1; i <= LastIndex; i++) {
				container[i - 1] = container[i];
			}
			LastIndex--;
		}
	}

	public String toString() {
		String st = "[";
		for (int i = 0; i < LastIndex; i++) {
			st += container[i] + ", ";
		}
		if (LastIndex != -1) {
			st += container[LastIndex];
		}
		st += "]";
		return st;
	}
}
