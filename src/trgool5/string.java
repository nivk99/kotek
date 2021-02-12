package trgool5;

import static org.junit.Assume.assumeNoException;

import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		int[][] mat1 = { { 3, 5, 7, 5 }, { -4, 2, 10, 11 }, { 9, -50, 3, 60 } };
		int[][] matOut1 = { { 3, 18, 33, 28 }, { -31, -17, 43, 85 }, { -52, 20, 33, 24 } };
		int[][] aa = { { 1, 2, 3, 7 }, { 4, 1, 2, 3 }, { 5, 4, 1, 2 }, { 6, 5, 4, 1 } };
		String a = "bmbmbbbfmffffhhmhmhhmggsmdlflmsdmjflddmd";
		int[][] b={{1,2,3,4},{5,1,2,3},{6,5,1,2},{7,8,5,1}};
		System.out.println(Arrays.deepToString(b));
	}
	
	public static void revers(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				int b=a[i+1][j+1];
				a[i+1][j+1]=a[i][j];
				
				
				
			}
			
		}
		
		
		
		
	}
	
	
	

	public static boolean sam(int[][] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				if (a[i][j] != a[i + 1][j + 1])
				return false;
			}
		}

		return true;
	}

	public static boolean isis(String str, int a) {
		if (str.length() / 2 < a) {
			return false;
		}
		if (a == 0) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return isis(str.substring(1, str.length() - 1), a - 1);
		else
			return false;
	}

	public static long sor(long lo) {
		if (lo == 0)
			return 0;
		String str = "" + lo;
		char[] cg = str.toCharArray();
		Arrays.sort(cg);
		String b = "";
		for (int i = 0; i < cg.length; i++)
			if (cg[i] != '0')
				b += cg[i];
		if (b.length() == 0)
			return 0;

		return Integer.parseInt(b);

	}

	public static int[][] arr() {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter String");
		String ss = c.next();
		String[] str = ss.split(",");
		int[][] ans = new int[str.length][];
		for (int j = 0; j < str.length; j++) {
			String b1 = str[j];
			int a1 = Integer.parseInt("" + b1.charAt(0));
			int a2 = (Integer.parseInt("" + b1.charAt(2)));
			int[] f = new int[a1];
			for (int k = 0; k < f.length; k++)
				f[k] = a2;

			ans[j] = Arrays.copyOfRange(f, 0, f.length);

		}
		for (int a[] : ans) {
			System.out.println(Arrays.toString(a));
		}
		return ans;

	}

	public static char ch(String str, int a) {
		int[] arr = new int[129];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a)
				return (char) (i);

		}

		return '?';
	}

	public static boolean arr1(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (bo(a, i + 1, j + 1)) {
					if (a[i][j] != a[i + 1][j + 1])
						return false;
					else
						continue;
				} else
					continue;
			}

		}

		return true;

	}

	public static int[][] arr(int[][] a) {
		int[][] ans = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sum = 0;
				if (bo(a, i, j + 1))
					sum = sum + a[i][j + 1];
				if (bo(a, i, j - 1))
					sum = sum + a[i][j - 1];
				if (bo(a, i + 1, j))
					sum = sum + a[i + 1][j];
				if (bo(a, i - 1, j))
					sum = sum + a[i - 1][j];
				if (bo(a, i - 1, j + 1))
					sum = sum + a[i - 1][j + 1];
				if (bo(a, i - 1, j - 1))
					sum = sum + a[i - 1][j - 1];
				if (bo(a, i + 1, j + 1))
					sum = sum + a[i + 1][j + 1];
				if (bo(a, i + 1, j - 1))
					sum = sum + a[i + 1][j - 1];
				ans[i][j] = sum;

			}
		}

		return ans;

	}

	private static boolean bo(int[][] a, int i, int j) {
		try {
			int b = a[i][j];
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String s(String str, String str2) {
		if (str.isEmpty())
			return str2;
		if (!str2.contains("" + str.charAt(0)))
			return s(str.substring(1), str2 + str.charAt(0));

		else
			return s(str.substring(1), str2);

	}

	public static String sortstring1(String str) {
		int[] a = new int['9' + 1];
		char ch;
		int b;
		for (int i = 0; i < str.length(); i++)
			a[str.charAt(i)]++;
		str = "";
		for (int j = 0; j < a.length; j++) {
			if (a[j] > 0) {
				b = a[j];
				while (b != 0) {
					ch = (char) (j);
					str += ch;
					b--;
				}
			}
		}

		return str;
	}

	public static String sortstring(String str) {
		String[] tamp = str.split("");
		Arrays.sort(tamp);
		int i = 0;
		str = "";
		while (i < tamp.length) {
			str += tamp[i];
			i++;
		}

		return str;
	}

	public static int sortstring(String str, char ch) {
		if (str.isEmpty() || str == null || str == " " || str == "" || !Character.isDefined(ch))
			return 0;
		if (str.charAt(0) == ch)
			return 1 + sortstring(str.substring(1), ch);
		else
			return sortstring(str.substring(1), ch);

	}

	public static String string(String str) {
		String ans = ("" + str.charAt(0)).toUpperCase() + str.substring(1);
		return ans;
	}

	public static boolean string1(String str) {
		if (str.isEmpty())
			return true;
		if (str.charAt(0) >= 'a' && 'z' >= str.charAt(0))
			return string1(str.substring(1));
		else
			return false;

	}

	public static boolean string1(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		if (str1.isEmpty() && str2.isEmpty())
			return true;
		if (str1.contains("" + str2.charAt(0)))
			return string1(str1.substring(0, str1.indexOf(str2.charAt(0)))
					+ str1.substring(str1.indexOf(str2.charAt(0)) + 1, str1.length()), str2.substring(1));

		return false;
	}

}
