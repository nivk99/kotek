package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class i {

	public static void main(String[] args) {
		int[][] a = {{1,3,7},{4,5,8},{7,2,6}};
		System.out.print(sor(a));

	}
	public static double gg(int n) {
		if(n==0) {
			return 0;
		}
		return (n/(Math.pow(2, n)))+gg(n-1);
	}
	public static void marcin(int n) {
		if(n==1) {
			System.out.print((int)Math.pow(2, n)-1);
			return;
		}
		marcin(n-1);
		System.out.print(" "+((int)Math.pow(2, n)-1));
	}
	
	public static boolean sor(int[][] a) {
		if(a==null||a.length==0||(a.length!=a[0].length)){
			return false;
			
		}
		return lift(a)&&reat(a);
		
	}
	
	
	
    private static boolean lift(int[][] a) {
    	
    	for(int j=0;j<a.length-1;j++) {
    		if(a[j][j]>a[j+1][j+1]) {
    			return false;
    		    
    		}
    	}
    	
    	return true;
    
	}
	private static boolean reat(int[][] a) {
		for(int j=a.length-1,k=0;k<a.length-1;j--,k++) {
			if(a[k][j]>a[k+1][j-1]) {
				return false;
			}
			return true;
			
		}
		
		
		
		
		
		
		return false;
	}
	public static void transpose(int[][]mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[0].length; j++) {
                //swap:
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }        
    }

	
	
	
	
	
	public static int sub(int[] a) {
		String ans="";
		for(int i:a) {
			ans+=a[i];
		}
		String[] tamp=ans.split("1");
		int an=0;
		for(int j=0;j<tamp.length;j++) {
			if(tamp[j].length()>an) {
				an=tamp[j].length();
			}
			
		}
		
		return an;
		
	}
	
	
	
	public static char is1(String str) {
		int[] a=new int['z'];
		if(str.length()==0||str==null||str==""||str==" ") {
			return '0';
		}
		for(int i=0;i<str.length();i++) {
			a[str.charAt(i)]++;	
		}
		for(int i=0;i<str.length();i++) {	
			
			if(a[str.charAt(i)]==1) {
				return str.charAt(i);
			}
		}
		
		return '0';
		
		
	}
	
	

	public static void is(int[][] a) {
		for (int i = 0; i < a.length-1; i++) {
			int[] b = new int[a.length - 1];
			int[] c = new int[a.length - 1];
			for (int j = 1; j < a[i].length; j++) {
				b[j - 1] = a[i][j];
				c[j-1]=a[j][i];
			}
			for (int k = 1; k < a.length; k++) {
				a[k][i] = b[k - 1];
				a[i][k]=c[k - 1];
			}

		}

	}

	private static boolean isp(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

	private static String isANumber(String s) {
		if (Pattern.matches("^[+-]?\\d+$", s))
			return "int";
		if (Pattern.matches("^([+-]?\\d*\\.?\\d*)$", s))
			return "double";
		return "not a number";
	}

	public static String isnum(String str) {
		if (str == null || str.length() == 0) {
			return "nun a number";
		}
		if (!num(str)) {
			return "not a number";
		}
		if (str.indexOf('.') >= 0) {
			return "double";
		}

		return "int";

	}

	private static boolean num(String str) {
		boolean ans;
		if ((str.charAt(0) >= '0' && '9' >= str.charAt(0)) || str.charAt(0) == '+' || str.charAt(0) == '-'
				|| str.charAt(0) == '.') {
			ans = str.charAt(0) == '.';
			for (int i = 1; i < str.length(); i++) {
				if (ans) {
					if ((str.charAt(i) >= '0' && '9' >= str.charAt(i))) {
						continue;
					} else {
						return false;
					}

				}
				if (!ans) {
					if ((str.charAt(i) >= '0' && '9' >= str.charAt(i)) || str.charAt(i) == '.') {
						ans = str.charAt(i) == '.';
						continue;
					} else {
						return false;
					}

				}

			}

		} else {
			return false;
		}
		return true;
	}

	public static boolean is(int[] a, int[] b) {
		if (a.length != b.length || a == null || b == null) {
			return false;
		}
		if ((a.length == 0 && b.length == 0) || (a == null && b == null)) {
			return true;
		}
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> bb = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			aa.add(a[i]);

		}
		for (int j = 0; j < b.length; j++) {
			bb.add(b[j]);

		}
		int s = aa.size();
		aa.retainAll(bb);
		return s == aa.size();
	}

	public static boolean is(double[] a) {
		int len;
		if (a.length % 2 == 0) {
			len = a.length / 2;
		} else {
			int num = a.length + 1;
			len = num / 2;
		}
		for (int i = 0, j = 1; i < len; i++, j++) {
			if (a[i] != a[a.length - j]) {

				return false;
			}
		}

		return true;

	}

}
