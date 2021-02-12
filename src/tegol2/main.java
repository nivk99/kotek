package tegol2;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Arrays;


public class main {

	public static void main(String[] args)  {
		

		int[] a1 = {3, 5, 7, 8, 9, 13, 15, 17 };
		System.out.println(Arrays.binarySearch(a1, 0, a1.length, 4));
		
	
	}

	public static int sum1(String s) {
		if (s.isEmpty()) {
			return 0;
		}

		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			int nam = 0;
			while (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
				nam = nam + Integer.parseInt("" + s.charAt(0));
				s = s.substring(1);
			}
			return nam + sum1(s);

		}

		if (s.charAt(0) == '+') {
			return sum1(s.substring(1));
		}
		if (s.charAt(0) == '-') {
			return sum1(s.substring(1));
		}
		return 0;
	}

	public static int sum(String s) {
		String a[] = s.split("\\+");
		String b[] = s.split("\\-");

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int t = Integer.valueOf(a[i]);
			sum += t;
		}
		return sum;
	}

	public static int in(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				boolean bo = true;
				String st = "";
				for (int j = i; j < str.length() && bo; j++) {
					if (Character.isDigit(str.charAt(j))) {
						st = st + str.charAt(j);
						i = j;
					} else {
						bo = false;
					}
				}

				sum = sum + Integer.parseInt(st);

			}

		}

		return sum;

	}

	public static int[] in(int[] a, int[] b) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> bb = new ArrayList<Integer>();
		for (int i : a)
			aa.add(i);
		for (int i : b)
			bb.add(i);
		ArrayList<Integer> tamp = new ArrayList<Integer>(aa);
		aa.retainAll(bb);
		bb.retainAll(aa);
		tamp.clear();
		tamp.addAll(aa);
		// tamp.addAll(bb);
		int[] ans = new int[tamp.size()];
		int k = 0;
		for (int i : tamp) {
			ans[k] = i;
			k++;
		}
		Arrays.sort(ans);
		return ans;

	}

	public static int[] inver(int[] a, int[] b) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> bb = new ArrayList<Integer>();
		for (int i : a)
			aa.add(i);
		for (int i : b)
			bb.add(i);
		ArrayList<Integer> tamp = new ArrayList<Integer>(aa);
		aa.removeAll(bb);
		bb.removeAll(tamp);
		tamp.clear();
		tamp.addAll(aa);
		tamp.addAll(bb);
		int[] ans = new int[tamp.size()];
		int k = 0;
		for (int i : tamp) {
			ans[k] = i;
			k++;
		}
		Arrays.sort(ans);
		return ans;

	}
}
