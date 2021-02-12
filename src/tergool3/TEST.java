package tergool3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class TEST {

	public static void main(String[] args) {
		MyList<String> t = new MyList<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("4");
		// System.out.println(t);
		ArrayList<String> m = new ArrayList<String>();
		m.add("1");
		m.add("2");
		m.add("3");
		m.add("4");
		// System.out.println(m);
		myniv<String> g = new myniv<String>();
		g.add("6");
		g.add("4");
		g.add("5");
		g.add("8");
		myniv<String> gg = new myniv<String>();
		g.add("3");
		g.add("1");
		g.add("4");
		g.add("3");
		g.bbal();
		// System.out.println(""+String.valueOf(97));
		Random mm = new Random();
		// System.out.println(mm.nextInt(10));
		// System.out.println(j);
		//System.out.print("Hello\rCruel\rWorld\r")

		//char[] a= {'a','c','d','f','k'};
		
				
		

	
	
	

	public static String ss3(String a) {
		StringBuffer b = new StringBuffer(a);
		b.reverse();
		return b.toString();
	}

	public static int ss2(String a) {
		int tamp = 0;
		char ch = a.charAt(0);
		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) == ch)
				tamp++;

		return tamp;

	}

	public static int ss1(String a) {
		String[] b = a.split(" ");
		return b.length;
	}

	public static String ss(String a) {
		char[] tamp = a.toCharArray();
		Arrays.sort(tamp);
		return Arrays.toString(tamp);
	}

	public static boolean st(String str) {
		if (str.isEmpty() || str == null || str.length() == 1)
			return true;
		if (str.charAt(0) != str.charAt(str.length() - 1))
			return false;
		return st(str.substring(1, str.length() - 1));
	}

	public static boolean str(String str) {
		int a;
		if (str.isEmpty() || str == null)
			return true;

		for (int i = 0, j = str.length() - 1; i <= str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;

		}

		return true;
	}

	public static int re(String sr) {
		int ans = 0;
		String tamp = "";
		for (int i = 0; i < sr.length(); i++) {
			if (is(sr, sr.charAt(i)) >= 0) {
				tamp = tamp + is(sr, sr.charAt(i));
			}
		}

		return ans;
	}

	private static int is(String sr, char i) {
		int j = 0;
		try {
			return Integer.parseInt("" + i);

		} catch (Exception e) {
			return -1;
		}

	}

	public static int re(int[] a) {
		int i = 0;
		int ans = 0;
		while (arr(a, i) > 0) {
			ans += a[i];
			i++;
		}
		return ans;

	}

	private static int arr(int[] a, int i) {
		try {
			return a[i];
		} catch (Exception e) {
			return -1;
		}
	}

}
