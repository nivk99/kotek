package targol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.platform.engine.support.descriptor.FileSystemSource;

import week12.Node;

public class p1 {

	public static void main(String[] args) {
		// int[][] a = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 6, 5, 1, 2 }, { 7, 6, 5, 1 }
		// };
		// System.out.print(sameNumbers(a));
		int[] b = { 1, 2, 2, 2, 3, 2, 3, 2, 2, 3 };
		int[] a = { 2, 3 };
		String aa = "23";
		String bb = "43235";
		// System.out.println(isIn(a,b));
		LinkedListDouble p = new LinkedListDouble();
		LinkedListPoint<Point> o = new LinkedListPoint<Point>();
		o.add(new Point(5, 7));
		o.add(new Point(6, 7));
		o.add(new Point(7, 7));
		o.add(new Point(5, 7));
		o.add(new Point(4, 7));
		// System.out.println(o);

		ArrayList<Integer> h = new ArrayList<Integer>();
		LinkedList<String> list = new LinkedList<String>();
		// System.out.println(str("533&&*()"));
		int[][] aaa = { { 7, 10, 8 }, { 2, -3, 0 }, { 4, 1, 2 }, { 5, 6, 6 } };
		// System.out.println(horizontal1(aaa));

		int a5[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
		int b5[][] = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };
		
		
		System.out.println(gcd(60,61));
	}
	
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		if(a<b) {
			int t=b;
			b=a;
			a=t;
		}
		
		return gcd(b,a%b);
		
	}
	
	
	
	private static boolean bobo1(int a) {
	for (int i = 2; i < (int)(Math.sqrt(a)+1); i++) {
		if(a%i==0) { 
		return false;
		}
	}
	return true;
		
	}
		
	
		
		
	
	
	private static boolean bobo(int a) {
		int nam =1;
		for (int i = 2; i <= a; i++) {
			if(a%i!=0) {
				nam++;
			}
			
		}
		return nam==(a-1);
		
		
		
	}
	
	
	
	

	private static String help(String str) {
		if (str.isEmpty())
			return "";
		return (help(str.substring(1)) + str.charAt(0)) + " !" + (help(str.substring(1)) + str.charAt(0));

	}

	public static void i(int a) {
		boolean[] b = new boolean[a+1];
		for (int i = 2; i < b.length; i++) {
			b[i]=true;
		}
		for (int i = 2; i < 11; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(j%i==0) {
					b[j]=false;
				}
			}

		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]==true) {
			System.out.print(i);
			System.out.print(",");
			}
		}

	}

	public static int s1(int a) {
		String str = "" + a;
		str = str.replaceAll("0", "");
		StringBuffer b = new StringBuffer(str);
		b.reverse();
		return Integer.parseInt(b.toString());

	}

	public static int ss(int a) {
		char[] b = ("" + a).toCharArray();
		Arrays.sort(b);
		String ans = "";
		for (int i = 0; i < b.length; i++)
			ans += b[i];
		return Integer.parseInt(ans);
	}

	public static void fd(int a) {
		for (int i = 1; i < a; i++) {

			if (i * i == a) {
				System.out.println(i + "*" + i + "=" + a);
				return;
			}

		}

		System.out.println("No");
		return;
	}

	public static void spiral(int[][] a) {
		int len = a.length;
		for (int i = 0; i <= len / 2; i++)
			printRound(i, a);
	}

	public static void printRound(int k, int[][] a) {
		int len = a.length;
		for (int i = k; i < len - k; i++)
			System.out.print(a[k][i] + " ");
		for (int i = k + 1; i < len - k; i++)
			System.out.print(a[i][len - 1 - k] + " ");
		for (int i = k + 1; i < len - k; i++)
			System.out.print(a[len - 1 - k][len - 1 - i] + " ");
		for (int i = k + 1; i < len - k - 1; i++)
			System.out.print(a[len - 1 - i][k] + " ");
	}

	public static boolean horizontal1(int[][] a) {
		if (a.length % 2 != 0)
			return false;
		if (a.length == 0 || a == null)
			return true;
		int a1 = 0, a2 = 0;
		for (int i = 0; i < a[0].length; i++) {
			a1 = 0;
			a2 = 0;
			for (int j = 0, k = a.length / 2; j < a.length / 2; j++, k++) {
				a1 = a1 + a[j][i];
				a2 = a2 + a[k][i];
			}

			if (a1 != a2)
				return false;
		}
		return true;

	}

	public static String str(String str) {

		String ans = "";
		int[] a = new int[129];
		if (str.isEmpty() || str == null || str == "" || str == " ")
			return ans;
		for (int i = 0; i < str.length(); i++)
			a[str.charAt(i)]++;

		for (int j = 0; j < str.length(); j++) {
			if (a[str.charAt(j)] == 1)
				ans = ans + str.charAt(j);
		}

		return ans;

	}

	public static int bin(String str) {
		if (str.isEmpty() || str == null || str == "" || str == " ") {
			return -1;
		}
		int num = 0;
		for (int i = 0, a = str.length() - 1; i < str.length(); i++, a--) {

			if (!(str.charAt(i) == '1' || str.charAt(i) == '0'))
				return -1;
			else
				num = num + (int) (Math.pow(2, a)) * Integer.parseInt("" + str.charAt(i));

		}

		return num;

	}

	public static int bin1(String str) {
		if (str.isEmpty())
			return 0;
		if ((str.charAt(0) == '1' || str.charAt(0) == '0'))
			return Integer.parseInt("" + str.charAt(0)) * (int) Math.pow(2, str.length() - 1) + bin1(str.substring(1));
		else
			return -1;
	}

	public static int findmax(String str) {
		int ans = 1;
		for (int i = 0; i < str.length(); i++) {
			int j = i;
			int num = 0;
			while (j < str.length() && isnumric(str.charAt(j))) {
				num = num * 10;
				num = num + str.charAt(j) - '0';
				j++;
			}
			if (j != i) {
				if (num > ans) {
					ans = num;
				}
			}
		}

		return ans;
	}

	private static boolean isnumric(char ch) {
		return ((ch - '0') >= 0) && ((ch - '0') <= 9);
	}

	private static boolean simtrick(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (((i + 1) < a.length) && ((j + 1) < a[i].length)) {
					if (a[i][j] != a[i + 1][j + 1]) {

						return false;
					}
				}
			}
		}

		return true;

	}

	public static boolean horizontal(int[][] a) {
		int[][] a1 = new int[a.length / 2][a[0].length];
		int[][] a2 = new int[a.length / 2][a[0].length];
		for (int i = 0; i < a.length / 2; i++) {
			a1[i] = a[i];
			a2[i] = a[i + 2];
		}
		int aa1 = 0;
		int aa2 = 0;
		for (int j = 0; j < a1[0].length; j++) {
			aa1 = 0;
			aa2 = 0;
			for (int k = 0; k < a1.length; k++) {
				aa1 = aa1 + a1[k][j];
				aa2 = aa2 + a2[k][j];
			}
			if (aa1 != aa2) {

				return false;
			}

		}

		return true;

	}

	public static void reverese(LinkedListDouble list) {
		NodeD l = list.getTail();
		NodeD r = list.getHead();
		int i = list.size - 1;
		NodeD mm = l.getPrev();
		l.setPrev(null);
		l.setNext(mm);
		NodeD M = l;
		l = l.getNext();
		while (i != 0) {
			if (l.getPrev() == null) {
				NodeD m = l.getNext();
				l.setPrev(m);
				l.setNext(null);
				list.setHead(M);
				list.setTail(l);
				i--;
			} else {

				NodeD m1 = l.getNext();
				NodeD m2 = l.getPrev();
				l.setPrev(m1);
				l.setNext(m2);
				l = l.getNext();
				i--;
			}
		}

	}

	public static int isIn(int[] a, int b[]) {
		String stra = "";
		String strb = "";
		for (int i = 0; i < a.length; i++) {
			stra = stra + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			strb = strb + b[j];
		}
		return is(stra, strb);

	}

	public static int is(String a, String b) {
		if (b.indexOf(a) < 0) {
			return 0;
		}
		return 1 + is(a, "" + b.subSequence(b.indexOf(a) + 1, b.length()));

	}

	public static boolean sameNumbers(int[][] mat) {
		for (int i = mat[0].length - 2; i >= 0; i--) {
			if (!same1(mat, mat[0][i], i)) {
				return false;
			}
			for (int j = 1; j < mat.length - 1; j++) {
				if (!same2(mat, mat[j][0], j)) {
					return false;
				}

			}
		}
		return true;
	}

	public static boolean same2(int[][] mat, int num, int y) {
		int j = 1;
		for (int i = y + 1; i < mat.length; i++) {
			for (; j < mat[i].length;) {
				if (mat[i][j] != num) {
					return false;
				}
				j++;
				break;
			}
		}

		return true;
	}

	public static boolean same1(int[][] mat, int num, int y) {
		for (int i = 1; i < mat.length; i++) {
			y++;
			for (int j = y; j < mat[i].length; j++) {
				if (mat[i][j] != num) {
					return false;
				}
				break;
			}
		}

		return true;
	}

}
