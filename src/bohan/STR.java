package bohan;

import static org.junit.Assume.assumeNoException;

import java.util.ArrayList;
import java.util.Arrays;

public class STR {

	public static void main(String[] args) {
		String a = "+gelko";
		String[] p = { "aa", "b", "b", "ccc", "b", "b" };
		int[] h = { 111, 111, 0, 222, 333, 444, 555, 111, 777 };
		double aa=(0.4);
		gcd2(252,198);
	}
	
	public static void  gcd2(int a,int b) {
		int gcd=gcd(a,b);
		int max=Math.min(a, b);
		for(int i=0;i<max;i++) {
			for (int j = 0; j < max; j++) {
				if(a*i+b*j==gcd) {
					System.out.println(a+"*"+i+"+"+b+"*"+j+"="+gcd);
				}
				
			}
		}
		for(int i=0;i<max;i++) {
			for (int j = 0; ((-1)*(j)) < max; j--) {
				if(a*i+b*j==gcd) {
					System.out.println(a+"*"+i+" "+b+"*"+j+"="+gcd);
				}
				
			}
		}
		for(int i=0;-1*i<max;i--) {
			for (int j = 0; j < max; j++) {
				if(a*i+b*j==gcd) {
					System.out.println(a+"*"+i+"+"+b+"*"+j+"="+gcd);
				}
				
			}
		}
		for(int i=0;-1*i<max;i=i-1) {
			for (int j = 0; -1*j < max; j=j-1) {
				if(a*i+b*j==gcd) {
					System.out.println(a+"*"+i+" "+b+"*"+j+"="+gcd);
				}
				
			}
		}
		
		
		
	}
		
	
	
	
	
	
	public static int gcd(int a,int b) {
		if(a<b) {
			int tamp=b;
			b=a;
			a=tamp;		
		}
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
		
	}

	public static boolean bbo(int a) {
		return bbo1(a, 0);
	}

	public static boolean bbo1(int a, int b) {
		if (a == 1)
			return true;
		int c = (int)(Math.pow(a, (0.3+0.03)));
		if (c == b)
			return false;
		else {
		int aa = a-((int) (Math.pow(3, c)));
		return bbo1(aa, c);
		}

	}

	public static int[] Set(int[] a) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		boolean bo = true;
		for (int i = 0; i < a.length; i++) {
			bo = true;
			for (int j = 0; j < aa.size() && bo; j++) {
				if (aa.get(j).equals(a[i])) {
					bo = false;

				}

			}
			if (bo) {
				aa.add(a[i]);
			}
		}
		int[] ans = new int[aa.size()];
		for (int i = 0; i < aa.size(); i++) {
			ans[i] = aa.get(i);
		}

		return ans;

	}

	public static int[] stringArr2Set(int[] a) {
		String[] st = new String[a.length];
		String ss = "";
		for (int i = 0; i < a.length; i++) {
			st[i] = "" + a[i];
		}
		for (int i = 0; i < st.length; i++) {
			String s = st[i];
			st[i] = "";
			for (int j = i + 1; j < st.length; j++) {
				if (s.equals(st[j]))
					st[j] = "";
			}
			if (s != "")
				ss = ss + "," + s;

		}
		ss = ss.substring(1);
		st = ss.split(",");
		int[] ans = new int[st.length];
		for (int i = 0; i < st.length; i++) {
			ans[i] = Integer.parseInt(st[i]);
		}

		return ans;
	}

	public static String[] stringArr2Set(String[] a) {
		String ans = "";
		for (int i = 0; i < a.length; i++) {
			String st = a[i];
			a[i] = "";
			for (int j = i + 1; j < a.length; j++) {
				if (st.equals(a[j]))
					a[j] = "";
			}
			if (st != "") {
				ans = ans + "," + st;
			}

		}
		ans = ans.substring(1);

		return ans.split(",");

	}

	public static String str(String s) {
		int[] arr = new int['z'];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		int nam = 0;
		for (int i = 0; i < s.length(); i++) {
			if (nam < arr[s.charAt(i)]) {
				nam = arr[s.charAt(i)];
			}

		}
		String str = "";
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i)] == nam) {
				while (nam != 0) {
					a = a + s.charAt(i);
					nam--;

				}
				arr[s.charAt(i)] = 0;
			}
			if (0 < arr[s.charAt(i)]) {
				str = str + s.charAt(i);

			}

		}

		return str + a;
	}

	public static boolean sum4(String s) {
		int ans = 0;
		int ans1 = 0;
		if (s.charAt(0) != '-' && s.charAt(0) != '+') {
			s = "+" + s;
		}
		try {
			while (!s.isEmpty()) {
				if (s.charAt(0) == '-') {
					int a = sumg(s.substring(1));
					ans = ans - a;
					s = s.substring(1);
				}
				if (s.charAt(0) == '+') {
					int a = sumg(s.substring(1));
					ans = ans + a;
					s = s.substring(1);

				}
				if (s.charAt(0) == '=') {
					ans1 = sumg(s.substring(1));
					s = s.substring(1);

				}
				int p = Integer.parseInt("" + s.charAt(0));
				s = s.substring(1);

			}
			return ans == ans1;
		} catch (Exception e) {
			return false;
		}

	}

	public static int sumg(String s) {
		String st = "";
		if (s.isEmpty()) {
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				st = st + s.charAt(i);
			} else {
				break;
			}

		}

		return Integer.parseInt(st);
	}

	public static int sum2(String s) {
		int ans = sum3(s);
		if (s.charAt(0) == '-' || s.charAt(0) == '+') {
			s = s.substring(1);
		}
		while (!s.isEmpty()) {
			if (s.charAt(0) == '+') {
				int a = sum3(s.substring(1));
				ans = (ans + a);
			}
			if (s.charAt(0) == '-') {
				int a = sum3(s.substring(1));
				ans = (ans - a);

			}
			s = s.substring(1);

		}

		return ans;
	}

	public static int sum3(String s) {
		String st = "";
		if (s.isEmpty()) {
			return 0;
		}
		if (s.charAt(0) == '-') {
			st = st + "-";
			s = s.substring(1);
		}
		if (s.charAt(0) == '+') {
			st = st + "+";
			s = s.substring(1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				st = st + s.charAt(i);
			} else {
				break;
			}

		}

		return Integer.parseInt(st);
	}

	public static int sum1(String s) {
		if (s.isEmpty()) {
			return 0;
		}

		if (s.charAt(0) >= '0' && '9' >= s.charAt(0)) {
			String st = "";
			while (s.charAt(0) >= '0' && '9' >= s.charAt(0)) {
				st = st + s.charAt(0);
				s = s.substring(1);
				if (s.length() == 0) {
					return Integer.parseInt(st);
				}
			}
			int a = Integer.parseInt(st);
			if (s.charAt(0) == '+') {
				return a + sum1(s.substring(1));
			}
			if (s.charAt(0) == '-') {
				return a - sum1(s.substring(1));
			}

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

}
