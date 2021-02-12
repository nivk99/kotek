package week12;

import java.util.ArrayList;
import java.util.Arrays;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;
import tegol2.MyLinkedList;

public class TestNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node p1, p2, p3;
		p1 = new Node(3, null);
		p2 = new Node(-10, null);
		p3 = new Node(11, null);
		System.out.println(p1);
		p1.setNext(p2);
		System.out.println(p1.getNext());
		p2.setNext(p3);
		System.out.println(p1.getNext().getNext());
		System.out.println(p2.getNext().getNext());
		Node p4 = new Node(50, null);
		p3.setNext(p4);
		System.out.println(dd("fgdfdg56476gfhf43ghf99hgfhf9"));

	}

	public static int dd(String str) {
		String[] a = str.split("[^0-9]+");
		int ans = 0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("")) {
				a[i] = null;
			}
			if (a[i] != null) {
				if (ans < Integer.parseInt(a[i])) {
					ans = Integer.parseInt(a[i]);
				}
			}

		}

		return ans;
	}

	public static boolean s(LinkedList a) {
		Node p = a.getHead();
		ArrayList<Integer> aa = new ArrayList<Integer>();
		while (p.getNext() != null) {
			aa.add(p.hashCode());
			p = p.getNext();
			if (aa.contains(p.hashCode()))
				return false;
		}

		return true;

	}

}